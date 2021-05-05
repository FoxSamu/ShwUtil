package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code float} and a {@code double} and returns an object.
 */
public interface BoolFloatDouble2RefFn<R> {
    R invoke(boolean p1, float p2, double p3);
}
