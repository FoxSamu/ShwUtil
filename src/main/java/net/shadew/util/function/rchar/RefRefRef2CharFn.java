package net.shadew.util.function.rchar;

/**
 * A function that takes an object, an object and an object and returns a {@code char}.
 */
public interface RefRefRef2CharFn<P1, P2, P3> {
    char invoke(P1 p1, P2 p2, P3 p3);
}
