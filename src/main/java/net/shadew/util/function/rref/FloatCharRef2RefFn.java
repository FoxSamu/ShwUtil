package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code char} and an object and returns an object.
 */
public interface FloatCharRef2RefFn<P3, R> {
    R invoke(float p1, char p2, P3 p3);
}
