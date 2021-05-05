package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code boolean} and a {@code short} and returns an object.
 */
public interface CharBoolShort2RefFn<R> {
    R invoke(char p1, boolean p2, short p3);
}
