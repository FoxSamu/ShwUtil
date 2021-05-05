package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code double} and a {@code byte} and returns an object.
 */
public interface BoolDoubleByte2RefFn<R> {
    R invoke(boolean p1, double p2, byte p3);
}
