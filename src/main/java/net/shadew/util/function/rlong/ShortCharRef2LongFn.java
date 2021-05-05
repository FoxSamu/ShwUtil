package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, a {@code char} and an object and returns a {@code long}.
 */
public interface ShortCharRef2LongFn<P3> {
    long invoke(short p1, char p2, P3 p3);
}
