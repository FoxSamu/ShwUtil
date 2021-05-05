package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code byte} and a {@code boolean} and returns a {@code long}.
 */
public interface RefByteBool2LongFn<P1> {
    long invoke(P1 p1, byte p2, boolean p3);
}
