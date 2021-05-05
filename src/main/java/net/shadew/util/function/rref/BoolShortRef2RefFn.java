package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code short} and an object and returns an object.
 */
public interface BoolShortRef2RefFn<P3, R> {
    R invoke(boolean p1, short p2, P3 p3);
}
