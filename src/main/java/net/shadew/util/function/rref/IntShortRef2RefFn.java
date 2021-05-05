package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code short} and an object and returns an object.
 */
public interface IntShortRef2RefFn<P3, R> {
    R invoke(int p1, short p2, P3 p3);
}
