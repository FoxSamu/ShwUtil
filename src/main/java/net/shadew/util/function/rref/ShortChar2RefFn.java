package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short} and a {@code char} and returns an object.
 */
public interface ShortChar2RefFn<R> {
    R invoke(short p1, char p2);
}
