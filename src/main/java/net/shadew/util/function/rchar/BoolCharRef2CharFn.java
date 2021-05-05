package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code boolean}, a {@code char} and an object and returns a {@code char}.
 */
public interface BoolCharRef2CharFn<P3> {
    char invoke(boolean p1, char p2, P3 p3);
}
