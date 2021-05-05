package net.shadew.util.function.rlong;

/**
 * A function that takes an object and a {@code char} and returns a {@code long}.
 */
public interface RefChar2LongFn<P1> {
    long invoke(P1 p1, char p2);
}
