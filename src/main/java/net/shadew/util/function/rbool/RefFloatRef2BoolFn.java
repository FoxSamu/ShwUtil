package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code float} and an object and returns a {@code boolean}.
 */
public interface RefFloatRef2BoolFn<P1, P3> {
    boolean invoke(P1 p1, float p2, P3 p3);
}
