package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code float}, an object and a {@code char} and returns a {@code char}.
 */
public interface FloatRefChar2CharFn<P2> {
    char invoke(float p1, P2 p2, char p3);
}
