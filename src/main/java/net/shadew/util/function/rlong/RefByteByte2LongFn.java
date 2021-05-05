package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code byte} and a {@code byte} and returns a {@code long}.
 */
public interface RefByteByte2LongFn<P1> {
    long invoke(P1 p1, byte p2, byte p3);
}
