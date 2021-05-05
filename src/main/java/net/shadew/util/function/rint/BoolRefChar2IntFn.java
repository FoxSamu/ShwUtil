package net.shadew.util.function.rint;

/**
 * A function that takes a {@code boolean}, an object and a {@code char} and returns an {@code int}.
 */
public interface BoolRefChar2IntFn<P2> {
    int invoke(boolean p1, P2 p2, char p3);
}
