package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code char}, a {@code long} and an object and returns a {@code boolean}.
 */
public interface CharLongRef2BoolFn<P3> {
    boolean invoke(char p1, long p2, P3 p3);
}
