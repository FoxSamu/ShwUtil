package net.shadew.util.function.rbool;

/**
 * A function that takes an object and an object and returns a {@code boolean}.
 */
public interface RefRef2BoolFn<P1, P2> {
    boolean invoke(P1 p1, P2 p2);
}
