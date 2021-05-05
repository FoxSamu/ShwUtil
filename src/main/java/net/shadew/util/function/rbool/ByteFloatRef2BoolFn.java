package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code byte}, a {@code float} and an object and returns a {@code boolean}.
 */
public interface ByteFloatRef2BoolFn<P3> {
    boolean invoke(byte p1, float p2, P3 p3);
}
