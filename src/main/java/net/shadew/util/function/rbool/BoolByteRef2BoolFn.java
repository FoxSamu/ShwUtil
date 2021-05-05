package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code boolean}, a {@code byte} and an object and returns a {@code boolean}.
 */
public interface BoolByteRef2BoolFn<P3> {
    boolean invoke(boolean p1, byte p2, P3 p3);
}
