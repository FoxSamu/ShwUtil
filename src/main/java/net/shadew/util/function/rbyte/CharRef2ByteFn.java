package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code char} and an object and returns a {@code byte}.
 */
public interface CharRef2ByteFn<P2> {
    byte invoke(char p1, P2 p2);
}
