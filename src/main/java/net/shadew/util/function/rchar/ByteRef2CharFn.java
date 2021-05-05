package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte} and an object and returns a {@code char}.
 */
public interface ByteRef2CharFn<P2> {
    char invoke(byte p1, P2 p2);
}
