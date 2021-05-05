package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char} and a {@code double} and returns an object.
 */
public interface CharDouble2RefFn<R> {
    R invoke(char p1, double p2);
}
