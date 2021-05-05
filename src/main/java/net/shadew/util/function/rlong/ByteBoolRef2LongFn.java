package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, a {@code boolean} and an object and returns a {@code long}.
 */
public interface ByteBoolRef2LongFn<P3> {
    long invoke(byte p1, boolean p2, P3 p3);
}
