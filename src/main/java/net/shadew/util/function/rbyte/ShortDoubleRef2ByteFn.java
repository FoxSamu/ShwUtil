package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code short}, a {@code double} and an object and returns a {@code byte}.
 */
public interface ShortDoubleRef2ByteFn<P3> {
    byte invoke(short p1, double p2, P3 p3);
}
