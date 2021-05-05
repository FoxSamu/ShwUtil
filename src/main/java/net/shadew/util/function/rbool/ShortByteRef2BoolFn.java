package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code short}, a {@code byte} and an object and returns a {@code boolean}.
 */
public interface ShortByteRef2BoolFn<P3> {
    boolean invoke(short p1, byte p2, P3 p3);
}
