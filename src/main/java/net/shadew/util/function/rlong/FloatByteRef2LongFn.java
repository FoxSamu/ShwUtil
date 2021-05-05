package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, a {@code byte} and an object and returns a {@code long}.
 */
public interface FloatByteRef2LongFn<P3> {
    long invoke(float p1, byte p2, P3 p3);
}
