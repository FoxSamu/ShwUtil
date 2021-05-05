package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code char}, an object and a {@code char} and returns a {@code boolean}.
 */
public interface CharRefChar2BoolFn<P2> {
    boolean invoke(char p1, P2 p2, char p3);
}
