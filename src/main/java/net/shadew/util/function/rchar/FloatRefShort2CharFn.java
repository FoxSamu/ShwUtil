package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code float}, an object and a {@code short} and returns a {@code char}.
 */
public interface FloatRefShort2CharFn<P2> {
    char invoke(float p1, P2 p2, short p3);
}
