package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code byte}, an object and a {@code char} and returns a {@code boolean}.
 */
public interface ByteRefChar2BoolFn<P2> {
    boolean invoke(byte p1, P2 p2, char p3);
}
