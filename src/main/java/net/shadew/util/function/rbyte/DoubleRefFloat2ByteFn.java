package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code double}, an object and a {@code float} and returns a {@code byte}.
 */
public interface DoubleRefFloat2ByteFn<P2> {
    byte invoke(double p1, P2 p2, float p3);
}
