package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short} and a {@code double} and returns an object.
 */
public interface ShortDouble2RefFn<R> {
    R invoke(short p1, double p2);
}
