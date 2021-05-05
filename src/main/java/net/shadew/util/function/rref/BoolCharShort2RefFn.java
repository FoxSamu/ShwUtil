package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code char} and a {@code short} and returns an object.
 */
public interface BoolCharShort2RefFn<R> {
    R invoke(boolean p1, char p2, short p3);
}
