package net.shadew.util.function.rint;

/**
 * A function that takes a {@code char}, a {@code byte} and an object and returns an {@code int}.
 */
public interface CharByteRef2IntFn<P3> {
    int invoke(char p1, byte p2, P3 p3);
}
