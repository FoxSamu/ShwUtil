package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code short} and an object and returns a {@code byte}.
 */
public interface ShortRef2ByteFn<P2> {
    byte invoke(short p1, P2 p2);
}
