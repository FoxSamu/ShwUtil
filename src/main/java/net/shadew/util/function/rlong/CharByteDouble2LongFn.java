package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, a {@code byte} and a {@code double} and returns a {@code long}.
 */
public interface CharByteDouble2LongFn {
    long invoke(char p1, byte p2, double p3);
}