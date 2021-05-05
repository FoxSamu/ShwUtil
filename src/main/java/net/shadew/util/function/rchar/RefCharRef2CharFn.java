package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code char} and an object and returns a {@code char}.
 */
public interface RefCharRef2CharFn<P1, P3> {
    char invoke(P1 p1, char p2, P3 p3);
}
