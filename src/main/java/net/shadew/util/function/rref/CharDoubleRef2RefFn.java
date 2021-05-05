package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code double} and an object and returns an object.
 */
public interface CharDoubleRef2RefFn<P3, R> {
    R invoke(char p1, double p2, P3 p3);
}
