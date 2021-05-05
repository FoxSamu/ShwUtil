package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code float}, an object and a {@code boolean} and returns a {@code byte}.
 */
public interface FloatRefBool2ByteFn<P2> {
    byte invoke(float p1, P2 p2, boolean p3);
}
