package net.shadew.util.function.rint;

/**
 * A function that takes a {@code boolean}, an object and a {@code byte} and returns an {@code int}.
 */
public interface BoolRefByte2IntFn<P2> {
    int invoke(boolean p1, P2 p2, byte p3);
}
