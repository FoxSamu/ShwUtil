package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code double} and a {@code byte} and returns an object.
 */
public interface ShortDoubleByte2RefFn<R> {
    R invoke(short p1, double p2, byte p3);
}
