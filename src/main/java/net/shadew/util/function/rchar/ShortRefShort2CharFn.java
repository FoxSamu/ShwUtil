package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, an object and a {@code short} and returns a {@code char}.
 */
public interface ShortRefShort2CharFn<P2> {
    char invoke(short p1, P2 p2, short p3);
}
