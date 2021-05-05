package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, an object and a {@code byte} and returns a {@code long}.
 */
public interface BoolRefByte2LongFn<P2> {
    long invoke(boolean p1, P2 p2, byte p3);
}
