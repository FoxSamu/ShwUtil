package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code boolean}, a {@code float} and an object and returns a {@code boolean}.
 */
public interface BoolFloatRef2BoolFn<P3> {
    boolean invoke(boolean p1, float p2, P3 p3);
}
