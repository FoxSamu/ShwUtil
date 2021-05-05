package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code double} and a {@code char} and returns an object.
 */
public interface BoolDoubleChar2RefFn<R> {
    R invoke(boolean p1, double p2, char p3);
}
