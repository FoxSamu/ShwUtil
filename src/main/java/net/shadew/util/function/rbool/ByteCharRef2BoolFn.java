package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code byte}, a {@code char} and an object and returns a {@code boolean}.
 */
public interface ByteCharRef2BoolFn<P3> {
    boolean invoke(byte p1, char p2, P3 p3);
}
