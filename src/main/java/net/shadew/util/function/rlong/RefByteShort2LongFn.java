package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code byte} and a {@code short} and returns a {@code long}.
 */
public interface RefByteShort2LongFn<P1> {
    long invoke(P1 p1, byte p2, short p3);
}
