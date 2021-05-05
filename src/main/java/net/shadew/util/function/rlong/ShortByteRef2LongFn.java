package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, a {@code byte} and an object and returns a {@code long}.
 */
public interface ShortByteRef2LongFn<P3> {
    long invoke(short p1, byte p2, P3 p3);
}
