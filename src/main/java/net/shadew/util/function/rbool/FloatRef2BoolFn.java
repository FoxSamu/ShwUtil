package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code float} and an object and returns a {@code boolean}.
 */
public interface FloatRef2BoolFn<P2> {
    boolean invoke(float p1, P2 p2);
}
