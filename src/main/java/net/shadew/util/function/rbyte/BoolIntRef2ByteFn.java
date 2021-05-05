package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code boolean}, an {@code int} and an object and returns a {@code byte}.
 */
public interface BoolIntRef2ByteFn<P3> {
    byte invoke(boolean p1, int p2, P3 p3);
}
