package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, a {@code double} and an object and returns a {@code byte}.
 */
public interface LongDoubleRef2ByteFn<P3> {
    byte invoke(Long p1, Double p2, P3 p3);
}
