package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, a {@code byte} and an object and returns a {@code long}.
 */
public interface CharByteRef2LongFn<P3> {
    long invoke(char p1, byte p2, P3 p3);
}
