package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code boolean}, a {@code float} and an object and returns a {@code byte}.
 */
public interface BoolFloatRef2ByteFn<P3> {
    byte invoke(boolean p1, float p2, P3 p3);
}
