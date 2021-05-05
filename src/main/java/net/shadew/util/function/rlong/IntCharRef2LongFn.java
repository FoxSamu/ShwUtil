package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, a {@code char} and an object and returns a {@code long}.
 */
public interface IntCharRef2LongFn<P3> {
    long invoke(int p1, char p2, P3 p3);
}
