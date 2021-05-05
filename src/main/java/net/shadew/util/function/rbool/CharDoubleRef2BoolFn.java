package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code char}, a {@code double} and an object and returns a {@code boolean}.
 */
public interface CharDoubleRef2BoolFn<P3> {
    boolean invoke(char p1, double p2, P3 p3);
}
