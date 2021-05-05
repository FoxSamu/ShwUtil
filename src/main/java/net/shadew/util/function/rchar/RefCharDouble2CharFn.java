package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code char} and a {@code double} and returns a {@code char}.
 */
public interface RefCharDouble2CharFn<P1> {
    char invoke(P1 p1, char p2, double p3);
}
