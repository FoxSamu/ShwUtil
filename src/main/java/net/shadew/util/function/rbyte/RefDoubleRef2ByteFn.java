package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, a {@code double} and an object and returns a {@code byte}.
 */
public interface RefDoubleRef2ByteFn<P1, P3> {
    byte invoke(P1 p1, double p2, P3 p3);
}
