package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, a {@code double} and an object and returns a {@code char}.
 */
public interface CharDoubleRef2CharFn<P3> {
    char invoke(char p1, double p2, P3 p3);
}
