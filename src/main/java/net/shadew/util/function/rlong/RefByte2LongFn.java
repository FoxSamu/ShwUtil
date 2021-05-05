package net.shadew.util.function.rlong;

/**
 * A function that takes an object and a {@code byte} and returns a {@code long}.
 */
public interface RefByte2LongFn<P1> {
    long invoke(P1 p1, byte p2);
}
