package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, an {@code int} and an object and returns a {@code long}.
 */
public interface IntIntRef2LongFn<P3> {
    long invoke(int p1, int p2, P3 p3);
}
