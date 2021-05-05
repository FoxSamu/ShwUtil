package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short} and a {@code float} and returns an object.
 */
public interface ShortFloat2RefFn<R> {
    R invoke(short p1, float p2);
}
