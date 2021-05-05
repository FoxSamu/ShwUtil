package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, a {@code char} and an object and returns a {@code long}.
 */
public interface BoolCharRef2LongFn<P3> {
    long invoke(boolean p1, char p2, P3 p3);
}
