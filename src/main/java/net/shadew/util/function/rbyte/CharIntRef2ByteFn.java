package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code char}, an {@code int} and an object and returns a {@code byte}.
 */
public interface CharIntRef2ByteFn<P3> {
    byte invoke(char p1, int p2, P3 p3);
}
