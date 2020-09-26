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

import net.shadew.util.contract.NotNull;

/**
 * The unit value. In all cases, at all times, there is only one instance of this class, which can be obtained via
 * {@link #unit()}. The {@code Unit} type has in fact only one value - compare it to {@link Boolean}, which already has
 * two distinct values. In many cases the {@code Unit} instance is not needed, but in several cases it might be handy,
 * for example in a scenario that prohibits null values but where one doesn't want to pass any value. {@code Unit} can
 * also come in handy in a situation where only the fact if something is null or not matters.
 * <p>
 * A {@code Unit} instance other than the default instance cannot and should not be created. If reflection still tries
 * to instantiate {@code Unit}, an {@link IllegalStateException} is thrown (though it is still possible using reflection
 * hacks).
 * </p>
 */
public final class Unit {
    private static final Unit UNIT = new Unit();

    /**
     * Throws an {@link IllegalStateException} except when the first {@link Unit} hasn't been created yet.
     */
    private Unit() {
        if (UNIT != null) {
            throw new IllegalStateException("Double unit");
        }
    }

    /**
     * Returns the string representation of {@link Unit}, which is {@code "Unit"}.
     *
     * @return {@code "Unit"}.
     */
    @Override
    public String toString() {
        return "Unit";
    }

    /**
     * Indicates whether the specified object is a {@link Unit}. No other necessary checks are required for equality:
     * since there is only one {@link Unit} instance, all objects that are an instance of {@link Unit} can be safely
     * considered as equal to eachother (because they should all be the same instance).
     *
     * @param obj The object to compate with.
     * @return True if the given object is an instance of {@link Unit}, and false otherwise.
     *
     * @see Object#equals
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Unit;
    }

    /**
     * Returns the hash code for a {@link Unit}, which is 1 per definition. Since there is only one {@link Unit}
     * instance, there will not exist multiple hash codes for {@link Unit}. We don't use 0 because 0 is already reserved
     * for the {@code null} value, which is the only other value a variable or field of type {@link Unit} can have next
     * to a valid {@link Unit instance}.
     *
     * @return 1, per definition.
     */
    @Override
    public int hashCode() {
        return 1;
    }

    /**
     * Returns the global {@link Unit} instance, which is created directly after this class loaded. This is the only
     * proper way to get a (the) {@link Unit} instance.
     *
     * @return The global {@link Unit} instance.
     */
    @NotNull
    public static Unit unit() {
        return UNIT;
    }
}
