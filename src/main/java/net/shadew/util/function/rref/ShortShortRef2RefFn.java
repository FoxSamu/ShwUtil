package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code short} and an object and returns an object.
 */
public interface ShortShortRef2RefFn<P3, R> {
    R invoke(short p1, short p2, P3 p3);
}
