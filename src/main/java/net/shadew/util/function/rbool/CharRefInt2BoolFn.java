package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code char}, an object and an {@code int} and returns a {@code boolean}.
 */
public interface CharRefInt2BoolFn<P2> {
    boolean invoke(char p1, P2 p2, int p3);
}
