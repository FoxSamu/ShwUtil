package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, a {@code char} and an object and returns a {@code float}.
 */
public interface IntCharRef2FloatFn<P3> {
    float invoke(int p1, char p2, P3 p3);
}
