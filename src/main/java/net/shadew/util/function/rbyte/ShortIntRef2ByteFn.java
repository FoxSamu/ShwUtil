package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code short}, an {@code int} and an object and returns a {@code byte}.
 */
public interface ShortIntRef2ByteFn<P3> {
    byte invoke(short p1, int p2, P3 p3);
}
