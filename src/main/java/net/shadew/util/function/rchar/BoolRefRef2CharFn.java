package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code boolean}, an object and an object and returns a {@code char}.
 */
public interface BoolRefRef2CharFn<P2, P3> {
    char invoke(boolean p1, P2 p2, P3 p3);
}
