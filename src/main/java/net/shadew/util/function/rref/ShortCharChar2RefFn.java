package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code char} and a {@code char} and returns an object.
 */
public interface ShortCharChar2RefFn<R> {
    R invoke(short p1, char p2, char p3);
}
