package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, a {@code byte} and an object and returns a {@code boolean}.
 */
public interface IntByteRef2BoolFn<P3> {
    boolean invoke(int p1, byte p2, P3 p3);
}
