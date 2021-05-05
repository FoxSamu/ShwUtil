package net.shadew.util.function.rint;

/**
 * A function that takes a {@code short}, an object and a {@code char} and returns an {@code int}.
 */
public interface ShortRefChar2IntFn<P2> {
    int invoke(short p1, P2 p2, char p3);
}
