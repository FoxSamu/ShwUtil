package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code float}, a {@code double} and an object and returns a {@code char}.
 */
public interface FloatDoubleRef2CharFn<P3> {
    char invoke(float p1, double p2, P3 p3);
}
