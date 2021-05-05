package net.shadew.util.function.rbyte;

/**
 * A function that takes an {@code int}, an object and an {@code int} and returns a {@code byte}.
 */
public interface IntRefInt2ByteFn<P2> {
    byte invoke(Int p1, P2 p2, Int p3);
}