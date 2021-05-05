package net.shadew.util.function.rref;

/**
 * A function that takes no arguments and returns an object.
 */
public interface Ref2RefFn<P1, R> {
    R invoke(P1 p1);
}
