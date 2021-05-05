package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code float}, an object and a {@code byte} and returns a {@code boolean}.
 */
public interface FloatRefByte2BoolFn<P2> {
    boolean invoke(float p1, P2 p2, byte p3);
}
