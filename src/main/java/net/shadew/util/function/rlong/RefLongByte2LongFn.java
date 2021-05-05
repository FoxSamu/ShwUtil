package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code long} and a {@code byte} and returns a {@code long}.
 */
public interface RefLongByte2LongFn<P1> {
    long invoke(P1 p1, Long p2, Byte p3);
}
