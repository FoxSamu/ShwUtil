package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, an {@code int} and an object and returns a {@code char}.
 */
public interface CharIntRef2CharFn<P3> {
    char invoke(char p1, int p2, P3 p3);
}
