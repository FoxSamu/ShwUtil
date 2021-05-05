package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, a {@code byte} and an object and returns a {@code char}.
 */
public interface CharByteRef2CharFn<P3> {
    char invoke(char p1, byte p2, P3 p3);
}
