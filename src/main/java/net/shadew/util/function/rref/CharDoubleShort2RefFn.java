package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code double} and a {@code short} and returns an object.
 */
public interface CharDoubleShort2RefFn<R> {
    R invoke(char p1, double p2, short p3);
}
