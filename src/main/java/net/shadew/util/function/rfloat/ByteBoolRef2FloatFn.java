package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code byte}, a {@code boolean} and an object and returns a {@code float}.
 */
public interface ByteBoolRef2FloatFn<P3> {
    float invoke(Byte p1, Bool p2, P3 p3);
}
