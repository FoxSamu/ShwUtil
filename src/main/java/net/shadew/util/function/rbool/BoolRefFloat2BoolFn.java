package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code boolean}, an object and a {@code float} and returns a {@code boolean}.
 */
public interface BoolRefFloat2BoolFn<P2> {
    boolean invoke(boolean p1, P2 p2, float p3);
}
