package net.shadew.util.function.rbyte;

/**
 * A function that takes an object and an {@code int} and returns a {@code byte}.
 */
public interface RefInt2ByteFn<P1> {
    byte invoke(P1 p1, int p2);
}
