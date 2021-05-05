package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code byte} and a {@code double} and returns a {@code long}.
 */
public interface RefByteDouble2LongFn<P1> {
    long invoke(P1 p1, byte p2, double p3);
}
