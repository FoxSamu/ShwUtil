package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code char}, an object and an object and returns a {@code byte}.
 */
public interface CharRefRef2ByteFn<P2, P3> {
    byte invoke(char p1, P2 p2, P3 p3);
}
