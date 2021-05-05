package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code boolean}, a {@code byte} and an object and returns a {@code char}.
 */
public interface BoolByteRef2CharFn<P3> {
    char invoke(boolean p1, byte p2, P3 p3);
}
