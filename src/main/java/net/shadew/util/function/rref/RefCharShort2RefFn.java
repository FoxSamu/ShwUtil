package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code char} and a {@code short} and returns an object.
 */
public interface RefCharShort2RefFn<P1, R> {
    R invoke(P1 p1, char p2, short p3);
}
