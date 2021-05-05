package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code double} and a {@code char} and returns an object.
 */
public interface CharDoubleChar2RefFn<R> {
    R invoke(char p1, double p2, char p3);
}
