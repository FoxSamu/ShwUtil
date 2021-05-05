package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code char} and a {@code short} and returns an object.
 */
public interface FloatCharShort2RefFn<R> {
    R invoke(float p1, char p2, short p3);
}
