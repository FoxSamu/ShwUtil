package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code double} and a {@code short} and returns an object.
 */
public interface BoolDoubleShort2RefFn<R> {
    R invoke(boolean p1, double p2, short p3);
}
