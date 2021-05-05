package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code float}, a {@code byte} and an object and returns a {@code boolean}.
 */
public interface FloatByteRef2BoolFn<P3> {
    boolean invoke(float p1, byte p2, P3 p3);
}
