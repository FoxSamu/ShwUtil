package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code boolean}, a {@code double} and an object and returns a {@code char}.
 */
public interface BoolDoubleRef2CharFn<P3> {
    char invoke(boolean p1, double p2, P3 p3);
}
