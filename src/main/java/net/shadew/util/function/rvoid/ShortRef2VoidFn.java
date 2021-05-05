package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code short} and an object and returns nothing.
 */
public interface ShortRef2VoidFn<P2> {
    void invoke(short p1, P2 p2);
}
