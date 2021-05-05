package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code char} and an object and returns an object.
 */
public interface BoolCharRef2RefFn<P3, R> {
    R invoke(boolean p1, char p2, P3 p3);
}
