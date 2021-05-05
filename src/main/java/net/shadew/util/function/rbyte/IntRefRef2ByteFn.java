package net.shadew.util.function.rbyte;

/**
 * A function that takes an {@code int}, an object and an object and returns a {@code byte}.
 */
public interface IntRefRef2ByteFn<P2, P3> {
    byte invoke(int p1, P2 p2, P3 p3);
}
