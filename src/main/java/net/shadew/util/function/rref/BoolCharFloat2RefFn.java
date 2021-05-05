package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code char} and a {@code float} and returns an object.
 */
public interface BoolCharFloat2RefFn<R> {
    R invoke(boolean p1, char p2, float p3);
}
