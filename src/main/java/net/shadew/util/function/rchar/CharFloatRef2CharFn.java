package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, a {@code float} and an object and returns a {@code char}.
 */
public interface CharFloatRef2CharFn<P3> {
    char invoke(char p1, float p2, P3 p3);
}
