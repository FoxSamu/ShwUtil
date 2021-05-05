package net.shadew.util.function.rref;

/**
 * A function that takes an object, an object and a {@code byte} and returns an object.
 */
public interface RefRefByte2RefFn<P1, P2, R> {
    R invoke(P1 p1, P2 p2, byte p3);
}
