package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code boolean} and an object and returns an object.
 */
public interface ShortBoolRef2RefFn<P3, R> {
    R invoke(short p1, boolean p2, P3 p3);
}
