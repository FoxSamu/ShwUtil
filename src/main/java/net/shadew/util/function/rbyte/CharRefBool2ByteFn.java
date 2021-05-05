package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code char}, an object and a {@code boolean} and returns a {@code byte}.
 */
public interface CharRefBool2ByteFn<P2> {
    byte invoke(char p1, P2 p2, boolean p3);
}
