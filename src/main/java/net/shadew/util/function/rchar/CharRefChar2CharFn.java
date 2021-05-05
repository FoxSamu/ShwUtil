package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, an object and a {@code char} and returns a {@code char}.
 */
public interface CharRefChar2CharFn<P2> {
    char invoke(char p1, P2 p2, char p3);
}
