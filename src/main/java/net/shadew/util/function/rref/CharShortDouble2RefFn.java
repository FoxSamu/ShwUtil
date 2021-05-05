package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code short} and a {@code double} and returns an object.
 */
public interface CharShortDouble2RefFn<R> {
    R invoke(char p1, short p2, double p3);
}
