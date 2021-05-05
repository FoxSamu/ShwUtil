package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code boolean}, an object and a {@code char} and returns a {@code char}.
 */
public interface BoolRefChar2CharFn<P2> {
    char invoke(boolean p1, P2 p2, char p3);
}