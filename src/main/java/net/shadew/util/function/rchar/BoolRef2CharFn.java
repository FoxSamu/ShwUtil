package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code boolean} and an object and returns a {@code char}.
 */
public interface BoolRef2CharFn<P2> {
    char invoke(boolean p1, P2 p2);
}
