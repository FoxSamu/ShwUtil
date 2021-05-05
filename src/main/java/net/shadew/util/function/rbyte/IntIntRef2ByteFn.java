package net.shadew.util.function.rbyte;

/**
 * A function that takes an {@code int}, an {@code int} and an object and returns a {@code byte}.
 */
public interface IntIntRef2ByteFn<P3> {
    byte invoke(int p1, int p2, P3 p3);
}
