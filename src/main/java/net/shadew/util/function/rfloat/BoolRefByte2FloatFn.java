package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, an object and a {@code byte} and returns a {@code float}.
 */
public interface BoolRefByte2FloatFn<P2> {
    float invoke(boolean p1, P2 p2, byte p3);
}
