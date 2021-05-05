package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code float} and a {@code short} and returns an object.
 */
public interface BoolFloatShort2RefFn<R> {
    R invoke(boolean p1, float p2, short p3);
}
