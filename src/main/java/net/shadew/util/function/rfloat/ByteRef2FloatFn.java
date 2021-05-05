package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code byte} and an object and returns a {@code float}.
 */
public interface ByteRef2FloatFn<P2> {
    float invoke(byte p1, P2 p2);
}
