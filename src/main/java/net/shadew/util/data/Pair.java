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

import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

import net.shadew.util.contract.NotNull;
import net.shadew.util.contract.Validate;

/**
 * A pair is a specific form of collection that binds one object to another. A pair always holds two not-null elements
 * which can each be of their own type. A pair can never have null elements, in order to have null elements an {@link
 * Optional} should be used. More specifically, a pair is described by the following properties:
 * <ul>
 * <li>A pair has two elements.</li>
 * <li>Both elements in the pair may have their own types, independent of the type of the other element.</li>
 * <li>Both elements in the pair are not null.</li>
 * <li>A pair is immutable, but the elements can be mutable.</li>
 * </ul>
 * The {@code Pair} class can and should never be inherited.
 *
 * @param <F> The type of the first element
 * @param <S> The type of the second element
 */
public final class Pair<F, S> {
    @NotNull
    private final F first;

    @NotNull
    private final S second;

    /**
     * Creates a pair. This constructor is private in favor of {@link #of}.
     *
     * @param first  The first element
     * @param second The second element
     * @throws NullPointerException If the first or the second element, or both, are null.
     */
    private Pair(@NotNull F first, @NotNull S second) {
        Validate.notNull(first, "first");
        Validate.notNull(second, "second");

        this.first = first;
        this.second = second;
    }

    /**
     * Returns the first element of this pair. Following the contract of a pair, this method never returns {@code
     * null}.
     *
     * @return The first element of the pair.
     */
    @NotNull
    public F first() {
        return first;
    }

    /**
     * Returns the second element of this pair. Following the contract of a pair, this method never returns {@code
     * null}.
     *
     * @return The second element of the pair.
     */
    @NotNull
    public S second() {
        return second;
    }

    /**
     * Merges the elements in this pair into one element using the given function and returns the created element. The
     * given function may assume that the passed parameters are not null, but it may return null itself. When the
     * function returns null, this method also returns null.
     *
     * @param func The function to merge the two elements of the pair
     * @return The merged value
     *
     * @throws NullPointerException When the given function is null
     */
    public <T> T merge(@NotNull BiFunction<? super F, ? super S, ? extends T> func) {
        Validate.notNull(func, "func");
        return func.apply(first, second);
    }

    /**
     * Returns a new pair with a new first element which was computed from the old first element using the given
     * function. The function may assume the passed parameter is not null, and it must not return null.
     *
     * @param func The function used to map the old element to the new element
     * @return The new pair, with a new first element and the same second element as this pair
     *
     * @throws NullPointerException When the passed function is null, or when it returned a null element
     */
    @NotNull
    public <T> Pair<T, S> mapFirst(@NotNull Function<? super F, ? extends T> func) {
        Validate.notNull(func, "func");
        return new Pair<>(func.apply(first), second);
    }

    /**
     * Returns a new pair with a new second element which was computed from the old second element using the given
     * function. The function may assume the passed parameter is not null, and it must not return null.
     *
     * @param func The function used to map the old element to the new element
     * @return The new pair, with a new second element and the same first element as this pair
     *
     * @throws NullPointerException When the passed function is null, or when it returned a null element
     */
    @NotNull
    public <T> Pair<F, T> mapSecond(@NotNull Function<? super S, ? extends T> func) {
        Validate.notNull(func, "func");
        return new Pair<>(first, func.apply(second));
    }

    /**
     * Returns a new pair with a new first and second element which were computed from their respective old elements
     * using the given functions for their respecitve elements. The functions may assume their passed parameter is not
     * null, and they must not return null.
     *
     * @param funcF The function used to map the first element to a new element
     * @param funcS The function used to map the second element to a new element
     * @return The new pair, with new elements
     *
     * @throws NullPointerException When at least one of the functions is null, or when at least one of the functions
     *                              returned a null element
     */
    @NotNull
    public <T, U> Pair<T, U> map(@NotNull Function<? super F, ? extends T> funcF, @NotNull Function<? super S, ? extends U> funcS) {
        Validate.notNull(funcF, "funcF");
        Validate.notNull(funcS, "funcS");
        return new Pair<>(funcF.apply(first), funcS.apply(second));
    }

    /**
     * Returns a new pair with the same elements as this pair, but in the reverse order.
     *
     * @return The new, reversed pair
     */
    @NotNull
    public Pair<S, F> reverse() {
        return new Pair<>(second, first);
    }

    /**
     * Returns a new pair with a new first element and the same second element as this pair.
     *
     * @param newFirst The new first element, must not be null
     * @return The new pair, with the new first element
     *
     * @throws NullPointerException When the new element is null
     */
    @NotNull
    public <T> Pair<T, S> withFirst(@NotNull T newFirst) {
        return new Pair<>(newFirst, second);
    }

    /**
     * Returns a new pair with a new second element and the same first element as this pair.
     *
     * @param newSecond The new second element, must not be null
     * @return The new pair, with the new second element
     *
     * @throws NullPointerException When the new element is null
     */
    @NotNull
    public <T> Pair<F, T> withSecond(@NotNull T newSecond) {
        return new Pair<>(first, newSecond);
    }

    /**
     * Returns {@linkplain Either either} the first value if the given condition is true or the second value if the
     * given condition is false.
     *
     * @param condition The condition to determine whether to choose the first or the second value
     * @return An {@link Either} with either the first or the second value
     */
    @NotNull
    public Either<F, S> firstIf(boolean condition) {
        if (condition) return Either.first(first);
        return Either.second(second);
    }

    /**
     * Returns {@linkplain Either either} the first value if the given condition is false or the second value if the
     * given condition is true.
     *
     * @param condition The condition to determine whether to choose the second or the first value
     * @return An {@link Either} with either the first or the second value
     */
    @NotNull
    public Either<F, S> secondIf(boolean condition) {
        if (condition) return Either.second(second);
        return Either.first(first);
    }

    /**
     * Checks the equality of this pair. A pair is equal to another object when at least one of the following conditions
     * is met:
     * <ul>
     * <li>The object is the same object as this pair (as by {@code obj == this}).</li>
     * <li>
     * The object is an instance of {@link Pair}, its first element is equal to the first element of this pair and its
     * second element is equal to the second element of this pair (where elements are equal as specified by {@link
     * Object#equals}.
     * </li>
     * </ul>
     *
     * @param o The object to compare with
     * @return True when the object is equal to this pair as specified above
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return first.equals(pair.first) &&
                   second.equals(pair.second);
    }

    /**
     * Returns the hash code of this pair, which is computed from both elements and combined, using {@link
     * Objects#hash}.
     *
     * @return The hash code of this pair
     */
    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    /**
     * Converts this pair to a string. This returns:<br/>
     * <code>Pair[<i>string representation of first element</i>, <i>string representation of second element</i>]</code>
     *
     * @return This pair as a string
     */
    @Override
    public String toString() {
        return "Pair[" + first + ", " + second + "]";
    }

    /**
     * Creates a pair of the specified two elements. As specified by the contract of a pair (see {@link Pair}), the
     * elements may not be null. To allow nullity, one should wrap the nullable value into an {@link Optional}.
     *
     * @param first  The first element to be put in the pair
     * @param second The second element to be put in the pair
     * @return The newly created pair
     *
     * @throws NullPointerException When one or more of the given elements are null
     */
    @NotNull
    public static <F, S> Pair<F, S> of(@NotNull F first, @NotNull S second) {
        return new Pair<>(first, second);
    }

    /**
     * Creates a pair of the specified element on both sides. As specified by the contract of a pair (see {@link Pair}),
     * the elements may not be null. To allow nullity, one should wrap the nullable value into an {@link Optional}.
     *
     * @param element The element to be put in the pair on both sides
     * @return The newly created pair
     *
     * @throws NullPointerException When the given element is null
     */
    @NotNull
    public static <E> Pair<E, E> ofOne(@NotNull E element) {
        return new Pair<>(element, element);
    }

    /**
     * Transposes the elements of a pair matrix (a pair holding two pairs) into a new pair matrix. Transposing a pair
     * matrix is just like transposing a mathematical matrix. Assume the following pair matrix:
     * <pre>
     * [A, C]
     * [B, D]</pre>
     * Transposing this pair matrix swaps {@code B} and {@code D}, creating:
     * <pre>
     * [A, B]
     * [C, D]</pre>
     *
     * @param matrix The pair matrix to transpose
     * @return A new pair matrix resembling the transposition of the given matrix
     *
     * @throws NullPointerException When the given pair matrix is null
     */
    @NotNull
    public static <A, B, C, D> Pair<Pair<A, B>, Pair<C, D>> transpose(@NotNull Pair<Pair<A, C>, Pair<B, D>> matrix) {
        Validate.notNull(matrix, "matrix");
        return new Pair<>(
            new Pair<>(matrix.first().first(), matrix.second().first()),
            new Pair<>(matrix.first().second(), matrix.second().second())
        );
    }
}
