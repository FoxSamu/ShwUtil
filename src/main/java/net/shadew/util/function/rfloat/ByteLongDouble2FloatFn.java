package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code byte}, a {@code long} and a {@code double} and returns a {@code float}.
 */
public interface ByteLongDouble2FloatFn {
    float invoke(Byte p1, Long p2, Double p3);
}
