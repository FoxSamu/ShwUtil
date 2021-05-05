package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code byte} and an object and returns a {@code long}.
 */
public interface RefByteRef2LongFn<P1, P3> {
    long invoke(P1 p1, byte p2, P3 p3);
}
