package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code short} and a {@code char} and returns a {@code long}.
 */
public interface RefShortChar2LongFn<P1> {
    long invoke(P1 p1, short p2, char p3);
}
