package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, a {@code char} and an object and returns a {@code long}.
 */
public interface FloatCharRef2LongFn<P3> {
    long invoke(float p1, char p2, P3 p3);
}
