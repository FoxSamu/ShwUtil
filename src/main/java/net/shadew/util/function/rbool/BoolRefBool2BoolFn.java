package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code boolean}, an object and a {@code boolean} and returns a {@code boolean}.
 */
public interface BoolRefBool2BoolFn<P2> {
    boolean invoke(boolean p1, P2 p2, boolean p3);
}
