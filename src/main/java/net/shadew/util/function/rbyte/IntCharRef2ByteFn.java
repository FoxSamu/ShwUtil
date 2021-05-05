package net.shadew.util.function.rbyte;

/**
 * A function that takes an {@code int}, a {@code char} and an object and returns a {@code byte}.
 */
public interface IntCharRef2ByteFn<P3> {
    byte invoke(int p1, char p2, P3 p3);
}
