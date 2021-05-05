package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code double}, a {@code char} and an object and returns a {@code boolean}.
 */
public interface DoubleCharRef2BoolFn<P3> {
    boolean invoke(double p1, char p2, P3 p3);
}
