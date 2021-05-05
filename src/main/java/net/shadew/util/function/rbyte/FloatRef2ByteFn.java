package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code float} and an object and returns a {@code byte}.
 */
public interface FloatRef2ByteFn<P2> {
    byte invoke(float p1, P2 p2);
}
