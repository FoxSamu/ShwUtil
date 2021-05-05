package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean} and an object and returns an object.
 */
public interface BoolRef2RefFn<P2, R> {
    R invoke(boolean p1, P2 p2);
}
