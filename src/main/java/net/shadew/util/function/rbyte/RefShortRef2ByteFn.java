package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, a {@code short} and an object and returns a {@code byte}.
 */
public interface RefShortRef2ByteFn<P1, P3> {
    byte invoke(P1 p1, short p2, P3 p3);
}
