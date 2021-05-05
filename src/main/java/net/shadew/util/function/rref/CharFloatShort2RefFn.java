package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code float} and a {@code short} and returns an object.
 */
public interface CharFloatShort2RefFn<R> {
    R invoke(char p1, float p2, short p3);
}
