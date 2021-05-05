package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code char} and a {@code short} and returns an object.
 */
public interface IntCharShort2RefFn<R> {
    R invoke(int p1, char p2, short p3);
}
