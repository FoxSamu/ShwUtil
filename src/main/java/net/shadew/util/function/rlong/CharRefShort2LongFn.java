package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, an object and a {@code short} and returns a {@code long}.
 */
public interface CharRefShort2LongFn<P2> {
    long invoke(char p1, P2 p2, short p3);
}
