package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code byte} and a {@code float} and returns a {@code long}.
 */
public interface RefByteFloat2LongFn<P1> {
    long invoke(P1 p1, byte p2, float p3);
}
