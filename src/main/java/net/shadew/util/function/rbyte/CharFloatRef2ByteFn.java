package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code char}, a {@code float} and an object and returns a {@code byte}.
 */
public interface CharFloatRef2ByteFn<P3> {
    byte invoke(char p1, float p2, P3 p3);
}