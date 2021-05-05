package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, a {@code boolean} and an object and returns a {@code char}.
 */
public interface ByteBoolRef2CharFn<P3> {
    char invoke(byte p1, boolean p2, P3 p3);
}
