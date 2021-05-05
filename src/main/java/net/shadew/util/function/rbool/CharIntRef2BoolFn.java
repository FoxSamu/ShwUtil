package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code char}, an {@code int} and an object and returns a {@code boolean}.
 */
public interface CharIntRef2BoolFn<P3> {
    boolean invoke(char p1, int p2, P3 p3);
}
