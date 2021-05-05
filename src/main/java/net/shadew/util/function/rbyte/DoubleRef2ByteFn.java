package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code double} and an object and returns a {@code byte}.
 */
public interface DoubleRef2ByteFn<P2> {
    byte invoke(double p1, P2 p2);
}
