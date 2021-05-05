package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, an object and a {@code float} and returns a {@code char}.
 */
public interface CharRefFloat2CharFn<P2> {
    char invoke(char p1, P2 p2, float p3);
}
