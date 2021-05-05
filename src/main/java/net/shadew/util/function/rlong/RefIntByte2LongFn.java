package net.shadew.util.function.rlong;

/**
 * A function that takes an object, an {@code int} and a {@code byte} and returns a {@code long}.
 */
public interface RefIntByte2LongFn<P1> {
    long invoke(P1 p1, int p2, byte p3);
}
