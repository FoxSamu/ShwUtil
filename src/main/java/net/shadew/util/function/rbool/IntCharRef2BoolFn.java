package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, a {@code char} and an object and returns a {@code boolean}.
 */
public interface IntCharRef2BoolFn<P3> {
    boolean invoke(int p1, char p2, P3 p3);
}
