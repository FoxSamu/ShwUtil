package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, an object and a {@code double} and returns a {@code byte}.
 */
public interface RefRefDouble2ByteFn<P1, P2> {
    byte invoke(P1 p1, P2 p2, double p3);
}
