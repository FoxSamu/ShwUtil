package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, a {@code byte} and an object and returns a {@code char}.
 */
public interface IntByteRef2CharFn<P3> {
    char invoke(int p1, byte p2, P3 p3);
}
