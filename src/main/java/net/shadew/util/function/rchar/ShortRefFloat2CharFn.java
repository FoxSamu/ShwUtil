package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, an object and a {@code float} and returns a {@code char}.
 */
public interface ShortRefFloat2CharFn<P2> {
    char invoke(short p1, P2 p2, float p3);
}
