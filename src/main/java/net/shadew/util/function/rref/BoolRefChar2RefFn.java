package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an object and a {@code char} and returns an object.
 */
public interface BoolRefChar2RefFn<P2, R> {
    R invoke(boolean p1, P2 p2, char p3);
}
