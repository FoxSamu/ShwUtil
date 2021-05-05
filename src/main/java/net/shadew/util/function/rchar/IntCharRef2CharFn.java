package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, a {@code char} and an object and returns a {@code char}.
 */
public interface IntCharRef2CharFn<P3> {
    char invoke(int p1, char p2, P3 p3);
}
