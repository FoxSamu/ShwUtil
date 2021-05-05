package net.shadew.util.function.rint;

/**
 * A function that takes a {@code char}, a {@code short} and an object and returns an {@code int}.
 */
public interface CharShortRef2IntFn<P3> {
    int invoke(char p1, short p2, P3 p3);
}