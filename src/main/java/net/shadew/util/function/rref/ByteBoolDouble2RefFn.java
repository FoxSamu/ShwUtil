package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code boolean} and a {@code double} and returns an object.
 */
public interface ByteBoolDouble2RefFn<R> {
    R invoke(byte p1, boolean p2, double p3);
}
