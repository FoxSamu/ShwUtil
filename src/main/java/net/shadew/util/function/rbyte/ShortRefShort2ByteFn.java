package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code short}, an object and a {@code short} and returns a {@code byte}.
 */
public interface ShortRefShort2ByteFn<P2> {
    byte invoke(short p1, P2 p2, short p3);
}
