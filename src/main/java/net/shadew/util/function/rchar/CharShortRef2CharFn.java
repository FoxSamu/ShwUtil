package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, a {@code short} and an object and returns a {@code char}.
 */
public interface CharShortRef2CharFn<P3> {
    char invoke(char p1, short p2, P3 p3);
}
