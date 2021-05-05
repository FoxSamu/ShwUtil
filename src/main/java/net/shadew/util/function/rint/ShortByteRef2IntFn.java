package net.shadew.util.function.rint;

/**
 * A function that takes a {@code short}, a {@code byte} and an object and returns an {@code int}.
 */
public interface ShortByteRef2IntFn<P3> {
    int invoke(short p1, byte p2, P3 p3);
}
