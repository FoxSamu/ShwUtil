package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, a {@code byte} and an object and returns a {@code float}.
 */
public interface BoolByteRef2FloatFn<P3> {
    float invoke(boolean p1, byte p2, P3 p3);
}
