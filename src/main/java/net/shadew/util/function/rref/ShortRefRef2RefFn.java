package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an object and an object and returns an object.
 */
public interface ShortRefRef2RefFn<P2, P3, R> {
    R invoke(short p1, P2 p2, P3 p3);
}
