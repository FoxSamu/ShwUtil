package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code byte} and an {@code int} and returns a {@code long}.
 */
public interface RefByteInt2LongFn<P1> {
    long invoke(P1 p1, byte p2, int p3);
}
