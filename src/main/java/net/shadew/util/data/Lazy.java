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
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import net.shadew.util.contract.NotNull;
import net.shadew.util.contract.Validate;

/**
 * A lazy-load value. This class wraps a supplier in such a way that it only calls the wrapped supplier once, caches the
 * value and then keeps returning the cached value. The value wrapped by a lazy-load value must never be null.
 */
public final class Lazy<T> implements Supplier<T> {
    private T value;
    private Supplier<? extends T> supplier;

    private Lazy(@NotNull Supplier<? extends T> supplier) {
        set(supplier);
    }

    private Lazy(@NotNull T value) {
        set(value);
    }

    /**
     * Returns a lazy-load value which is pre-loaded with the given value.
     *
     * @param value The value to pre-load the lazy value with. Must not be null.
     * @return A new {@link Lazy} instance pre-loaded with the given value.
     *
     * @throws NullPointerException If the given value is null.
     */
    public static <T> Lazy<T> of(@NotNull T value) {
        Validate.notNull(value, "value");
        return new Lazy<>(value);
    }

    /**
     * Returns a lazy-load value which is unloaded, of which the given supplier is responsible for generating the value
     * to be loaded. The given supplier may return null. When the given supplier returns null this is seen as a failure
     * in loading and the lazy will not load (i.e. {@link #get()} will throw {@link NoSuchElementException}).
     *
     * @param supplier The supplier responsible for loading the value.
     * @return A new {@link Lazy} instance with unloaded value.
     *
     * @throws NullPointerException If the given supplier is null.
     */
    public static <T> Lazy<T> of(@NotNull Supplier<? extends T> supplier) {
        Validate.notNull(supplier, "supplier");
        return new Lazy<>(supplier);
    }

    /**
     * Sets this lazy-load value to a new, unloaded value, where the given supplier is responsible for generating the
     * value.
     *
     * @param supplier The supplier responsible for loading the new value.
     * @throws NullPointerException If the given supplier is null.
     */
    public void set(@NotNull Supplier<? extends T> supplier) {
        Validate.notNull(supplier, "supplier");
        this.supplier = supplier;
        this.value = null;
    }

    /**
     * Sets this lazy-load value to the specified new, loaded value.
     *
     * @param value The new value to be set to. Must not be null.
     * @throws NullPointerException If the given value is null.
     */
    public void set(@NotNull T value) {
        Validate.notNull(value, "value");
        this.supplier = () -> value;
        this.value = value;
    }

    /**
     * Unloads the loaded value, meaning that the value is loaded again upon a {@link #get()} call. For pre-loaded
     * values, a {@link Lazy} instance keeps a supplier that supplies the pre-loaded value, hence unloading also works
     * with pre-loaded values. While for most lazy-load values {@link #unload()} will not be needed, it can be handy
     * when caching values in a {@link Lazy} instance.
     */
    public void unload() {
        value = null;
    }

    /**
     * Gets the value from this {@link Lazy} instance, loading it if necessary. When no value was cached and the loading
     * fails (i.e. the supplier that is responsible for loading returned null), it will throw a {@link
     * NoSuchElementException}. If the loading was successful, the {@link Lazy} instance will cache the generated value
     * until {@link #unload()} is called.
     * <p>
     * If the supplier of this {@link Lazy} does never return null this is the preferable method to call. If the
     * supplier <em>does</em> return null, prefer {@link #tryGet()} instead, which returns an empty {@link Optional}
     * instead of throwing an exception when the supplier returned null.
     * </p>
     *
     * @return The value that was cached, or if none, the generated value.
     *
     * @throws NoSuchElementException If the value wasn't cached and the supplier failed to load the value
     */
    @NotNull
    @Override
    public T get() {
        if (value == null) {
            value = supplier.get();
            if (value == null) {
                throw new NoSuchElementException("Supplier returned null, cannot load");
            }
        }
        return value;
    }

    /**
     * Gets the value from this {@link Lazy} instance, loading it if necessary. When no value was cached and the loading
     * fails (i.e. the supplier that is responsible for loading returned null), it will return an empty {@link Optional}
     * value. If the loading was successful, the {@link Lazy} instance will cache the generated value until {@link
     * #unload()} is called. This is an alternative to {@link #get()} which doesn't throw an exception.
     *
     * @return If a value was cached, an {@link Optional} with the cached value. If no value was cached, but the
     *     supplier succeeded in loading a value, an {@link Optional} with the loaded value. If no value was cached and
     *     the supplier failed in loading a value, an empty {@link Optional}.
     */
    @NotNull
    public Optional<T> tryGet() {
        if (value == null) {
            value = supplier.get();
            if (value == null) {
                return Optional.empty();
            }
        }
        return Optional.of(value);
    }

    /**
     * Gets the loaded value from this {@link Lazy} instance as an {@link Optional}, returning an empty {@link Optional}
     * if no value was cached. This method never loads the value of this {@link Lazy}.
     *
     * @return If a value was cached, an {@link Optional} with the cached value. An empty {@link Optional} in any other
     *     case.
     */
    @NotNull
    public Optional<T> getIfLoaded() {
        return Optional.ofNullable(value);
    }

    /**
     * Returns whether the {@link Lazy} is caching a loaded value. Calling this directly after a call to {@link
     * #unload()} will always yield false.
     *
     * @return Whether a value was cached or not.
     */
    public boolean isLoaded() {
        return value != null;
    }

    /**
     * Runs the given function if a value was cached, passing the cached value as a parameter to the {@link Consumer}.
     *
     * @param fn The function to run when a value is cached. Must not be null.
     * @throws NullPointerException When the given function is null.
     */
    public void ifLoaded(@NotNull Consumer<? super T> fn) {
        Validate.notNull(fn, "fn");
        if (value != null) fn.accept(value);
    }

    /**
     * Runs the given function if a value was not yet cached.
     *
     * @param fn The function to run when a value is not cached yet. Must not be null.
     * @throws NullPointerException When the given function is null.
     */
    public void ifNotLoaded(@NotNull Runnable fn) {
        Validate.notNull(fn, "fn");
        if (value == null) fn.run();
    }

    /**
     * Returns a new {@link Lazy} mapping the value of this {@link Lazy} using the given mapping function. Wrapping a
     * {@link Lazy} in a {@link Lazy} effectively means that if the inner {@link Lazy} is loaded, the outer might not
     * have been loaded yet, but if the outer one is loaded the inner one must also be loaded, assuming no call to
     * {@link #unload()} has been performed on neither of them. Note that the outer {@link Lazy} fails loading if the
     * inner lazy fails loading.
     * <p>
     * More specifically, the following code produces the same result as a call to {@link #map(Function)} (where {@code
     * me} is this {@link Lazy} instance and {@code fn} the passed function):
     * <pre>  Lazy.of(() -> me.tryGet().map(fn).orElse(null));</pre>
     * </p>
     *
     * @param fn The mapping function. Must not be null.
     * @return A new {@link Lazy} mapping the value of this {@link Lazy}.
     *
     * @throws NullPointerException When the given function is null.
     */
    public <D> Lazy<D> map(@NotNull Function<T, D> fn) {
        Validate.notNull(fn, "fn");
        return of(() -> tryGet().map(fn).orElse(null));
    }
}
