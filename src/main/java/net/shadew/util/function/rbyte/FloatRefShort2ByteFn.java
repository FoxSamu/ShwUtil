package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code float}, an object and a {@code short} and returns a {@code byte}.
 */
public interface FloatRefShort2ByteFn<P2> {
    byte invoke(float p1, P2 p2, short p3);
}
