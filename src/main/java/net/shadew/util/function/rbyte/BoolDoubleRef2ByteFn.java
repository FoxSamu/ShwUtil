package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code boolean}, a {@code double} and an object and returns a {@code byte}.
 */
public interface BoolDoubleRef2ByteFn<P3> {
    byte invoke(boolean p1, double p2, P3 p3);
}
