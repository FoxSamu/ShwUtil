package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code char} and a {@code float} and returns an object.
 */
public interface ShortCharFloat2RefFn<R> {
    R invoke(short p1, char p2, float p3);
}
