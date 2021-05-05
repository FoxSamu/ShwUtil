package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int} and a {@code byte} and returns an object.
 */
public interface IntByte2RefFn<R> {
    R invoke(int p1, byte p2);
}
