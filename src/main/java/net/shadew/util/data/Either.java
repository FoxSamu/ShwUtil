/*
 * Copyright (c) 2020 Shadew
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.shadew.util.data;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import net.shadew.util.contract.NotNull;
import net.shadew.util.contract.Nullable;
import net.shadew.util.contract.Validate;

/**
 * An 'either' is a data type that holds, as the name already says, <i>either</i> one element or another. Eithers have
 * either a left or a right element, but not both (which is a pair instead) or none (which is instead comparable to
 * {@link Unit}). Eithers can become applicable when a certain method can return two types (which is not directly
 * allowed by the Java language other than making the method return {@link Object}). I.e. when a method can either
 * return a string or an integer, one could simply do:
 * <pre>public Object returnEitherStringOrInt();</pre>
 * The signature of this method is however very unclear. A documentation comment is required to make obvious that this
 * method only returns only ints or strings. Using an {@code Either}, one can do:
 * <pre>public Either&lt;String, Integer&gt; returnEitherStringOrInt();</pre>
 * The signature of this method is clear: it can be clearly derived from the return type that it returns either a string
 * or an integer.
 * <p>
 * Like with the contract of {@linkplain Pair pairs}, eithers can contain a null value on neither of the sides, and to
 * allow nullity on any of its values it should be wrapped into an {@link Optional}.
 * </p>
 * Moreover, an either has the following contract:
 * <ul>
 * <li>An either has exactly one element, of which the type is either the first or the second type.</li>
 * <li>The two types of an either may be completely independent of eachother.</li>
 * <li>The element in an either is never null.</li>
 * <li>An either is immutable, but its element may be mutable.</li>
 * </ul>
 * The {@code Either} class is declared as abstract, but must not (and cannot because of the private constructor) be
 * implemented. The class is only overridden by two internal classes which are an implementation for first and second
 * types specifically.
 * <p>
 * One can see the {@code Either} as two {@link Optional}s of which their availability is mutually exclusive: the first
 * optional is not empty if and only if the second one is empty, and the second optional is not empty if and only if
 * the first one is empty. For each {@code Either e} holds: {@code e.isFirst() ^ e.isSecond() == true}.
 * </p>
 *
 * @param <F> The first type of the either
 * @param <S> The second type of the either
 */
public abstract class Either<F, S> {
    private Either() {
    }

    /**
     * Returns the element of this either as the first type. This fails if the element is not of the first type. One
     * should usually check {@link #isFirst()} before getting the element this way.
     *
     * @return The element of this either as the first type
     *
     * @throws NoSuchElementException If the element is of the second type
     */
    @NotNull
    public abstract F first();

    /**
     * Returns the element of this either as the second type. This fails if the element is not of the second type. One
     * should usually check {@link #isSecond()} before getting the element this way.
     *
     * @return The element of this either as the second type
     *
     * @throws NoSuchElementException If the element is of the first type
     */
    @NotNull
    public abstract S second();

    /**
     * Returns whether the element in this either is of the first type and whether {@link #first()} can safely be
     * called.
     *
     * @return True when the element is of the first type, false otherwise.
     */
    public abstract boolean isFirst();

    /**
     * Returns whether the element in this either is of the second type and whether {@link #second()} can safely be
     * called.
     *
     * @return True when the element is of the second type, false otherwise.
     */
    public abstract boolean isSecond();

    /**
     * Returns the element as the first type wrapped in an {@link Optional}, or an empty optional when the element is of
     * the second type.
     *
     * @return Optionally the element as the first type, if available
     */
    @NotNull
    public abstract Optional<F> optFirst();

    /**
     * Returns the element as the second type wrapped in an {@link Optional}, or an empty optional when the element is
     * of the first type.
     *
     * @return Optionally the element as the second type, if available
     */
    @NotNull
    public abstract Optional<S> optSecond();

    /**
     * Returns the element as the first type, or null if the element is of the second type.
     *
     * @return The element as the first type, if available
     */
    @Nullable
    public abstract F firstOrNull();

    /**
     * Returns the element as the second type, or null if the element is of the first type.
     *
     * @return The element as the second type, if available
     */
    @Nullable
    public abstract S secondOrNull();

    /**
     * Converts the element of an either into one covering type, using the given mapping functions. This method returns
     * exactly what these mapping functions return, so if one of these functions returns null this method may also
     * return null. The functions may safely assume that the passed arguments are never null, since an either never has
     * a null element.
     *
     * @param funcF The function used to map the element if it is of the first type
     * @param funcS The function used to map the element if it is of the second type
     * @return The mapped (merged) value
     *
     * @throws NullPointerException When the first or the second function, or both, are null
     */
    public abstract <T> T merge(@NotNull Function<? super F, ? extends T> funcF, @NotNull Function<? super S, ? extends T> funcS);

    /**
     * Returns an either with a new first type, and maps the element of this either if necessary (i.e. when it's the
     * first type). As of the contract of an either, the function may assume the passed argument is never null, and it
     * may not return null. Note that this can return itself (but cast to the new generic types) when the element is of
     * the second type.
     *
     * @param func The function used to map the first value if necessary
     * @return A new either with a new first type
     *
     * @throws NullPointerException When the function is null, or when it returned null
     */
    @NotNull
    public abstract <T> Either<T, S> mapFirst(@NotNull Function<? super F, ? extends T> func);

    /**
     * Returns a new either with a new second type, and maps the element of this either if necessary (i.e. when it's the
     * second type). As of the contract of an either, the function may assume the passed argument is never null, and it
     * may not return null. Note that this can return itself (but cast to the new generic types) when the element is of
     * the first type.
     *
     * @param func The function used to map the second value if necessary
     * @return A new either with a new second type
     *
     * @throws NullPointerException When the function is null, or when it returned null
     */
    @NotNull
    public abstract <T> Either<F, T> mapSecond(@NotNull Function<? super S, ? extends T> func);

    /**
     * Returns a new either with new types, and maps the element accordingly using the function appropriate to its side.
     * As of the contract of an either, the functions may assume the passed argument is never null, and they may not
     * return null.
     *
     * @param funcF The function used to map the element if it is of the first type
     * @param funcS The function used to map the element if it is of the second type
     * @return The new either with new types
     */
    @NotNull
    public abstract <T, U> Either<T, U> map(@NotNull Function<? super F, ? extends T> funcF, @NotNull Function<? super S, ? extends U> funcS);

    /**
     * Returns a either with a new first type and the same second type, using the given value when the element of this
     * either is of the first type and using the element of this either when that element is of the second type. As of
     * the contract of an either, the new value must not be null (even if the either is of the second type). Note that
     * this can return the same instance when the element is of the second type.
     *
     * @param first A new element of the new first type to be used when this either's element is of the first type
     * @return The either with a new first type
     */
    @NotNull
    public abstract <T> Either<T, S> withFirst(@NotNull T first);

    /**
     * Returns a either with a new second type and the same first type, using the given value when the element of this
     * either is of the second type and using the element of this either when that element is of the first type. As of
     * the contract of an either, the new value must not be null (even if the either is of the first type). Note that
     * this can return the same instance when the element is of the first type.
     *
     * @param second A new element of the new second type to be used when this either's element is of the second type
     * @return The either with a new second type
     */
    @NotNull
    public abstract <T> Either<F, T> withSecond(@NotNull T second);

    /**
     * Returns a new either with the same value but with the types of this either swapped, meaning that the returned
     * either's first type is the second type of this either, and vice versa.
     *
     * @return A new, reversed either
     */
    @NotNull
    public abstract Either<S, F> reverse();

    /**
     * Calls the given consumer function when this either is of the first type, passing the value as the first type to
     * the consumer. As of the contract of an either, the value passed to the consumer is never null.
     *
     * @param consumer The consumer to call when this either's value is of the first type
     * @throws NullPointerException When the specified consumer is null
     */
    public abstract void ifFirst(@NotNull Consumer<? super F> consumer);

    /**
     * Calls the given consumer function when this either is of the second type, passing the value as the second type to
     * the consumer. As of the contract of an either, the value passed to the consumer is never null.
     *
     * @param consumer The consumer to call when this either's value is of the second type
     * @throws NullPointerException When the specified consumer is null
     */
    public abstract void ifSecond(@NotNull Consumer<? super S> consumer);

    /**
     * Calls the first consumer function when this either is of the first type or the second consumer function when this
     * either is of the second type, passing the argument to the appropriate consumer in the appropriate type. As of the
     * contract of an either, the value passed to any consumer is never null.
     *
     * @param consumerF The consumer to call when this either's value is of the first type
     * @param consumerS The consumer to call when this either's value is of the second type
     * @throws NullPointerException When any of the specified consumers is null
     */
    public abstract void ifElse(@NotNull Consumer<? super F> consumerF, @NotNull Consumer<? super S> consumerS);

    /**
     * Returns the element of this either as the first type, or returns the given value if the element is of the second
     * type. This method can (but does not always) return null if and only if the given fallback value is also null.
     * When the given fallback value is null, this method is equivalent to {@link #firstOrNull()}.
     *
     * @param other The fallback value if this either is of the second type
     * @return The element of this either as the first type when that element is of the first type, or the fallback
     *     value if not
     */
    public abstract F firstOrElse(@Nullable F other);

    /**
     * Returns the element of this either as the second type, or returns the given value if the element is of the first
     * type. This method can (but does not always) return null if and only if the given fallback value is also null.
     * When the given fallback value is null, this method is equivalent to {@link #secondOrNull()}.
     *
     * @param other The fallback value if this either is of the first type
     * @return The element of this either as the second type when that element is of the second type, or the fallback
     *     value if not
     */
    public abstract S secondOrElse(@Nullable S other);

    /**
     * Returns the element of this either as the first type, or returns the value supplied by the given supplier if the
     * element is of the second type. This method can (but does not always) return null if and only if the supplied
     * fallback value is also null (thus, the supplier may return null). The supplier is not triggered when that is not
     * necessary.
     *
     * @param supplier The supplier to get a fallback value from if this either is of the second type
     * @return The element of this either as the first type when that element is of the first type, or the supplied
     *     fallback value if not
     *
     * @throws NullPointerException When the specified supplier is null
     */
    public abstract F firstOrElseGet(@NotNull Supplier<? extends F> supplier);

    /**
     * Returns the element of this either as the second type, or returns the value supplied by the given supplier if the
     * element is of the first type. This method can (but does not always) return null if and only if the supplied
     * fallback value is also null (thus, the supplier may return null). The supplier is not triggered when that is not
     * necessary.
     *
     * @param supplier The supplier to get a fallback value from if this either is of the first type
     * @return The element of this either as the second type when that element is of the second type, or the supplied
     *     fallback value if not
     *
     * @throws NullPointerException When the specified supplier is null
     */
    public abstract S secondOrElseGet(@NotNull Supplier<? extends S> supplier);

    /**
     * Returns the element of this either as the first type, or throws the exception returned by the given exception
     * supplier if the element is not of the first type. The exception supplier can, but must not return a null value
     * (returning null results in a {@link NullPointerException} being thrown under the same condition, since null
     * cannot be thrown in the first place - it works but it's highly discouraged as the exception will then be thrown
     * with two reasons - TL;DR: don't return null). Returning a fresh {@link NoSuchElementException} from the supplier,
     * without description or cause, is equivalent to calling {@link #first()}.
     *
     * @param supplier The supplier to get the exception from if this either is of the second type
     * @return The element of this either as the first type
     *
     * @throws NullPointerException When the specified supplier is null
     * @throws X                    Supplied by the given supplier and thrown if this either is not of the first type
     */
    @NotNull
    public abstract <X extends Throwable> F firstOrElseThrow(@NotNull Supplier<? extends X> supplier) throws X;

    /**
     * Returns the element of this either as the second type, or throws the exception returned by the given exception
     * supplier if the element is not of the second type. The exception supplier can, but must not return a null value
     * (returning null results in a {@link NullPointerException} being thrown under the same condition, since null
     * cannot be thrown in the first place - it works but it's highly discouraged as the exception will then be thrown
     * with two reasons - TL;DR: don't return null). Returning a fresh {@link NoSuchElementException} from the supplier,
     * without description or cause, is equivalent to calling {@link #second()}.
     *
     * @param supplier The supplier to get the exception from if this either is of the first type
     * @return The element of this either as the second type
     *
     * @throws NullPointerException When the specified supplier is null
     * @throws X                    Supplied by the given supplier and thrown if this either is not of the second type
     */
    @NotNull
    public abstract <X extends Throwable> S secondOrElseThrow(@NotNull Supplier<? extends X> supplier) throws X;

    /**
     * Checks whether the specified object is equal to this either. An object is equal to an either if at least one of
     * the following conditions is met:
     * <ul>
     * <li>The object is the same object as this either (as in {@code object == this}).</li>
     * <li>
     * The object is a first-side either and this is a first-side either, and the elements are equal as specified
     * by {@link Object#equals}.
     * </li>
     * <li>
     * The object is a second-side either and this is a second-side either, and the elements are equal as specified
     * by {@link Object#equals}.
     * </li>
     * </ul>
     *
     * @return True if this either is equal to the given object (as specified above) and false otherwise.
     */
    public abstract boolean equals(Object o);

    /**
     * Returns a hash code for this either, which is a mix of the hash code of this either's element and a boolean which
     * is false for a first-side either and true for a second-side either. This method should attempt to generate a
     * different hash code for first- and second-side eithers that nonetheless have the same value.
     *
     * @return The computed hash code of this either
     */
    public abstract int hashCode();

    /**
     * Converts this either to a string. This returns:<br/>
     * <code>@code Either.<i>first/second</i>[<i>string representation of value</i>]</code>
     *
     * @return The string representation of this either.
     */
    public abstract String toString();

    /**
     * Creates a new either with an element of the first type {@link F}. This value may not be null, as specified by the
     * contract of an either.
     *
     * @param first The value for the new either
     * @param <F>   The first type, which is the type of the passed value
     * @param <S>   The second type, which automatically adapts to the needed second type
     * @return A new either
     *
     * @throws NullPointerException When the specified value is null
     */
    @NotNull
    public static <F, S> Either<F, S> first(@NotNull F first) {
        return new First<>(first);
    }

    /**
     * Creates a new either with an element of the second type {@link S}. This value may not be null, as specified by
     * the contract of an either.
     *
     * @param second The value for the new either
     * @param <F>    The first type, which automatically adapts to the needed second type
     * @param <S>    The second type, which is the type of the passed value
     * @return A new either
     *
     * @throws NullPointerException When the specified value is null
     */
    @NotNull
    public static <F, S> Either<F, S> second(@NotNull S second) {
        return new Second<>(second);
    }

    /**
     * Creates a new either with an element of the first type {@link F}. This value may not be null, as specified by the
     * contract of an either. This method is more or less equivalent to {@link #first(F)}, but one might prefer this
     * method instead because of the extra class that indicates the second type. Where the second type can obviously be
     * inferred from the context, it is recommended to use {@link #first(F)} instead.
     *
     * @param first      The value for the new either
     * @param secondType The type class of the second type of this either. Not used, just to stabilize the method
     *                   signature. Can be null but not recommended.
     * @param <F>        The first type, which is the type of the passed value
     * @param <S>        The second type, which is tye type of the passed class
     * @return A new either
     *
     * @throws NullPointerException When the specified value is null
     */
    @NotNull
    public static <F, S> Either<F, S> first(@NotNull F first, @NotNull Class<S> secondType) {
        return new First<>(first);
    }

    /**
     * Creates a new either with an element of the second type {@link S}. This value may not be null, as specified by
     * the contract of an either. This method is more or less equivalent to {@link #second(S)}, but one might prefer
     * this method instead because of the extra class that indicates the first type. Where the second type can obviously
     * be inferred from the context, it is recommended to use {@link #second(S)} instead.
     *
     * @param <F>       The first type, which is the type of the passed class
     * @param <S>       The second type, which is the type of the passed value
     * @param firstType The type class of the first type of this either. Not used, just to stabilize the method
     *                  signature. Can be null but not recommended.
     * @param second    The value for the new either
     * @return A new either
     *
     * @throws NullPointerException When the specified value is null
     */
    @NotNull
    public static <F, S> Either<F, S> second(@NotNull Class<F> firstType, @NotNull S second) {
        return new Second<>(second);
    }

    /**
     * Returns an either with a value of the first type if the {@linkplain Optional optional} first-type value is
     * available, and otherwise it returns an either of the second type with the specified fallback value. The fallback
     * value may not be null, even if the first value is available.
     *
     * @param first  An {@link Optional} that supplies the value of the first type
     * @param second A value of the second type for if the optional is empty
     * @return A new either
     *
     * @throws NullPointerException When the first {@link Optional} instance is null or the second value is null
     */
    @NotNull
    public static <F, S> Either<F, S> firstOrElse(@NotNull Optional<? extends F> first, @NotNull S second) {
        Validate.notNull(first, "first");
        Validate.notNull(second, "second");
        return first.<Either<F, S>>map(Either::first).orElseGet(() -> second(second));
    }

    /**
     * Returns an either with a value of the second type if the {@linkplain Optional optional} second-type value is
     * available, and otherwise it returns an either of the first type with the specified fallback value. The fallback
     * value may not be null, even if the second value is available.
     *
     * @param first  A value of the first type for if the optional is empty
     * @param second An {@link Optional} that supplies the value of the second type
     * @return A new either
     *
     * @throws NullPointerException When the second {@link Optional} instance is null or the first value is null
     */
    @NotNull
    public static <F, S> Either<F, S> secondOrElse(@NotNull F first, @NotNull Optional<? extends S> second) {
        Validate.notNull(first, "first");
        Validate.notNull(second, "second");
        return second.<Either<F, S>>map(Either::second).orElseGet(() -> first(first));
    }

    /**
     * Returns an either with a value of the first type if the {@linkplain Optional optional} first-type value is
     * available, and otherwise it returns an either of the second type with the supplied fallback value. The fallback
     * supplier may not return null, even if the first value is available.
     *
     * @param first  An {@link Optional} that supplies the value of the first type
     * @param second A supplier that supplies the value of the second type for if the optional is empty
     * @return A new either
     *
     * @throws NullPointerException When the first {@link Optional} instance is null, the second supplier is null or
     *                              when the second supplier returned null
     */
    @NotNull
    public static <F, S> Either<F, S> firstOrElseGet(@NotNull Optional<? extends F> first, @NotNull Supplier<? extends S> second) {
        Validate.notNull(first, "first");
        Validate.notNull(second, "second");
        return first.<Either<F, S>>map(Either::first).orElseGet(() -> second(second.get()));
    }

    /**
     * Returns an either with a value of the second type if the {@linkplain Optional optional} second-type value is
     * available, and otherwise it returns an either of the first type with the supplied fallback value. The fallback
     * supplier may not return null, even if the second value is available.
     *
     * @param first  A supplier that supplies the value of the first type for if the optional is empty
     * @param second An {@link Optional} that supplies the value of the second type
     * @return A new either
     *
     * @throws NullPointerException When the second {@link Optional} instance is null, the first supplier is null or
     *                              when the first supplier returned null
     */
    @NotNull
    public static <F, S> Either<F, S> secondOrElseGet(@NotNull Supplier<? extends F> first, @NotNull Optional<? extends S> second) {
        Validate.notNull(first, "first");
        Validate.notNull(second, "second");
        return second.<Either<F, S>>map(Either::second).orElseGet(() -> first(first.get()));
    }

    /**
     * Returns an either with a value of the first type if the given condition is true, and an either of the second type
     * if the given condition is false. This is a convenient alternative for a {@code ?:} (ternary) expression with
     * first and second. Note that, unlike a ternary operator, both first and second values are computed. Use {@link
     * #getFirstIf} to lazily load the needed values from suppliers.
     * <pre>
     * Either.firstIf(condition, something, somethingElse)
     * // is the same as
     * condition ? Either.first(something) : Either.second(somethingElse)
     * </pre>
     *
     * @param cond   Condition to test
     * @param first  Either value of first type, when condition is true
     * @param second Either value of second type, when condition is false
     * @return A new either
     *
     * @throws NullPointerException When the first or the second value is null
     */
    @NotNull
    public static <F, S> Either<F, S> firstIf(boolean cond, F first, S second) {
        Validate.notNull(first, "first");
        Validate.notNull(second, "second");
        return cond ? first(first) : second(second);
    }

    /**
     * Returns an either with a value of the second type if the given condition is true, and an either of the first type
     * if the given condition is false. This is a convenient alternative for a {@code ?:} (ternary) expression with
     * second and first. Note that, unlike a ternary operator, both first and second values are computed. Use {@link
     * #getSecondIf} to lazily load the needed values from suppliers.
     * <pre>
     * Either.secondIf(condition, something, somethingElse)
     * // is the same as
     * condition ? Either.second(somethingElse) : Either.first(something)
     * </pre>
     *
     * @param cond   Condition to test
     * @param first  Either value of first type, when condition is false
     * @param second Either value of second type, when condition is true
     * @return A new either
     *
     * @throws NullPointerException When the first or the second value is null
     */
    @NotNull
    public static <F, S> Either<F, S> secondIf(boolean cond, F first, S second) {
        Validate.notNull(first, "first");
        Validate.notNull(second, "second");
        return cond ? second(second) : first(first);
    }

    /**
     * Returns an either with a value of the first type if the given condition is true, and an either of the second type
     * if the given condition is false. The value of the either is provided by {@linkplain Supplier#get getting} from a
     * {@link Supplier}. This is a convenient alternative for a {@code ?:} (ternary) expression with first and second.
     * <pre>
     * Either.getFirstIf(condition, () -> something, () -> somethingElse)
     * // is the same as
     * condition ? Either.first(something) : Either.second(somethingElse)
     * </pre>
     *
     * @param cond   Condition to test
     * @param first  Either value getter of first type, when condition is true
     * @param second Either value getter of second type, when condition is false
     * @return A new either
     *
     * @throws NullPointerException When the first or the second {@link Supplier} is null, or when the deferred supplier
     *                              (the one that was chosen) returned null
     */
    @NotNull
    public static <F, S> Either<F, S> getFirstIf(boolean cond, Supplier<F> first, Supplier<S> second) {
        Validate.notNull(first, "first");
        Validate.notNull(second, "second");
        return cond ? first(first.get()) : second(second.get());
    }

    /**
     * Returns an either with a value of the second type if the given condition is true, and an either of the first type
     * if the given condition is false. The value of the either is provided by {@linkplain Supplier#get getting} from a
     * {@link Supplier}. This is a convenient alternative for a {@code ?:} (ternary) expression with second and first.
     * <pre>
     * Either.getSecondIf(condition, () -> something, () -> somethingElse)
     * // is the same as
     * condition ? Either.second(somethingElse) : Either.first(something)
     * </pre>
     *
     * @param cond   Condition to test
     * @param first  Either value getter of first type, when condition is false
     * @param second Either value getter of second type, when condition is true
     * @return A new either
     *
     * @throws NullPointerException When the first or the second {@link Supplier} is null, or when the deferred supplier
     *                              (the one that was chosen) returned null
     */
    @NotNull
    public static <F, S> Either<F, S> getSecondIf(boolean cond, Supplier<F> first, Supplier<S> second) {
        Validate.notNull(first, "first");
        Validate.notNull(second, "second");
        return cond ? second(second.get()) : first(first.get());
    }

    /**
     * Returns the value of the specified either in a type that covers both types. This can be useful for either that
     * have the same type on both sides. Such eithers may be unnecessary and often have to be converted into one value -
     * this method serves for that (nonetheless, eithers with the same type on both sides may still be useful and are
     * therefore not discouraged).
     *
     * @param either The either to get the value from, which must have the same type on both sides
     * @return The value of the specified either, regardless of the side that either
     */
    @NotNull
    public static <T> T get(@NotNull Either<? extends T, ? extends T> either) {
        Validate.notNull(either, "either");
        return either.isFirst() ? either.first() : either.second();
    }

    /**
     * An either implemenation that holds the first type
     */
    private static final class First<F, S> extends Either<F, S> {
        private final F first;

        private First(F first) {
            Validate.notNull(first, "first");
            this.first = first;
        }

        @Override
        public F first() {
            return first;
        }

        @Override
        public S second() {
            throw new NoSuchElementException();
        }

        @Override
        public boolean isFirst() {
            return true;
        }

        @Override
        public boolean isSecond() {
            return false;
        }

        @Override
        public Optional<F> optFirst() {
            return Optional.of(first);
        }

        @Override
        public Optional<S> optSecond() {
            return Optional.empty();
        }

        @Override
        public F firstOrNull() {
            return first;
        }

        @Override
        public S secondOrNull() {
            return null;
        }

        @Override
        public <T> T merge(Function<? super F, ? extends T> funcF, Function<? super S, ? extends T> funcS) {
            Validate.notNull(funcF, "funcF");
            Validate.notNull(funcS, "funcS");
            return funcF.apply(first);
        }

        @Override
        public <T> Either<T, S> mapFirst(Function<? super F, ? extends T> func) {
            Validate.notNull(func, "func");
            return new First<>(func.apply(first));
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> Either<F, T> mapSecond(Function<? super S, ? extends T> func) {
            Validate.notNull(func, "func");
            return (Either<F, T>) this;
        }

        @Override
        public <T, U> Either<T, U> map(Function<? super F, ? extends T> funcF, Function<? super S, ? extends U> funcS) {
            Validate.notNull(funcF, "funcF");
            Validate.notNull(funcS, "funcS");
            return new First<>(funcF.apply(first));
        }

        @Override
        public <T> Either<T, S> withFirst(T first) {
            Validate.notNull(first, "first");
            return new First<>(first);
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> Either<F, T> withSecond(T second) {
            Validate.notNull(second, "second");
            return (Either<F, T>) this;
        }

        @Override
        public Either<S, F> reverse() {
            return new Second<>(first);
        }

        @Override
        public void ifFirst(Consumer<? super F> consumer) {
            Validate.notNull(consumer, "consumer");
            consumer.accept(first);
        }

        @Override
        public void ifSecond(Consumer<? super S> consumer) {
            Validate.notNull(consumer, "consumer");
            // No-op, only check for non-null to keep the method contract
        }

        @Override
        public void ifElse(Consumer<? super F> consumerF, Consumer<? super S> consumerS) {
            Validate.notNull(consumerF, "consumerF");
            Validate.notNull(consumerS, "consumerS");
            consumerF.accept(first);
        }

        @Override
        public F firstOrElse(F other) {
            return first;
        }

        @Override
        public S secondOrElse(S other) {
            return other;
        }

        @Override
        public F firstOrElseGet(Supplier<? extends F> supplier) {
            Validate.notNull(supplier, "supplier");
            return first;
        }

        @Override
        public S secondOrElseGet(Supplier<? extends S> supplier) {
            Validate.notNull(supplier, "supplier");
            return supplier.get();
        }

        @Override
        public <X extends Throwable> F firstOrElseThrow(Supplier<? extends X> supplier) {
            Validate.notNull(supplier, "supplier");
            return first;
        }

        @Override
        public <X extends Throwable> S secondOrElseThrow(Supplier<? extends X> supplier) throws X {
            Validate.notNull(supplier, "supplier");
            throw supplier.get();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            First<?, ?> other = (First<?, ?>) o;
            return first.equals(other.first);
        }

        @Override
        public int hashCode() {
            return Objects.hash(false, first);
        }

        @Override
        public String toString() {
            return "Either.first[" + first + "]";
        }
    }

    /**
     * An either implemenation that holds the second type
     */
    private static final class Second<F, S> extends Either<F, S> {
        private final S second;

        private Second(S second) {
            Validate.notNull(second, "second");
            this.second = second;
        }

        @Override
        public F first() {
            throw new NoSuchElementException();
        }

        @Override
        public S second() {
            return second;
        }

        @Override
        public boolean isFirst() {
            return false;
        }

        @Override
        public boolean isSecond() {
            return true;
        }

        @Override
        public Optional<F> optFirst() {
            return Optional.empty();
        }

        @Override
        public Optional<S> optSecond() {
            return Optional.of(second);
        }

        @Override
        public F firstOrNull() {
            return null;
        }

        @Override
        public S secondOrNull() {
            return second;
        }

        @Override
        public <T> T merge(Function<? super F, ? extends T> funcF, Function<? super S, ? extends T> funcS) {
            Validate.notNull(funcF, "funcF");
            Validate.notNull(funcS, "funcS");
            return funcS.apply(second);
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> Either<T, S> mapFirst(Function<? super F, ? extends T> func) {
            Validate.notNull(func, "func");
            return (Either<T, S>) this;
        }

        @Override
        public <T> Either<F, T> mapSecond(Function<? super S, ? extends T> func) {
            Validate.notNull(func, "func");
            return new Second<>(func.apply(second));
        }

        @Override
        public <T, U> Either<T, U> map(Function<? super F, ? extends T> funcF, Function<? super S, ? extends U> funcS) {
            Validate.notNull(funcF, "funcF");
            Validate.notNull(funcS, "funcS");
            return new Second<>(funcS.apply(second));
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> Either<T, S> withFirst(T first) {
            Validate.notNull(first, "first");
            return (Either<T, S>) this;
        }

        @Override
        public <T> Either<F, T> withSecond(T second) {
            Validate.notNull(second, "second");
            return new Second<>(second);
        }

        @Override
        public Either<S, F> reverse() {
            return new First<>(second);
        }

        @Override
        public void ifFirst(Consumer<? super F> consumer) {
            Validate.notNull(consumer, "consumer");
            // No-op, only check for non-null to keep the method contract
        }

        @Override
        public void ifSecond(Consumer<? super S> consumer) {
            Validate.notNull(consumer, "consumer");
            consumer.accept(second);
        }

        @Override
        public void ifElse(Consumer<? super F> consumerF, Consumer<? super S> consumerS) {
            Validate.notNull(consumerF, "consumerF");
            Validate.notNull(consumerS, "consumerS");
            consumerS.accept(second);
        }

        @Override
        public F firstOrElse(F other) {
            return other;
        }

        @Override
        public S secondOrElse(S other) {
            return second;
        }

        @Override
        public F firstOrElseGet(Supplier<? extends F> supplier) {
            Validate.notNull(supplier, "supplier");
            return supplier.get();
        }

        @Override
        public S secondOrElseGet(Supplier<? extends S> supplier) {
            Validate.notNull(supplier, "supplier");
            return second;
        }

        @Override
        public <X extends Throwable> F firstOrElseThrow(Supplier<? extends X> supplier) throws X {
            Validate.notNull(supplier, "supplier");
            throw supplier.get();
        }

        @Override
        public <X extends Throwable> S secondOrElseThrow(Supplier<? extends X> supplier) {
            Validate.notNull(supplier, "supplier");
            return second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Second<?, ?> other = (Second<?, ?>) o;
            return second.equals(other.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(true, second);
        }

        @Override
        public String toString() {
            return "Either.second[" + second + "]";
        }
    }
}
