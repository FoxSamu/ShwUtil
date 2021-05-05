package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, a {@code short} and an object and returns a {@code long}.
 */
public interface BoolShortRef2LongFn<P3> {
    long invoke(boolean p1, short p2, P3 p3);
}
