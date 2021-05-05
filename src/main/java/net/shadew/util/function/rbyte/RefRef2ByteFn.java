package net.shadew.util.function.rbyte;

/**
 * A function that takes an object and an object and returns a {@code byte}.
 */
public interface RefRef2ByteFn<P1, P2> {
    byte invoke(P1 p1, P2 p2);
}
