package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code boolean} and a {@code char} and returns an object.
 */
public interface ShortBoolChar2RefFn<R> {
    R invoke(short p1, boolean p2, char p3);
}
