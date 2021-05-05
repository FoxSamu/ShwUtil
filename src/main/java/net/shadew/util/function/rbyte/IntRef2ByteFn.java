package net.shadew.util.function.rbyte;

/**
 * A function that takes an {@code int} and an object and returns a {@code byte}.
 */
public interface IntRef2ByteFn<P2> {
    byte invoke(int p1, P2 p2);
}
