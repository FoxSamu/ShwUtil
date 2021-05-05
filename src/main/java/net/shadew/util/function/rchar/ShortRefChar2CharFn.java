package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, an object and a {@code char} and returns a {@code char}.
 */
public interface ShortRefChar2CharFn<P2> {
    char invoke(short p1, P2 p2, char p3);
}
