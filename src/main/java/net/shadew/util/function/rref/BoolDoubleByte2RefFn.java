package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code double} and a {@code byte} and returns an object.
 */
public interface BoolDoubleByte2RefFn<R> {
    R invoke(Bool p1, Double p2, Byte p3);
}
