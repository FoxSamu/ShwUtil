package net.shadew.util.function.rint;

/**
 * A function that takes a {@code boolean}, a {@code float} and an object and returns an {@code int}.
 */
public interface BoolFloatRef2IntFn<P3> {
    int invoke(boolean p1, float p2, P3 p3);
}
