package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code float}, an {@code int} and an object and returns a {@code byte}.
 */
public interface FloatIntRef2ByteFn<P3> {
    byte invoke(float p1, int p2, P3 p3);
}
