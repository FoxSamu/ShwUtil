package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code byte} and a {@code char} and returns a {@code long}.
 */
public interface RefByteChar2LongFn<P1> {
    long invoke(P1 p1, byte p2, char p3);
}
