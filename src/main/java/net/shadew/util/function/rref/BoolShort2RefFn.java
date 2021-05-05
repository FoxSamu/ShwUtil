package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean} and a {@code short} and returns an object.
 */
public interface BoolShort2RefFn<R> {
    R invoke(boolean p1, short p2);
}
