package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, a {@code boolean} and an object and returns a {@code char}.
 */
public interface CharBoolRef2CharFn<P3> {
    char invoke(char p1, boolean p2, P3 p3);
}
