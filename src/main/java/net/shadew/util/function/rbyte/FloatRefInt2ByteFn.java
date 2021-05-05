package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code float}, an object and an {@code int} and returns a {@code byte}.
 */
public interface FloatRefInt2ByteFn<P2> {
    byte invoke(float p1, P2 p2, int p3);
}
