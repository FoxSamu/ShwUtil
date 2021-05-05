package net.shadew.util.function.rchar;

/**
 * A function that takes an object, an object and a {@code char} and returns a {@code char}.
 */
public interface RefRefChar2CharFn<P1, P2> {
    char invoke(P1 p1, P2 p2, char p3);
}
