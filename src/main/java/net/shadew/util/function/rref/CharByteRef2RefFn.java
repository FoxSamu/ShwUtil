package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code byte} and an object and returns an object.
 */
public interface CharByteRef2RefFn<P3, R> {
    R invoke(char p1, byte p2, P3 p3);
}
