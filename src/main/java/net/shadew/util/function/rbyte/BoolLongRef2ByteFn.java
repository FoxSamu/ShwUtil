package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code boolean}, a {@code long} and an object and returns a {@code byte}.
 */
public interface BoolLongRef2ByteFn<P3> {
    byte invoke(boolean p1, long p2, P3 p3);
}
