package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code byte}, a {@code float} and an object and returns a {@code byte}.
 */
public interface ByteFloatRef2ByteFn<P3> {
    byte invoke(byte p1, float p2, P3 p3);
}
