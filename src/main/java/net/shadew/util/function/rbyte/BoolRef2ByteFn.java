package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code boolean} and an object and returns a {@code byte}.
 */
public interface BoolRef2ByteFn<P2> {
    byte invoke(boolean p1, P2 p2);
}
