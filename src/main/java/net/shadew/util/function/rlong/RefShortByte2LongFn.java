package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code short} and a {@code byte} and returns a {@code long}.
 */
public interface RefShortByte2LongFn<P1> {
    long invoke(P1 p1, short p2, byte p3);
}
