package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code double} and a {@code byte} and returns an object.
 */
public interface CharDoubleByte2RefFn<R> {
    R invoke(char p1, double p2, byte p3);
}
