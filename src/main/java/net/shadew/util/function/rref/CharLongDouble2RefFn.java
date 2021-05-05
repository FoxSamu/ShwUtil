package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code long} and a {@code double} and returns an object.
 */
public interface CharLongDouble2RefFn<R> {
    R invoke(Char p1, Long p2, Double p3);
}
