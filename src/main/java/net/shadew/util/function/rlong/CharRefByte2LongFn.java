package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, an object and a {@code byte} and returns a {@code long}.
 */
public interface CharRefByte2LongFn<P2> {
    long invoke(Char p1, P2 p2, Byte p3);
}
