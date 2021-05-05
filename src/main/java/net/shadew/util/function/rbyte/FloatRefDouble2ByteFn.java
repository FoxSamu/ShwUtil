package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code float}, an object and a {@code double} and returns a {@code byte}.
 */
public interface FloatRefDouble2ByteFn<P2> {
    byte invoke(float p1, P2 p2, double p3);
}
