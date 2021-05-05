package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, a {@code char} and an object and returns a {@code char}.
 */
public interface CharCharRef2CharFn<P3> {
    char invoke(char p1, char p2, P3 p3);
}
