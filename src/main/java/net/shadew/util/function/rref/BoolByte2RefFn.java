package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean} and a {@code byte} and returns an object.
 */
public interface BoolByte2RefFn<R> {
    R invoke(boolean p1, byte p2);
}
