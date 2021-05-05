package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code char}, a {@code long} and an object and returns a {@code byte}.
 */
public interface CharLongRef2ByteFn<P3> {
    byte invoke(char p1, long p2, P3 p3);
}
