package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code double} and returns an object.
 */
public interface ShortByteDouble2RefFn<R> {
    R invoke(short p1, byte p2, double p3);
}
