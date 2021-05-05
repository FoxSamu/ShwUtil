package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code boolean} and a {@code float} and returns an object.
 */
public interface ByteBoolFloat2RefFn<R> {
    R invoke(byte p1, boolean p2, float p3);
}
