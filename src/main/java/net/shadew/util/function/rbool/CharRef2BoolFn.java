package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code char} and an object and returns a {@code boolean}.
 */
public interface CharRef2BoolFn<P2> {
    boolean invoke(char p1, P2 p2);
}
