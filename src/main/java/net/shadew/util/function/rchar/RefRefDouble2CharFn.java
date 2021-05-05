package net.shadew.util.function.rchar;

/**
 * A function that takes an object, an object and a {@code double} and returns a {@code char}.
 */
public interface RefRefDouble2CharFn<P1, P2> {
    char invoke(P1 p1, P2 p2, double p3);
}
