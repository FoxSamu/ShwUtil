package net.shadew.util.function.rchar;

/**
 * A function that takes an object and an object and returns a {@code char}.
 */
public interface RefRef2CharFn<P1, P2> {
    char invoke(P1 p1, P2 p2);
}
