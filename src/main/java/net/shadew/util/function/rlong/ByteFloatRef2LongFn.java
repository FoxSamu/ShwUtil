package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, a {@code float} and an object and returns a {@code long}.
 */
public interface ByteFloatRef2LongFn<P3> {
    long invoke(byte p1, float p2, P3 p3);
}
