package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, a {@code float} and a {@code double} and returns a {@code byte}.
 */
public interface RefFloatDouble2ByteFn<P1> {
    byte invoke(P1 p1, Float p2, Double p3);
}
