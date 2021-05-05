package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, an object and a {@code short} and returns a {@code char}.
 */
public interface CharRefShort2CharFn<P2> {
    char invoke(char p1, P2 p2, short p3);
}
