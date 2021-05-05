package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code short} and a {@code char} and returns an object.
 */
public interface ShortShortChar2RefFn<R> {
    R invoke(short p1, short p2, char p3);
}
