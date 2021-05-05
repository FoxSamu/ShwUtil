package net.shadew.util.function.rbool;

/**
 * A function that takes an object, an object and a {@code double} and returns a {@code boolean}.
 */
public interface RefRefDouble2BoolFn<P1, P2> {
    boolean invoke(P1 p1, P2 p2, double p3);
}
