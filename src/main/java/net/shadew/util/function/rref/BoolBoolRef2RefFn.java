package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code boolean} and an object and returns an object.
 */
public interface BoolBoolRef2RefFn<P3, R> {
    R invoke(boolean p1, boolean p2, P3 p3);
}
