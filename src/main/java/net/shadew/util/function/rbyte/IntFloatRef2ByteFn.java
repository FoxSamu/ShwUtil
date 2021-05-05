package net.shadew.util.function.rbyte;

/**
 * A function that takes an {@code int}, a {@code float} and an object and returns a {@code byte}.
 */
public interface IntFloatRef2ByteFn<P3> {
    byte invoke(int p1, float p2, P3 p3);
}
