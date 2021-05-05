package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean} and a {@code char} and returns an object.
 */
public interface BoolChar2RefFn<R> {
    R invoke(boolean p1, char p2);
}
