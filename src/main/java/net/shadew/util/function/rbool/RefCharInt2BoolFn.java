package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code char} and an {@code int} and returns a {@code boolean}.
 */
public interface RefCharInt2BoolFn<P1> {
    boolean invoke(P1 p1, char p2, int p3);
}
