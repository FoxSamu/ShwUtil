package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code char}, a {@code short} and an object and returns a {@code byte}.
 */
public interface CharShortRef2ByteFn<P3> {
    byte invoke(char p1, short p2, P3 p3);
}
