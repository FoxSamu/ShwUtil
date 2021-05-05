package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, an object and a {@code char} and returns a {@code boolean}.
 */
public interface IntRefChar2BoolFn<P2> {
    boolean invoke(int p1, P2 p2, char p3);
}
