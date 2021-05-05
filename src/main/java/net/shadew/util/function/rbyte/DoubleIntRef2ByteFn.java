package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code double}, an {@code int} and an object and returns a {@code byte}.
 */
public interface DoubleIntRef2ByteFn<P3> {
    byte invoke(double p1, int p2, P3 p3);
}
