package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code char}, an object and a {@code double} and returns a {@code boolean}.
 */
public interface CharRefDouble2BoolFn<P2> {
    boolean invoke(char p1, P2 p2, double p3);
}
