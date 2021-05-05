package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, a {@code byte} and an object and returns a {@code float}.
 */
public interface DoubleByteRef2FloatFn<P3> {
    float invoke(double p1, byte p2, P3 p3);
}
