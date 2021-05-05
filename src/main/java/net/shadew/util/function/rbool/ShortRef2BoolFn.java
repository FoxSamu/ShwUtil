package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code short} and an object and returns a {@code boolean}.
 */
public interface ShortRef2BoolFn<P2> {
    boolean invoke(short p1, P2 p2);
}
