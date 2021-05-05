package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code char}, an object and a {@code double} and returns a {@code byte}.
 */
public interface CharRefDouble2ByteFn<P2> {
    byte invoke(char p1, P2 p2, double p3);
}
