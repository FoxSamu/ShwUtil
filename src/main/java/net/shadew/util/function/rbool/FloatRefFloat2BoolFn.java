package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code float}, an object and a {@code float} and returns a {@code boolean}.
 */
public interface FloatRefFloat2BoolFn<P2> {
    boolean invoke(float p1, P2 p2, float p3);
}
