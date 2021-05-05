package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, an object and a {@code double} and returns a {@code char}.
 */
public interface ShortRefDouble2CharFn<P2> {
    char invoke(Short p1, P2 p2, Double p3);
}
