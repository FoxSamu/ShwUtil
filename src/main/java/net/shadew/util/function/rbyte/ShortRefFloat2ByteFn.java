package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code short}, an object and a {@code float} and returns a {@code byte}.
 */
public interface ShortRefFloat2ByteFn<P2> {
    byte invoke(short p1, P2 p2, float p3);
}
