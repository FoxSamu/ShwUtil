package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code boolean} and an object and returns a {@code long}.
 */
public interface RefBoolRef2LongFn<P1, P3> {
    long invoke(P1 p1, boolean p2, P3 p3);
}
