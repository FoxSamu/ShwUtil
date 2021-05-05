package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short} and an object and returns a {@code char}.
 */
public interface ShortRef2CharFn<P2> {
    char invoke(short p1, P2 p2);
}
