package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code byte} and an object and returns a {@code boolean}.
 */
public interface ByteRef2BoolFn<P2> {
    boolean invoke(byte p1, P2 p2);
}
