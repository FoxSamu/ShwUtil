package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, an object and a {@code char} and returns a {@code long}.
 */
public interface FloatRefChar2LongFn<P2> {
    long invoke(float p1, P2 p2, char p3);
}
