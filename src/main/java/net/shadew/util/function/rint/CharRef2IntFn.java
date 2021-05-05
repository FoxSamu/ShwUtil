package net.shadew.util.function.rint;

/**
 * A function that takes a {@code char} and an object and returns an {@code int}.
 */
public interface CharRef2IntFn<P2> {
    int invoke(char p1, P2 p2);
}
