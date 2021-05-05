package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code boolean}, an object and an {@code int} and returns a {@code byte}.
 */
public interface BoolRefInt2ByteFn<P2> {
    byte invoke(boolean p1, P2 p2, int p3);
}
