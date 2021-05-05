package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short} and an object and returns a {@code long}.
 */
public interface ShortRef2LongFn<P2> {
    long invoke(short p1, P2 p2);
}
