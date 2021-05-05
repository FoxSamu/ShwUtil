package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code short} and a {@code short} and returns an object.
 */
public interface BoolShortShort2RefFn<R> {
    R invoke(boolean p1, short p2, short p3);
}
