package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code char} and a {@code byte} and returns a {@code long}.
 */
public interface RefCharByte2LongFn<P1> {
    long invoke(P1 p1, char p2, byte p3);
}
