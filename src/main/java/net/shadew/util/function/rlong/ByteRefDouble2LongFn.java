package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, an object and a {@code double} and returns a {@code long}.
 */
public interface ByteRefDouble2LongFn<P2> {
    long invoke(Byte p1, P2 p2, Double p3);
}
