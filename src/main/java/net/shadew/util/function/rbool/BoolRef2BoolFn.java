package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code boolean} and an object and returns a {@code boolean}.
 */
public interface BoolRef2BoolFn<P2> {
    boolean invoke(boolean p1, P2 p2);
}
