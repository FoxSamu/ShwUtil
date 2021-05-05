package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code short} and a {@code char} and returns an object.
 */
public interface IntShortChar2RefFn<R> {
    R invoke(int p1, short p2, char p3);
}
