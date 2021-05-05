package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code short}, a {@code char} and an object and returns a {@code byte}.
 */
public interface ShortCharRef2ByteFn<P3> {
    byte invoke(short p1, char p2, P3 p3);
}
