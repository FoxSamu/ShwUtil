package net.shadew.util.function.rbyte;

/**
 * A function that takes an {@code int}, an object and a {@code float} and returns a {@code byte}.
 */
public interface IntRefFloat2ByteFn<P2> {
    byte invoke(int p1, P2 p2, float p3);
}
