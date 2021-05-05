package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, a {@code short} and an object and returns a {@code long}.
 */
public interface CharShortRef2LongFn<P3> {
    long invoke(char p1, short p2, P3 p3);
}
