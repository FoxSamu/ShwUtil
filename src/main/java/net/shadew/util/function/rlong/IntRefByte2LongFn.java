package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, an object and a {@code byte} and returns a {@code long}.
 */
public interface IntRefByte2LongFn<P2> {
    long invoke(int p1, P2 p2, byte p3);
}
