package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, an object and a {@code byte} and returns a {@code long}.
 */
public interface FloatRefByte2LongFn<P2> {
    long invoke(float p1, P2 p2, byte p3);
}
