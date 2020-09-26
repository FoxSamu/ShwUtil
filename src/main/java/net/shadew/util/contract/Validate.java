/*
 * Copyright (c) 2020 Shadew
 * Licensed under the Apache 2.0 License
 */

package net.shadew.util.contract;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;

/**
 * A utility class to validate contracts. These may be used to ensure method parameters have certain values, or to
 * ensure the flow of a program remains stable.
 */
public final class Validate {
    private Validate() {
    }

    /**
     * Fails per definition, throwing an {@link UnsupportedOperationException} with the given message.
     *
     * @param problem The message of the exception being thrown
     * @throws UnsupportedOperationException Thrown per definition
     */
    public static <T> T unsupported(String problem) {
        throw new UnsupportedOperationException(problem);
    }

    /**
     * Fails per definition, throwing an {@link IllegalArgumentException} with the given message.
     *
     * @param problem The message of the exception being thrown
     * @throws IllegalArgumentException Thrown per definition
     */
    public static <T> T illegalArgument(String problem) {
        throw new IllegalArgumentException(problem);
    }

    /**
     * Fails per definition, throwing an {@link IllegalStateException} with the given message. This has a return value
     * which adapts to any type, so that a return statement can easily be made in unreachable code.
     *
     * @param problem The message of the exception being thrown
     * @return Nothing
     *
     * @throws IllegalStateException Thrown per definition
     */
    @NotNull
    public static <T> T illegalState(String problem) {
        throw new IllegalStateException(problem);
    }

    /**
     * Fails per definition, throwing an {@link IllegalStateException} without a mesage. This has a return value which
     * adapts to any type, so that a return statement can easily be made in unreachable code.
     *
     * @return Nothing
     *
     * @throws IllegalStateException Thrown per definition
     */
    @NotNull
    public static <T> T illegalState() {
        return illegalState(null);
    }

    /**
     * Fails per definition, throwing an {@link NullPointerException} with the given message. This has a return value
     * which adapts to any type, so that a return statement can easily be made in unreachable code.
     *
     * @param problem The message of the exception being thrown
     * @return Nothing
     *
     * @throws NullPointerException Thrown per definition
     */
    @NotNull
    public static <T> T npe(String problem) {
        throw new NullPointerException(problem);
    }

    /**
     * Fails per definition, throwing an {@link NullPointerException} without a mesage. This has a return value which
     * adapts to any type, so that a return statement can easily be made in unreachable code.
     *
     * @return Nothing
     *
     * @throws NullPointerException Thrown per definition
     */
    @NotNull
    public static <T> T npe() {
        return npe(null);
    }

    /**
     * Fails per definition, throwing an {@link IndexOutOfBoundsException} with the given message. This has a return
     * value which adapts to any type, so that a return statement can easily be made in unreachable code.
     *
     * @param problem The message of the exception being thrown
     * @return Nothing
     *
     * @throws IndexOutOfBoundsException Thrown per definition
     */
    @NotNull
    public static <T> T indexOutOfBounds(String problem) {
        throw new NullPointerException(problem);
    }

    /**
     * Fails per definition, throwing an {@link IndexOutOfBoundsException} with the message "[index] is out of bounds".
     * This has a return value which adapts to any type, so that a return statement can easily be made in unreachable
     * code.
     *
     * @param i The index that was out of bounds
     * @return Nothing
     *
     * @throws IndexOutOfBoundsException Thrown per definition
     */
    @NotNull
    public static <T> T indexOutOfBounds(int i) {
        return indexOutOfBounds(i + " is out of bounds");
    }

    /**
     * Fails per definition, throwing an {@link IndexOutOfBoundsException} without a mesage. This has a return value
     * which adapts to any type, so that a return statement can easily be made in unreachable code.
     *
     * @return Nothing
     *
     * @throws IndexOutOfBoundsException Thrown per definition
     */
    @NotNull
    public static <T> T indexOutOfBounds() {
        return indexOutOfBounds(null);
    }

    /**
     * Requires the given boolean to be true.
     *
     * @param expr    The condition that needs to be met
     * @param problem The problem if the condition is not met
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void isTrue(boolean expr, String problem) {
        if (!expr)
            throw new IllegalArgumentException(problem);
    }

    /**
     * Requires the given boolean to be true, throwing a given exception type if not
     *
     * @param expr        The condition that needs to be met
     * @param problem     The problem if the condition is not met
     * @param exceptionFn The function to generate a specific exception if the condition was not met
     * @throws X When the contract is violated
     */
    public static <X extends Throwable> void isTrue(boolean expr, String problem, Function<? super String, ? extends X> exceptionFn) throws X {
        if (!expr)
            throw exceptionFn.apply(problem);
    }

    /**
     * Requires the given boolean to be false.
     *
     * @param expr    The condition that needs to be not met
     * @param problem The problem if the condition is met
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void isFalse(boolean expr, String problem) {
        if (expr)
            throw new IllegalArgumentException(problem);
    }

    /**
     * Requires the given boolean to be false, throwing a given exception type if not
     *
     * @param expr        The condition that needs to be met
     * @param problem     The problem if the condition is not met
     * @param exceptionFn The function to generate a specific exception if the condition was not met
     * @throws X When the contract is violated
     */
    public static <X extends Throwable> void isFalse(boolean expr, String problem, Function<? super String, ? extends X> exceptionFn) throws X {
        if (expr)
            throw exceptionFn.apply(problem);
    }

    /**
     * Requires the given argument to be not null.
     *
     * @param param The parameter to be not null
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws NullPointerException When the contract is violated
     */
    public static void notNull(Object param, String name) {
        if (param == null)
            throw new NullPointerException(name + " == null");
    }

    /**
     * Requires the given argument to be less than the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The upper limit, which is exclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void less(int param, int limit, String name) {
        if (param >= limit)
            throw new IllegalArgumentException(name + " >= " + limit);
    }

    /**
     * Requires the given argument to be less than the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The upper limit, which is exclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void less(long param, long limit, String name) {
        if (param >= limit)
            throw new IllegalArgumentException(name + " >= " + limit);
    }

    /**
     * Requires the given argument to be less than the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The upper limit, which is exclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void less(float param, float limit, String name) {
        if (param >= limit)
            throw new IllegalArgumentException(name + " >= " + limit);
    }

    /**
     * Requires the given argument to be less than the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The upper limit, which is exclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void less(double param, double limit, String name) {
        if (param >= limit)
            throw new IllegalArgumentException(name + " >= " + limit);
    }

    /**
     * Requires the given argument to be more than the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The lower limit, which is exclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void more(int param, int limit, String name) {
        if (param <= limit)
            throw new IllegalArgumentException(name + " <= " + limit);
    }

    /**
     * Requires the given argument to be more than the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The lower limit, which is exclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void more(long param, long limit, String name) {
        if (param <= limit)
            throw new IllegalArgumentException(name + " <= " + limit);
    }

    /**
     * Requires the given argument to be more than the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The lower limit, which is exclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void more(float param, float limit, String name) {
        if (param <= limit)
            throw new IllegalArgumentException(name + " <= " + limit);
    }

    /**
     * Requires the given argument to be more than the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The lower limit, which is exclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void more(double param, double limit, String name) {
        if (param <= limit)
            throw new IllegalArgumentException(name + " <= " + limit);
    }

    /**
     * Requires the given argument to be less than or equal to the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The upper limit, which is inclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void lessOrEqual(int param, int limit, String name) {
        if (param > limit)
            throw new IllegalArgumentException(name + " > " + limit);
    }

    /**
     * Requires the given argument to be less than or equal to the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The upper limit, which is inclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void lessOrEqual(long param, long limit, String name) {
        if (param > limit)
            throw new IllegalArgumentException(name + " > " + limit);
    }

    /**
     * Requires the given argument to be less than or equal to the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The upper limit, which is inclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void lessOrEqual(float param, float limit, String name) {
        if (param > limit)
            throw new IllegalArgumentException(name + " > " + limit);
    }

    /**
     * Requires the given argument to be less than or equal to the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The upper limit, which is inclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void lessOrEqual(double param, double limit, String name) {
        if (param > limit)
            throw new IllegalArgumentException(name + " > " + limit);
    }

    /**
     * Requires the given argument to be more than or equal to the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The lower limit, which is inclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void moreOrEqual(int param, int limit, String name) {
        if (param < limit)
            throw new IllegalArgumentException(name + " < " + limit);
    }

    /**
     * Requires the given argument to be more than or equal to the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The lower limit, which is inclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void moreOrEqual(long param, long limit, String name) {
        if (param < limit)
            throw new IllegalArgumentException(name + " < " + limit);
    }

    /**
     * Requires the given argument to be more than or equal to the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The lower limit, which is inclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void moreOrEqual(float param, float limit, String name) {
        if (param < limit)
            throw new IllegalArgumentException(name + " < " + limit);
    }

    /**
     * Requires the given argument to be more than or equal to the given limit.
     *
     * @param param The parameter to be limited
     * @param limit The lower limit, which is inclusive
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void moreOrEqual(double param, double limit, String name) {
        if (param < limit)
            throw new IllegalArgumentException(name + " < " + limit);
    }

    /**
     * Requires the given argument to be equal to the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void equal(int param, int limit, String name) {
        if (param != limit)
            throw new IllegalArgumentException(name + " != " + limit);
    }

    /**
     * Requires the given argument to be equal to the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void equal(long param, long limit, String name) {
        if (param != limit)
            throw new IllegalArgumentException(name + " != " + limit);
    }

    /**
     * Requires the given argument to be equal to the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void equal(float param, float limit, String name) {
        if (param != limit)
            throw new IllegalArgumentException(name + " != " + limit);
    }

    /**
     * Requires the given argument to be equal to the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void equal(double param, double limit, String name) {
        if (param != limit)
            throw new IllegalArgumentException(name + " != " + limit);
    }

    /**
     * Requires the given argument to be not equal to the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be not equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notEqual(int param, int limit, String name) {
        if (param == limit)
            throw new IllegalArgumentException(name + " == " + limit);
    }

    /**
     * Requires the given argument to be not equal to the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be not equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notEqual(long param, long limit, String name) {
        if (param == limit)
            throw new IllegalArgumentException(name + " == " + limit);
    }

    /**
     * Requires the given argument to be not equal to the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be not equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notEqual(float param, float limit, String name) {
        if (param == limit)
            throw new IllegalArgumentException(name + " == " + limit);
    }

    /**
     * Requires the given argument to be not equal to the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be not equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notEqual(double param, double limit, String name) {
        if (param == limit)
            throw new IllegalArgumentException(name + " == " + limit);
    }

    /**
     * Requires the given argument to be equal to the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void equal(String param, String limit, String name) {
        if (!Objects.equals(param, limit))
            throw new IllegalArgumentException(name + " != " + limit);
    }

    /**
     * Requires the given argument to be not equal to the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be not equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notEqual(String param, String limit, String name) {
        if (Objects.equals(param, limit))
            throw new IllegalArgumentException(name + " == " + limit);
    }

    /**
     * Requires the given argument to be equal to the given value, ignoring upper case and lower case.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void equalCaseInsensitive(String param, String limit, String name) {
        if (param == null && limit == null) return;
        if (param == null || !param.equalsIgnoreCase(limit))
            throw new IllegalArgumentException(name + " != " + limit);
    }

    /**
     * Requires the given argument to be not equal to the given value, ignoring upper case and lower case.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be not equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notEqualCaseInsensitive(String param, String limit, String name) {
        if (param == null && limit != null) return;
        if (param == null || param.equalsIgnoreCase(limit))
            throw new IllegalArgumentException(name + " == " + limit);
    }

    /**
     * Requires the given argument to be equal to the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void equal(Object param, Object limit, String name) {
        if (!Objects.equals(param, limit))
            throw new IllegalArgumentException(name + " != " + limit);
    }

    /**
     * Requires the given argument to be not equal to the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be not equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notEqual(Object param, Object limit, String name) {
        if (Objects.equals(param, limit))
            throw new IllegalArgumentException(name + " == " + limit);
    }

    /**
     * Requires the given argument to be the exact same value the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void refEqual(Object param, Object limit, String name) {
        if (param != limit)
            throw new IllegalArgumentException(name + " != " + limit);
    }

    /**
     * Requires the given argument to be not the exact same value as the given value.
     *
     * @param param The parameter to be limited
     * @param limit The limit to which the value should be not equal
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void refNotEqual(Object param, Object limit, String name) {
        if (param == limit)
            throw new IllegalArgumentException(name + " == " + limit);
    }

    /**
     * Requires the given argument to be not zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notZero(int param, String name) {
        notEqual(param, 0, name);
    }

    /**
     * Requires the given argument to be not zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notZero(long param, String name) {
        notEqual(param, 0, name);
    }

    /**
     * Requires the given argument to be not zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notZero(float param, String name) {
        notEqual(param, 0, name);
    }

    /**
     * Requires the given argument to be not zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notZero(double param, String name) {
        notEqual(param, 0, name);
    }

    /**
     * Requires the given argument to be zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void zero(int param, String name) {
        equal(param, 0, name);
    }

    /**
     * Requires the given argument to be zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void zero(long param, String name) {
        equal(param, 0, name);
    }

    /**
     * Requires the given argument to be zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void zero(float param, String name) {
        equal(param, 0, name);
    }

    /**
     * Requires the given argument to be zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void zero(double param, String name) {
        equal(param, 0, name);
    }

    /**
     * Requires the given argument to be zero or higher.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notNegative(int param, String name) {
        moreOrEqual(param, 0, name);
    }

    /**
     * Requires the given argument to be zero or higher.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notNegative(long param, String name) {
        moreOrEqual(param, 0, name);
    }

    /**
     * Requires the given argument to be zero or higher.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notNegative(float param, String name) {
        moreOrEqual(param, 0, name);
    }

    /**
     * Requires the given argument to be zero or higher.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notNegative(double param, String name) {
        moreOrEqual(param, 0, name);
    }

    /**
     * Requires the given argument to be less than zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void negative(int param, String name) {
        less(param, 0, name);
    }

    /**
     * Requires the given argument to be less than zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void negative(long param, String name) {
        less(param, 0, name);
    }

    /**
     * Requires the given argument to be less than zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void negative(float param, String name) {
        less(param, 0, name);
    }

    /**
     * Requires the given argument to be less than zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void negative(double param, String name) {
        less(param, 0, name);
    }

    /**
     * Requires the given argument to be zero or less.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notPositive(int param, String name) {
        lessOrEqual(param, 0, name);
    }

    /**
     * Requires the given argument to be zero or less.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notPositive(long param, String name) {
        lessOrEqual(param, 0, name);
    }

    /**
     * Requires the given argument to be zero or less.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notPositive(float param, String name) {
        lessOrEqual(param, 0, name);
    }

    /**
     * Requires the given argument to be zero or less.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notPositive(double param, String name) {
        lessOrEqual(param, 0, name);
    }

    /**
     * Requires the given argument to be more than zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void positive(int param, String name) {
        more(param, 0, name);
    }

    /**
     * Requires the given argument to be more than zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void positive(long param, String name) {
        more(param, 0, name);
    }

    /**
     * Requires the given argument to be more than zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void positive(float param, String name) {
        more(param, 0, name);
    }

    /**
     * Requires the given argument to be more than zero.
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void positive(double param, String name) {
        more(param, 0, name);
    }

    /**
     * Requires the given argument to be in the range from 0 to 1 (both inclusive).
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void unitPositive(float param, String name) {
        notNegative(param, name);
        lessOrEqual(param, 1, name);
    }

    /**
     * Requires the given argument to be in the range from 0 to 1 (both inclusive).
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void unitPositive(double param, String name) {
        notNegative(param, name);
        lessOrEqual(param, 1, name);
    }

    /**
     * Requires the given argument to be in the range from -1 to 0 (both inclusive).
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void unitNegative(float param, String name) {
        notPositive(param, name);
        moreOrEqual(param, -1, name);
    }

    /**
     * Requires the given argument to be in the range from -1 to 0 (both inclusive).
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void unitNegative(double param, String name) {
        notPositive(param, name);
        moreOrEqual(param, -1, name);
    }

    /**
     * Requires the given argument to be in the range from -1 to 1 (both inclusive).
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void unit(float param, String name) {
        lessOrEqual(param, 1, name);
        moreOrEqual(param, -1, name);
    }

    /**
     * Requires the given argument to be in the range from -1 to 1 (both inclusive).
     *
     * @param param The parameter to be limited
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void unit(double param, String name) {
        lessOrEqual(param, 1, name);
        moreOrEqual(param, -1, name);
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void empty(CharSequence param, String name) {
        notNull(param, name);
        if (param.length() != 0)
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notEmpty(CharSequence param, String name) {
        notNull(param, name);
        if (param.length() == 0)
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void empty(Collection<?> param, String name) {
        notNull(param, name);
        if (param.size() != 0)
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notEmpty(Collection<?> param, String name) {
        notNull(param, name);
        if (param.size() == 0)
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void empty(Iterable<?> param, String name) {
        notNull(param, name);
        if (param.iterator().hasNext())
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notEmpty(Iterable<?> param, String name) {
        notNull(param, name);
        if (!param.iterator().hasNext())
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void empty(Map<?, ?> param, String name) {
        notNull(param, name);
        if (param.size() != 0)
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notEmpty(Map<?, ?> param, String name) {
        notNull(param, name);
        if (param.size() == 0)
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void empty(byte[] param, String name) {
        notNull(param, name);
        if (param.length != 0)
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notEmpty(byte[] param, String name) {
        notNull(param, name);
        if (param.length == 0)
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void empty(short[] param, String name) {
        notNull(param, name);
        if (param.length != 0)
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notEmpty(short[] param, String name) {
        notNull(param, name);
        if (param.length == 0)
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void empty(int[] param, String name) {
        notNull(param, name);
        if (param.length != 0)
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notEmpty(int[] param, String name) {
        notNull(param, name);
        if (param.length == 0)
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void empty(long[] param, String name) {
        notNull(param, name);
        if (param.length != 0)
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notEmpty(long[] param, String name) {
        notNull(param, name);
        if (param.length == 0)
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void empty(float[] param, String name) {
        notNull(param, name);
        if (param.length != 0)
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notEmpty(float[] param, String name) {
        notNull(param, name);
        if (param.length == 0)
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void empty(double[] param, String name) {
        notNull(param, name);
        if (param.length != 0)
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notEmpty(double[] param, String name) {
        notNull(param, name);
        if (param.length == 0)
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void empty(boolean[] param, String name) {
        notNull(param, name);
        if (param.length != 0)
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notEmpty(boolean[] param, String name) {
        notNull(param, name);
        if (param.length == 0)
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void empty(char[] param, String name) {
        notNull(param, name);
        if (param.length != 0)
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notEmpty(char[] param, String name) {
        notNull(param, name);
        if (param.length == 0)
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be empty and not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static <T> void empty(T[] param, String name) {
        notNull(param, name);
        if (param.length != 0)
            throw new IllegalArgumentException(name + " is not empty");
    }

    /**
     * Requires the given argument to be nonempty and thus not null.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static <T> void notEmpty(T[] param, String name) {
        notNull(param, name);
        if (param.length == 0)
            throw new IllegalArgumentException(name + " is empty");
    }

    /**
     * Requires the given argument to be one of the allowed options.
     *
     * @param param   The parameter to be checked
     * @param name    The name of the parameter, for use in the exception being thrown when the contract is violated
     * @param options A list of options
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void oneOf(int param, String name, int... options) {
        for (int option : options) {
            if (option == param) return;
        }
        throw new IllegalArgumentException(name + " is not one of the allowed options");
    }

    /**
     * Requires the given argument to be none of the restricted options.
     *
     * @param param   The parameter to be checked
     * @param name    The name of the parameter, for use in the exception being thrown when the contract is violated
     * @param options A list of options
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void noneOf(int param, String name, int... options) {
        for (int option : options) {
            if (option == param)
                throw new IllegalArgumentException(name + " is one of the forbidden options");
        }
    }

    /**
     * Requires the given argument to be one of the allowed options.
     *
     * @param param   The parameter to be checked
     * @param name    The name of the parameter, for use in the exception being thrown when the contract is violated
     * @param options A list of options
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void oneOf(long param, String name, long... options) {
        for (long option : options) {
            if (option == param) return;
        }
        throw new IllegalArgumentException(name + " is not one of the allowed options");
    }

    /**
     * Requires the given argument to be none of the restricted options.
     *
     * @param param   The parameter to be checked
     * @param name    The name of the parameter, for use in the exception being thrown when the contract is violated
     * @param options A list of options
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void noneOf(long param, String name, long... options) {
        for (long option : options) {
            if (option == param)
                throw new IllegalArgumentException(name + " is one of the forbidden options");
        }
    }

    /**
     * Requires the given argument to be one of the allowed options.
     *
     * @param param   The parameter to be checked
     * @param name    The name of the parameter, for use in the exception being thrown when the contract is violated
     * @param options A list of options
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void oneOf(String param, String name, String... options) {
        for (String option : options) {
            if (Objects.equals(option, param)) return;
        }
        throw new IllegalArgumentException(name + " is not one of the allowed options");
    }

    /**
     * Requires the given argument to be none of the restricted options.
     *
     * @param param   The parameter to be checked
     * @param name    The name of the parameter, for use in the exception being thrown when the contract is violated
     * @param options A list of options
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void noneOf(String param, String name, String... options) {
        for (String option : options) {
            if (Objects.equals(option, param))
                throw new IllegalArgumentException(name + " is one of the forbidden options");
        }
    }

    /**
     * Requires the given argument to be not null and to start with the given string.
     *
     * @param param The parameter to be checked
     * @param start The string the argument should start with
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void startWith(String param, String start, String name) {
        notNull(param, name);
        if (!param.startsWith(start))
            throw new IllegalArgumentException(name + " does not start with '" + start + "'");
    }

    /**
     * Requires the given argument to be not null and not to start with the given string.
     *
     * @param param The parameter to be checked
     * @param start The string the argument should not start with
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void noStartWith(String param, String start, String name) {
        notNull(param, name);
        if (param.startsWith(start))
            throw new IllegalArgumentException(name + " starts with '" + start + "'");
    }

    /**
     * Requires the given argument to be not null and to end with the given string.
     *
     * @param param The parameter to be checked
     * @param end   The string the argument should end with
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void endWith(String param, String end, String name) {
        notNull(param, name);
        if (!param.endsWith(end))
            throw new IllegalArgumentException(name + " does not end with '" + end + "'");
    }

    /**
     * Requires the given argument to be not null and not to end with the given string.
     *
     * @param param The parameter to be checked
     * @param end   The string the argument should not end with
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void noEndWith(String param, String end, String name) {
        notNull(param, name);
        if (param.endsWith(end))
            throw new IllegalArgumentException(name + " ends with '" + end + "'");
    }

    /**
     * Requires the given argument to be not null and to match the given pattern.
     *
     * @param param   The parameter to be checked
     * @param pattern The pattern the string should match with
     * @param name    The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void match(String param, String pattern, String name) {
        notNull(param, name);
        if (!param.matches(pattern))
            throw new IllegalArgumentException(name + " does not match '" + pattern + "'");
    }

    /**
     * Requires the given argument to be not null and not to match the given pattern.
     *
     * @param param   The parameter to be checked
     * @param pattern The pattern the string should not match with
     * @param name    The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void noMatch(String param, String pattern, String name) {
        notNull(param, name);
        if (param.matches(pattern))
            throw new IllegalArgumentException(name + " matches '" + pattern + "'");
    }

    /**
     * Requires the given argument to be not null and to match the given pattern.
     *
     * @param param   The parameter to be checked
     * @param pattern The pattern the string should match with
     * @param name    The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void match(String param, Pattern pattern, String name) {
        notNull(param, name);
        if (!pattern.matcher(param).matches())
            throw new IllegalArgumentException(name + " does not match '" + pattern.pattern() + "'");
    }

    /**
     * Requires the given argument to be not null and not to match the given pattern.
     *
     * @param param   The parameter to be checked
     * @param pattern The pattern the string should not match with
     * @param name    The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void noMatch(String param, Pattern pattern, String name) {
        notNull(param, name);
        if (pattern.matcher(param).matches())
            throw new IllegalArgumentException(name + " matches '" + pattern.pattern() + "'");
    }

    /**
     * Requires the given argument to be not null and to be completely in lower case.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void lowerCase(String param, String name) {
        notNull(param, name);
        if (!param.toLowerCase().equals(param))
            throw new IllegalArgumentException(name + " is not fully lower case");
    }

    /**
     * Requires the given argument to be not null and to be completely in upper case.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void upperCase(String param, String name) {
        notNull(param, name);
        if (!param.toUpperCase().equals(param))
            throw new IllegalArgumentException(name + " is not fully upper case");
    }

    /**
     * Requires the given argument to be not null and to have no null elements.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static <T> void notNullElements(T[] param, String name) {
        notNull(param, name);
        for (T t : param) {
            if (t == null)
                throw new NullPointerException(name + " has null elements");
        }
    }

    /**
     * Requires the given argument to be not null and to have no null elements.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notNullElements(Iterable<?> param, String name) {
        notNull(param, name);
        for (Object o : param) {
            if (o == null)
                throw new NullPointerException(name + " has null elements");
        }
    }

    /**
     * Requires the given map to be not null and to have no null values.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notNullValues(Map<?, ?> param, String name) {
        notNull(param, name);
        for (Object o : param.values()) {
            if (o == null)
                throw new NullPointerException(name + " has null values");
        }
    }

    /**
     * Requires the given map to be not null and to have no null keys.
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void notNullKeys(Map<?, ?> param, String name) {
        notNull(param, name);
        for (Object o : param.keySet()) {
            if (o == null)
                throw new NullPointerException(name + " has null keys");
        }
    }

    /**
     * Requires the given object to be an instance of the given class, or to be null.
     *
     * @param param The parameter to be checked
     * @param type  The class the parameter should be an instance of
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void ofType(Object param, Class<?> type, String name) {
        if (param == null) return;
        if (!type.isInstance(param))
            throw new IllegalArgumentException(name + " is not an instance of " + type.getSimpleName());
    }

    /**
     * Requires the given object not to be an instance of the given class, or to be null.
     *
     * @param param The parameter to be checked
     * @param type  The class the parameter should not be an instance of
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     */
    public static void notOfType(Object param, Class<?> type, String name) {
        if (param == null) return;
        if (type.isInstance(param))
            throw new IllegalArgumentException(name + " is an instance of " + type.getSimpleName());
    }

    /**
     * Requires the given map to be not null and to have a certain key
     *
     * @param param The parameter to be checked
     * @param key   The key that should be in the map
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static <K> void hasKey(Map<? extends K, ?> param, K key, String name) {
        notNull(param, name);
        if (!param.containsKey(key))
            throw new IllegalArgumentException(name + " has no key '" + key + "'");
    }

    /**
     * Requires the given map to be not null and to have a certain key not
     *
     * @param param The parameter to be checked
     * @param key   The key that should be in the map
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static <K> void hasNoKey(Map<? extends K, ?> param, K key, String name) {
        notNull(param, name);
        if (param.containsKey(key))
            throw new IllegalArgumentException(name + " has key '" + key + "'");
    }

    /**
     * Requires the given iterator to be not null and to have any elements left
     *
     * @param param The parameter to be checked
     * @param name  The name of the parameter, for use in the exception being thrown when the contract is violated
     * @throws IllegalArgumentException When the contract is violated
     * @throws NullPointerException     When the given argument is null
     */
    public static void hasNext(Iterator<?> param, String name) {
        notNull(param, name);
        if (!param.hasNext())
            throw new NoSuchElementException(name + " has no elements left");
    }

    /**
     * Requires the given index to be in the specified length bounds, ranging from 0 (inclusive) to the length
     * (exclusive).
     *
     * @param length The length bound
     * @param index  The index
     * @throws IndexOutOfBoundsException When the contract is violated
     */
    public static void indexInBounds(int length, int index) {
        if (index < 0 || index >= length)
            throw new IndexOutOfBoundsException(index + "");
    }

    /**
     * Requires the given index to be in the specified array, ranging from 0 (inclusive) to the length (exclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexInBounds(byte[] arr, int index) {
        notNull(arr, "arr");
        indexInBounds(arr.length, index);
    }

    /**
     * Requires the given index to be in the specified array, ranging from 0 (inclusive) to the length (exclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexInBounds(short[] arr, int index) {
        notNull(arr, "arr");
        indexInBounds(arr.length, index);
    }

    /**
     * Requires the given index to be in the specified array, ranging from 0 (inclusive) to the length (exclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexInBounds(int[] arr, int index) {
        notNull(arr, "arr");
        indexInBounds(arr.length, index);
    }

    /**
     * Requires the given index to be in the specified array, ranging from 0 (inclusive) to the length (exclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexInBounds(long[] arr, int index) {
        notNull(arr, "arr");
        indexInBounds(arr.length, index);
    }

    /**
     * Requires the given index to be in the specified array, ranging from 0 (inclusive) to the length (exclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexInBounds(float[] arr, int index) {
        notNull(arr, "arr");
        indexInBounds(arr.length, index);
    }

    /**
     * Requires the given index to be in the specified array, ranging from 0 (inclusive) to the length (exclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexInBounds(double[] arr, int index) {
        notNull(arr, "arr");
        indexInBounds(arr.length, index);
    }

    /**
     * Requires the given index to be in the specified array, ranging from 0 (inclusive) to the length (exclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexInBounds(boolean[] arr, int index) {
        notNull(arr, "arr");
        indexInBounds(arr.length, index);
    }

    /**
     * Requires the given index to be in the specified array, ranging from 0 (inclusive) to the length (exclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexInBounds(char[] arr, int index) {
        notNull(arr, "arr");
        indexInBounds(arr.length, index);
    }

    /**
     * Requires the given index to be in the specified array, ranging from 0 (inclusive) to the length (exclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static <T> void indexInBounds(T[] arr, int index) {
        notNull(arr, "arr");
        indexInBounds(arr.length, index);
    }

    /**
     * Requires the given index to be in the specified collection, ranging from 0 (inclusive) to the length
     * (exclusive).
     *
     * @param c     The collection to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the collection is null
     */
    public static void indexInBounds(Collection<?> c, int index) {
        notNull(c, "c");
        indexInBounds(c.size(), index);
    }

    /**
     * Requires the given index to be in the specified char sequence, ranging from 0 (inclusive) to the length
     * (exclusive).
     *
     * @param seq   The sequence to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the sequence is null
     */
    public static void indexInBounds(CharSequence seq, int index) {
        notNull(seq, "seq");
        indexInBounds(seq.length(), index);
    }

    /**
     * Requires the given index to be on the specified length bounds, ranging from 0 (inclusive) to the length
     * (inclusive).
     *
     * @param length The length bound
     * @param index  The index
     * @throws IndexOutOfBoundsException When the contract is violated
     */
    public static void indexOnBounds(int length, int index) {
        indexInBounds(length + 1, index);
    }

    /**
     * Requires the given index to be on the specified array, ranging from 0 (inclusive) to the length (inclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexOnBounds(byte[] arr, int index) {
        notNull(arr, "arr");
        indexOnBounds(arr.length, index);
    }

    /**
     * Requires the given index to be on the specified array, ranging from 0 (inclusive) to the length (inclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexOnBounds(short[] arr, int index) {
        notNull(arr, "arr");
        indexOnBounds(arr.length, index);
    }

    /**
     * Requires the given index to be on the specified array, ranging from 0 (inclusive) to the length (inclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexOnBounds(int[] arr, int index) {
        notNull(arr, "arr");
        indexOnBounds(arr.length, index);
    }

    /**
     * Requires the given index to be on the specified array, ranging from 0 (inclusive) to the length (inclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexOnBounds(long[] arr, int index) {
        notNull(arr, "arr");
        indexOnBounds(arr.length, index);
    }

    /**
     * Requires the given index to be on the specified array, ranging from 0 (inclusive) to the length (inclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexOnBounds(float[] arr, int index) {
        notNull(arr, "arr");
        indexOnBounds(arr.length, index);
    }

    /**
     * Requires the given index to be on the specified array, ranging from 0 (inclusive) to the length (inclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexOnBounds(double[] arr, int index) {
        notNull(arr, "arr");
        indexOnBounds(arr.length, index);
    }

    /**
     * Requires the given index to be on the specified array, ranging from 0 (inclusive) to the length (inclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexOnBounds(boolean[] arr, int index) {
        notNull(arr, "arr");
        indexOnBounds(arr.length, index);
    }

    /**
     * Requires the given index to be on the specified array, ranging from 0 (inclusive) to the length (inclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void indexOnBounds(char[] arr, int index) {
        notNull(arr, "arr");
        indexOnBounds(arr.length, index);
    }

    /**
     * Requires the given index to be on the specified array, ranging from 0 (inclusive) to the length (inclusive).
     *
     * @param arr   The array to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static <T> void indexOnBounds(T[] arr, int index) {
        notNull(arr, "arr");
        indexOnBounds(arr.length, index);
    }

    /**
     * Requires the given index to be on the specified collection, ranging from 0 (inclusive) to the length
     * (inclusive).
     *
     * @param c     The collection to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the collection is null
     */
    public static void indexOnBounds(Collection<?> c, int index) {
        notNull(c, "c");
        indexOnBounds(c.size(), index);
    }

    /**
     * Requires the given index to be on the specified char sequence, ranging from 0 (inclusive) to the length
     * (inclusive).
     *
     * @param seq   The sequence to check the index for
     * @param index The index
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the sequence is null
     */
    public static void indexOnBounds(CharSequence seq, int index) {
        notNull(seq, "seq");
        indexOnBounds(seq.length(), index);
    }

    /**
     * Requires the given offset-length range to be a valid range within the specified bounds, such that:
     * <ul>
     * <li>{@code off >= 0}</li>
     * <li>{@code len >= 0}</li>
     * <li>{@code off + len <= bound}</li>
     * </ul>
     *
     * @param bound     The length bound
     * @param off       The offset
     * @param len       The length
     * @param boundName The length bound parameter name, for use in the exception being thrown when the contract is
     *                  violated
     * @param offName   The offset parameter name, for use in the exception being thrown when the contract is violated
     * @param lenName   The length parameter name, for use in the exception being thrown when the contract is violated
     * @throws IndexOutOfBoundsException When the contract is violated
     */
    public static void rangeValid(int bound, int off, int len, String boundName, String offName, String lenName) {
        if (off < 0)
            throw new IndexOutOfBoundsException(offName + " < 0");
        if (len < 0)
            throw new IndexOutOfBoundsException(lenName + " < 0");
        if (off + len > bound)
            throw new IndexOutOfBoundsException(offName + " + " + lenName + " > " + boundName);
    }

    /**
     * Requires the given offset-length range to be a valid range within the bound of the specified array, such that:
     * <ul>
     * <li>{@code off >= 0}</li>
     * <li>{@code len >= 0}</li>
     * <li>{@code off + len <= arr.length}</li>
     * </ul>
     *
     * @param arr     The array
     * @param off     The offset
     * @param len     The length
     * @param arrName The array parameter name, for use in the exception being thrown when the contract is violated
     * @param offName The offset parameter name, for use in the exception being thrown when the contract is violated
     * @param lenName The length parameter name, for use in the exception being thrown when the contract is violated
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void rangeValid(byte[] arr, int off, int len, String arrName, String offName, String lenName) {
        notNull(arr, arrName);
        rangeValid(arr.length, off, len, arrName + ".length", offName, lenName);
    }

    /**
     * Requires the given offset-length range to be a valid range within the bound of the specified array, such that:
     * <ul>
     * <li>{@code off >= 0}</li>
     * <li>{@code len >= 0}</li>
     * <li>{@code off + len <= arr.length}</li>
     * </ul>
     *
     * @param arr     The array
     * @param off     The offset
     * @param len     The length
     * @param arrName The array parameter name, for use in the exception being thrown when the contract is violated
     * @param offName The offset parameter name, for use in the exception being thrown when the contract is violated
     * @param lenName The length parameter name, for use in the exception being thrown when the contract is violated
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void rangeValid(short[] arr, int off, int len, String arrName, String offName, String lenName) {
        notNull(arr, arrName);
        rangeValid(arr.length, off, len, arrName + ".length", offName, lenName);
    }

    /**
     * Requires the given offset-length range to be a valid range within the bound of the specified array, such that:
     * <ul>
     * <li>{@code off >= 0}</li>
     * <li>{@code len >= 0}</li>
     * <li>{@code off + len <= arr.length}</li>
     * </ul>
     *
     * @param arr     The array
     * @param off     The offset
     * @param len     The length
     * @param arrName The array parameter name, for use in the exception being thrown when the contract is violated
     * @param offName The offset parameter name, for use in the exception being thrown when the contract is violated
     * @param lenName The length parameter name, for use in the exception being thrown when the contract is violated
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void rangeValid(int[] arr, int off, int len, String arrName, String offName, String lenName) {
        notNull(arr, arrName);
        rangeValid(arr.length, off, len, arrName + ".length", offName, lenName);
    }

    /**
     * Requires the given offset-length range to be a valid range within the bound of the specified array, such that:
     * <ul>
     * <li>{@code off >= 0}</li>
     * <li>{@code len >= 0}</li>
     * <li>{@code off + len <= arr.length}</li>
     * </ul>
     *
     * @param arr     The array
     * @param off     The offset
     * @param len     The length
     * @param arrName The array parameter name, for use in the exception being thrown when the contract is violated
     * @param offName The offset parameter name, for use in the exception being thrown when the contract is violated
     * @param lenName The length parameter name, for use in the exception being thrown when the contract is violated
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void rangeValid(long[] arr, int off, int len, String arrName, String offName, String lenName) {
        notNull(arr, arrName);
        rangeValid(arr.length, off, len, arrName + ".length", offName, lenName);
    }

    /**
     * Requires the given offset-length range to be a valid range within the bound of the specified array, such that:
     * <ul>
     * <li>{@code off >= 0}</li>
     * <li>{@code len >= 0}</li>
     * <li>{@code off + len <= arr.length}</li>
     * </ul>
     *
     * @param arr     The array
     * @param off     The offset
     * @param len     The length
     * @param arrName The array parameter name, for use in the exception being thrown when the contract is violated
     * @param offName The offset parameter name, for use in the exception being thrown when the contract is violated
     * @param lenName The length parameter name, for use in the exception being thrown when the contract is violated
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void rangeValid(float[] arr, int off, int len, String arrName, String offName, String lenName) {
        notNull(arr, arrName);
        rangeValid(arr.length, off, len, arrName + ".length", offName, lenName);
    }

    /**
     * Requires the given offset-length range to be a valid range within the bound of the specified array, such that:
     * <ul>
     * <li>{@code off >= 0}</li>
     * <li>{@code len >= 0}</li>
     * <li>{@code off + len <= arr.length}</li>
     * </ul>
     *
     * @param arr     The array
     * @param off     The offset
     * @param len     The length
     * @param arrName The array parameter name, for use in the exception being thrown when the contract is violated
     * @param offName The offset parameter name, for use in the exception being thrown when the contract is violated
     * @param lenName The length parameter name, for use in the exception being thrown when the contract is violated
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void rangeValid(double[] arr, int off, int len, String arrName, String offName, String lenName) {
        notNull(arr, arrName);
        rangeValid(arr.length, off, len, arrName + ".length", offName, lenName);
    }

    /**
     * Requires the given offset-length range to be a valid range within the bound of the specified array, such that:
     * <ul>
     * <li>{@code off >= 0}</li>
     * <li>{@code len >= 0}</li>
     * <li>{@code off + len <= arr.length}</li>
     * </ul>
     *
     * @param arr     The array
     * @param off     The offset
     * @param len     The length
     * @param arrName The array parameter name, for use in the exception being thrown when the contract is violated
     * @param offName The offset parameter name, for use in the exception being thrown when the contract is violated
     * @param lenName The length parameter name, for use in the exception being thrown when the contract is violated
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void rangeValid(boolean[] arr, int off, int len, String arrName, String offName, String lenName) {
        notNull(arr, arrName);
        rangeValid(arr.length, off, len, arrName + ".length", offName, lenName);
    }

    /**
     * Requires the given offset-length range to be a valid range within the bound of the specified array, such that:
     * <ul>
     * <li>{@code off >= 0}</li>
     * <li>{@code len >= 0}</li>
     * <li>{@code off + len <= arr.length}</li>
     * </ul>
     *
     * @param arr     The array
     * @param off     The offset
     * @param len     The length
     * @param arrName The array parameter name, for use in the exception being thrown when the contract is violated
     * @param offName The offset parameter name, for use in the exception being thrown when the contract is violated
     * @param lenName The length parameter name, for use in the exception being thrown when the contract is violated
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static void rangeValid(char[] arr, int off, int len, String arrName, String offName, String lenName) {
        notNull(arr, arrName);
        rangeValid(arr.length, off, len, arrName + ".length", offName, lenName);
    }

    /**
     * Requires the given offset-length range to be a valid range within the bound of the specified array, such that:
     * <ul>
     * <li>{@code off >= 0}</li>
     * <li>{@code len >= 0}</li>
     * <li>{@code off + len <= arr.length}</li>
     * </ul>
     *
     * @param arr     The array
     * @param off     The offset
     * @param len     The length
     * @param arrName The array parameter name, for use in the exception being thrown when the contract is violated
     * @param offName The offset parameter name, for use in the exception being thrown when the contract is violated
     * @param lenName The length parameter name, for use in the exception being thrown when the contract is violated
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the array is null
     */
    public static <T> void rangeValid(T[] arr, int off, int len, String arrName, String offName, String lenName) {
        notNull(arr, arrName);
        rangeValid(arr.length, off, len, arrName + ".length", offName, lenName);
    }

    /**
     * Requires the given offset-length range to be a valid range within the bound of the specified collection, such
     * that:
     * <ul>
     * <li>{@code off >= 0}</li>
     * <li>{@code len >= 0}</li>
     * <li>{@code off + len <= c.size()}</li>
     * </ul>
     *
     * @param c       The collection
     * @param off     The offset
     * @param len     The length
     * @param cName   The collection parameter name, for use in the exception being thrown when the contract is
     *                violated
     * @param offName The offset parameter name, for use in the exception being thrown when the contract is violated
     * @param lenName The length parameter name, for use in the exception being thrown when the contract is violated
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the collection is null
     */
    public static void rangeValid(Collection<?> c, int off, int len, String cName, String offName, String lenName) {
        notNull(c, cName);
        rangeValid(c.size(), off, len, cName + ".size()", offName, lenName);
    }

    /**
     * Requires the given offset-length range to be a valid range within the bound of the specified char sequence, such
     * that:
     * <ul>
     * <li>{@code off >= 0}</li>
     * <li>{@code len >= 0}</li>
     * <li>{@code off + len <= seq.length()}</li>
     * </ul>
     *
     * @param seq     The sequence
     * @param off     The offset
     * @param len     The length
     * @param seqName The sequence parameter name, for use in the exception being thrown when the contract is violated
     * @param offName The offset parameter name, for use in the exception being thrown when the contract is violated
     * @param lenName The length parameter name, for use in the exception being thrown when the contract is violated
     * @throws IndexOutOfBoundsException When the contract is violated
     * @throws NullPointerException      When the sequence is null
     */
    public static void rangeValid(CharSequence seq, int off, int len, String seqName, String offName, String lenName) {
        notNull(seq, seqName);
        rangeValid(seq.length(), off, len, seqName + ".length()", offName, lenName);
    }
}
