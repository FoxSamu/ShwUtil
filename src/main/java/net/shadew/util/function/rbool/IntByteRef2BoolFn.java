package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, a {@code byte} and an object and returns a {@code boolean}.
 */
public interface IntByteRef2BoolFn<P3> {
    boolean invoke(Int p1, Byte p2, P3 p3);
}
