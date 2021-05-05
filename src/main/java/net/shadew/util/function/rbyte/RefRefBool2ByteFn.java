package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, an object and a {@code boolean} and returns a {@code byte}.
 */
public interface RefRefBool2ByteFn<P1, P2> {
    byte invoke(P1 p1, P2 p2, boolean p3);
}
