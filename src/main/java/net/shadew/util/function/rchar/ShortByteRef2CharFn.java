package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, a {@code byte} and an object and returns a {@code char}.
 */
public interface ShortByteRef2CharFn<P3> {
    char invoke(short p1, byte p2, P3 p3);
}
