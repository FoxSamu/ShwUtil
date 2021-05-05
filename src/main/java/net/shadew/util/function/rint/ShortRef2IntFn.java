package net.shadew.util.function.rint;

/**
 * A function that takes a {@code short} and an object and returns an {@code int}.
 */
public interface ShortRef2IntFn<P2> {
    int invoke(short p1, P2 p2);
}
