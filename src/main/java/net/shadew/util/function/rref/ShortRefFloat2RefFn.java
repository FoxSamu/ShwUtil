package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an object and a {@code float} and returns an object.
 */
public interface ShortRefFloat2RefFn<P2, R> {
    R invoke(short p1, P2 p2, float p3);
}
