package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an object and a {@code char} and returns an object.
 */
public interface ShortRefChar2RefFn<P2, R> {
    R invoke(short p1, P2 p2, char p3);
}
