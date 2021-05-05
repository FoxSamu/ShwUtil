package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code boolean}, an object and a {@code char} and returns a {@code byte}.
 */
public interface BoolRefChar2ByteFn<P2> {
    byte invoke(boolean p1, P2 p2, char p3);
}
