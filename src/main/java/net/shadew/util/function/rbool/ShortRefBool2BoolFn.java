package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code short}, an object and a {@code boolean} and returns a {@code boolean}.
 */
public interface ShortRefBool2BoolFn<P2> {
    boolean invoke(short p1, P2 p2, boolean p3);
}
