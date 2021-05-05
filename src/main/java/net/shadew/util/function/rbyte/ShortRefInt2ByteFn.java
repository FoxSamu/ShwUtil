package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code short}, an object and an {@code int} and returns a {@code byte}.
 */
public interface ShortRefInt2ByteFn<P2> {
    byte invoke(short p1, P2 p2, int p3);
}
