package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code byte} and a {@code double} and returns an object.
 */
public interface CharByteDouble2RefFn<R> {
    R invoke(char p1, byte p2, double p3);
}
