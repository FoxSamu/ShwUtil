package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code byte} and an object and returns an object.
 */
public interface DoubleByteRef2RefFn<P3, R> {
    R invoke(double p1, byte p2, P3 p3);
}
