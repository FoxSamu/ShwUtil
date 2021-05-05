package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, an {@code int} and an object and returns a {@code byte}.
 */
public interface RefIntRef2ByteFn<P1, P3> {
    byte invoke(P1 p1, int p2, P3 p3);
}
