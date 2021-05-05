package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, a {@code boolean} and an object and returns a {@code long}.
 */
public interface CharBoolRef2LongFn<P3> {
    long invoke(char p1, boolean p2, P3 p3);
}
