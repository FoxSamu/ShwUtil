package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code byte} and a {@code boolean} and returns a {@code char}.
 */
public interface RefByteBool2CharFn<P1> {
    char invoke(P1 p1, byte p2, boolean p3);
}
