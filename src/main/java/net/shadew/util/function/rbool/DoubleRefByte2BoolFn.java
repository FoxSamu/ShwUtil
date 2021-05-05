package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code double}, an object and a {@code byte} and returns a {@code boolean}.
 */
public interface DoubleRefByte2BoolFn<P2> {
    boolean invoke(double p1, P2 p2, byte p3);
}
