package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code boolean} and an object and returns an object.
 */
public interface ByteBoolRef2RefFn<P3, R> {
    R invoke(byte p1, boolean p2, P3 p3);
}
