package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code float}, a {@code long} and an object and returns a {@code byte}.
 */
public interface FloatLongRef2ByteFn<P3> {
    byte invoke(float p1, long p2, P3 p3);
}
