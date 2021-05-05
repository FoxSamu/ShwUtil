package net.shadew.util.function.rbyte;

/**
 * A function that takes an {@code int}, a {@code double} and an object and returns a {@code byte}.
 */
public interface IntDoubleRef2ByteFn<P3> {
    byte invoke(int p1, double p2, P3 p3);
}
