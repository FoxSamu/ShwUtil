package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, a {@code char} and an object and returns a {@code float}.
 */
public interface BoolCharRef2FloatFn<P3> {
    float invoke(boolean p1, char p2, P3 p3);
}
