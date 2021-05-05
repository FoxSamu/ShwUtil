package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code float}, a {@code double} and an object and returns a {@code byte}.
 */
public interface FloatDoubleRef2ByteFn<P3> {
    byte invoke(float p1, double p2, P3 p3);
}
