package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code double}, an object and an {@code int} and returns a {@code byte}.
 */
public interface DoubleRefInt2ByteFn<P2> {
    byte invoke(double p1, P2 p2, int p3);
}
