package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, a {@code boolean} and an object and returns a {@code long}.
 */
public interface BoolBoolRef2LongFn<P3> {
    long invoke(boolean p1, boolean p2, P3 p3);
}
