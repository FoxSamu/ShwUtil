package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, a {@code float} and an object and returns a {@code long}.
 */
public interface CharFloatRef2LongFn<P3> {
    long invoke(char p1, float p2, P3 p3);
}
