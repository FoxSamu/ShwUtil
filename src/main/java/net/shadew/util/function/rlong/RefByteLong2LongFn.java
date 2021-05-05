package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code byte} and a {@code long} and returns a {@code long}.
 */
public interface RefByteLong2LongFn<P1> {
    long invoke(P1 p1, byte p2, long p3);
}
