package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an {@code int} and a {@code char} and returns an object.
 */
public interface FloatIntChar2RefFn<R> {
    R invoke(float p1, int p2, char p3);
}
