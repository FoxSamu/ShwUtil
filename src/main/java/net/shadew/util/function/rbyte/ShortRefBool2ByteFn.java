package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code short}, an object and a {@code boolean} and returns a {@code byte}.
 */
public interface ShortRefBool2ByteFn<P2> {
    byte invoke(short p1, P2 p2, boolean p3);
}
