package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code short}, an object and a {@code double} and returns a {@code byte}.
 */
public interface ShortRefDouble2ByteFn<P2> {
    byte invoke(short p1, P2 p2, double p3);
}
