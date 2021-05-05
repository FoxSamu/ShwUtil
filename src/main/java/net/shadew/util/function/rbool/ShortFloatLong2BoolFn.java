package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code short}, a {@code float} and a {@code long} and returns a {@code boolean}.
 */
public interface ShortFloatLong2BoolFn {
    boolean invoke(Short p1, Float p2, Long p3);
}