package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an object and a {@code byte} and returns an object.
 */
public interface ShortRefByte2RefFn<P2, R> {
    R invoke(short p1, P2 p2, byte p3);
}
