package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, a {@code byte} and an object and returns a {@code long}.
 */
public interface IntByteRef2LongFn<P3> {
    long invoke(int p1, byte p2, P3 p3);
}
