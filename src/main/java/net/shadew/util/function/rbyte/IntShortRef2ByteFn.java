package net.shadew.util.function.rbyte;

/**
 * A function that takes an {@code int}, a {@code short} and an object and returns a {@code byte}.
 */
public interface IntShortRef2ByteFn<P3> {
    byte invoke(int p1, short p2, P3 p3);
}
