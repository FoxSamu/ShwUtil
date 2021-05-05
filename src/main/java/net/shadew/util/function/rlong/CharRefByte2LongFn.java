package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, an object and a {@code byte} and returns a {@code long}.
 */
public interface CharRefByte2LongFn<P2> {
    long invoke(char p1, P2 p2, byte p3);
}
