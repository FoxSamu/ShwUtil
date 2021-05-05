package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char} and an object and returns a {@code long}.
 */
public interface CharRef2LongFn<P2> {
    long invoke(char p1, P2 p2);
}
