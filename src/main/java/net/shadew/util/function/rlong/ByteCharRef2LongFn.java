package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, a {@code char} and an object and returns a {@code long}.
 */
public interface ByteCharRef2LongFn<P3> {
    long invoke(Byte p1, Char p2, P3 p3);
}
