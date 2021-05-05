package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short} and an object and returns an object.
 */
public interface ShortRef2RefFn<P2, R> {
    R invoke(short p1, P2 p2);
}
