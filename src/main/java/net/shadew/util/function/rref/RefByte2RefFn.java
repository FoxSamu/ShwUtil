package net.shadew.util.function.rref;

/**
 * A function that takes an object and a {@code byte} and returns an object.
 */
public interface RefByte2RefFn<P1, R> {
    R invoke(P1 p1, byte p2);
}
