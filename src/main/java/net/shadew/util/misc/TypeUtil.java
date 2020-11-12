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

package net.shadew.util.misc;

import java.util.Optional;
import java.util.function.Supplier;

import net.shadew.util.contract.Validate;

/**
 * A utility class for checking and casting objects to other types. In some frameworks classes indirectly inherit
 * another class or interface, in such cases casts and {@link instanceof} operations give compiler errors. These
 * utilities use {@link Class}es to cast and check types.
 */
public final class TypeUtil {

    private TypeUtil() {
    }

    /**
     * Casts an object to the given type, failing if object is not an instance of that type.
     *
     * @param o   The object to cast, when null this method returns null
     * @param cls The type class to cast to
     * @return The cast object
     *
     * @throws NullPointerException When the given type class is null
     * @throws ClassCastException   When the given object is not an instance of the given type
     */
    public static <T> T cast(Object o, Class<T> cls) {
        Validate.notNull(cls, "cls");
        return cls.cast(o);
    }

    /**
     * Casts an object to the given type, returning null if object is not an instance of that type.
     *
     * @param o   The object to cast, when null this method returns null
     * @param cls The type class to cast to
     * @return The cast object, or null if not a proper instance
     *
     * @throws NullPointerException When the given type class is null
     */
    public static <T> T castOrNull(Object o, Class<T> cls) {
        Validate.notNull(cls, "cls");
        return cls.isInstance(o) ? cls.cast(o) : null;
    }

    /**
     * Casts an object to the given type into an {@link Optional}, returning empty if object is not an instance of the
     * given type.
     *
     * @param o   The object to cast, when null this method returns {@link Optional#empty()}
     * @param cls The type class to cast to
     * @return The cast object optionally, empty if not a proper instance
     *
     * @throws NullPointerException When the given type class is null
     */
    public static <T> Optional<T> castOptional(Object o, Class<T> cls) {
        Validate.notNull(cls, "cls");
        return cls.isInstance(o) ? Optional.of(cls.cast(o)) : Optional.empty();
    }

    /**
     * Casts an object to the given type, returning a default value when if the object is not an instance of the given
     * type.
     *
     * @param o      The object to cast, when null this method returns the default value
     * @param cls    The type class to cast to
     * @param orElse The default value {@link Supplier}, must not be null but might return null (resulting in null being
     *               returned if cast fails)
     * @return The cast object, or the supplied default if not a proper instance
     *
     * @throws NullPointerException When the given type class is null or when the given default supplier is null
     */
    public static <T> T castOrElse(Object o, Class<T> cls, Supplier<T> orElse) {
        Validate.notNull(cls, "cls");
        Validate.notNull(orElse, "orElse");
        return cls.isInstance(o) ? cls.cast(o) : orElse.get();
    }

    /**
     * Casts an object to the given type, returning a default value when if the object is not an instance of the given
     * type.
     *
     * @param o      The object to cast, when null this method returns the default value
     * @param cls    The type class to cast to
     * @param orElse The default value, might be null (resulting in null being returned if cast fails)
     * @return The cast object, or the given default if not a proper instance
     *
     * @throws NullPointerException When the given type class is null
     */
    public static <T> T castOrElse(Object o, Class<T> cls, T orElse) {
        Validate.notNull(cls, "cls");
        return cls.isInstance(o) ? cls.cast(o) : orElse;
    }

    /**
     * Checks whether a given object is an instance of the given type. Returns false if the given object is null.
     *
     * @param o   The object to cast, when null this method returns false
     * @param cls The type class to check instance for
     * @return Whether the given object is an instance of the given type
     *
     * @throws NullPointerException When the given type class is null
     */
    public static boolean instance(Object o, Class<?> cls) {
        Validate.notNull(cls, "cls");
        return cls.isInstance(o);
    }
}
