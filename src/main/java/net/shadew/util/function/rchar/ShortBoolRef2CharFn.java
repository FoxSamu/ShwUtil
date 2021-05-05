package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, a {@code boolean} and an object and returns a {@code char}.
 */
public interface ShortBoolRef2CharFn<P3> {
    char invoke(short p1, boolean p2, P3 p3);
}
