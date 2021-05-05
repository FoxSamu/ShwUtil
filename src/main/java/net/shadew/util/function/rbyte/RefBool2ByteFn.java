package net.shadew.util.function.rbyte;

/**
 * A function that takes an object and a {@code boolean} and returns a {@code byte}.
 */
public interface RefBool2ByteFn<P1> {
    byte invoke(P1 p1, boolean p2);
}
