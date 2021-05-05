package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code char}, an object and an {@code int} and returns a {@code byte}.
 */
public interface CharRefInt2ByteFn<P2> {
    byte invoke(char p1, P2 p2, int p3);
}
