package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, a {@code byte} and an object and returns a {@code char}.
 */
public interface DoubleByteRef2CharFn<P3> {
    char invoke(double p1, byte p2, P3 p3);
}
