package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code boolean}, an object and a {@code byte} and returns a {@code boolean}.
 */
public interface BoolRefByte2BoolFn<P2> {
    boolean invoke(boolean p1, P2 p2, byte p3);
}
