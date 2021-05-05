package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code char}, a {@code float} and an object and returns a {@code boolean}.
 */
public interface CharFloatRef2BoolFn<P3> {
    boolean invoke(char p1, float p2, P3 p3);
}