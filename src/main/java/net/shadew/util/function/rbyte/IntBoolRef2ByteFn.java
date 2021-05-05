package net.shadew.util.function.rbyte;

/**
 * A function that takes an {@code int}, a {@code boolean} and an object and returns a {@code byte}.
 */
public interface IntBoolRef2ByteFn<P3> {
    byte invoke(int p1, boolean p2, P3 p3);
}
