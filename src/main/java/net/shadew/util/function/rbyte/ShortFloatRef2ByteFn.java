package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code short}, a {@code float} and an object and returns a {@code byte}.
 */
public interface ShortFloatRef2ByteFn<P3> {
    byte invoke(short p1, float p2, P3 p3);
}
