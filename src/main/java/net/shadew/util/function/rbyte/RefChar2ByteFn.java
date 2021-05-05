package net.shadew.util.function.rbyte;

/**
 * A function that takes an object and a {@code char} and returns a {@code byte}.
 */
public interface RefChar2ByteFn<P1> {
    byte invoke(P1 p1, char p2);
}
