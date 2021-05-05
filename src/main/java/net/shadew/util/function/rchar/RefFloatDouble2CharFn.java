package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code float} and a {@code double} and returns a {@code char}.
 */
public interface RefFloatDouble2CharFn<P1> {
    char invoke(P1 p1, float p2, double p3);
}