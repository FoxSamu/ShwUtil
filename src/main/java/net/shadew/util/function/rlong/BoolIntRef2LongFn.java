package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, an {@code int} and an object and returns a {@code long}.
 */
public interface BoolIntRef2LongFn<P3> {
    long invoke(boolean p1, int p2, P3 p3);
}
