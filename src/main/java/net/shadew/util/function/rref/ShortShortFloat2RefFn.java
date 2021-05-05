package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code short} and a {@code float} and returns an object.
 */
public interface ShortShortFloat2RefFn<R> {
    R invoke(short p1, short p2, float p3);
}
