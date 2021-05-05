package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code byte} and a {@code double} and returns an object.
 */
public interface BoolByteDouble2RefFn<R> {
    R invoke(boolean p1, byte p2, double p3);
}
