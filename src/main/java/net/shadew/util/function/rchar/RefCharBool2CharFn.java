package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code char} and a {@code boolean} and returns a {@code char}.
 */
public interface RefCharBool2CharFn<P1> {
    char invoke(P1 p1, char p2, boolean p3);
}
