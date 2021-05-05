package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code boolean}, a {@code long} and an object and returns a {@code char}.
 */
public interface BoolLongRef2CharFn<P3> {
    char invoke(boolean p1, long p2, P3 p3);
}
