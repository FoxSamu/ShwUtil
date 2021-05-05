package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char} and an object and returns a {@code char}.
 */
public interface CharRef2CharFn<P2> {
    char invoke(char p1, P2 p2);
}
