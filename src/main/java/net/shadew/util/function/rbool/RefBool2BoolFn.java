package net.shadew.util.function.rbool;

/**
 * A function that takes an object and a {@code boolean} and returns a {@code boolean}.
 */
public interface RefBool2BoolFn<P1> {
    boolean invoke(P1 p1, boolean p2);
}
