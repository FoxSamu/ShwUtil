package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code char} and a {@code double} and returns an object.
 */
public interface BoolCharDouble2RefFn<R> {
    R invoke(boolean p1, char p2, double p3);
}
