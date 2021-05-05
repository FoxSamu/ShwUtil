package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, an object and an object and returns a {@code char}.
 */
public interface CharRefRef2CharFn<P2, P3> {
    char invoke(char p1, P2 p2, P3 p3);
}
