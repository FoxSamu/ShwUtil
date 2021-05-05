package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, a {@code short} and an object and returns a {@code boolean}.
 */
public interface IntShortRef2BoolFn<P3> {
    boolean invoke(int p1, short p2, P3 p3);
}
