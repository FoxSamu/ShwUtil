package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code boolean} and a {@code char} and returns an object.
 */
public interface ByteBoolChar2RefFn<R> {
    R invoke(byte p1, boolean p2, char p3);
}
