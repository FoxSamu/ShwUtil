package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code boolean} and a {@code char} and returns an object.
 */
public interface BoolBoolChar2RefFn<R> {
    R invoke(boolean p1, boolean p2, char p3);
}
