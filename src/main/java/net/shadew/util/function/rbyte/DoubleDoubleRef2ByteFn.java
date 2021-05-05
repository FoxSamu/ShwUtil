package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code double}, a {@code double} and an object and returns a {@code byte}.
 */
public interface DoubleDoubleRef2ByteFn<P3> {
    byte invoke(double p1, double p2, P3 p3);
}
