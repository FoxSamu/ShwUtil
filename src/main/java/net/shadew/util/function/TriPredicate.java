package net.shadew.util.function;

import net.shadew.util.contract.Validate;

/**
 * Represents a predicate (boolean-valued function) of three arguments.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #test(Object, Object, Object)}.
 *
 * @param <T> The first type of the input to the predicate
 * @param <U> The second type of the input to the predicate
 * @param <V> The third type of the input to the predicate
 */
@FunctionalInterface
public interface TriPredicate<T, U, V> {

    /**
     * Evaluates this predicate on the given arguments.
     *
     * @param t The first input argument
     * @param u The second input argument
     * @param v The third input argument
     * @return True if the input arguments match the predicate, false otherwise
     */
    boolean test(T t, U u, V v);

    /**
     * Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another. When
     * evaluating the composed predicate, if this predicate is {@code false}, then the {@code other} predicate is not
     * evaluated.
     *
     * <p>Any exceptions thrown during evaluation of either predicate are relayed
     * to the caller; if evaluation of this predicate throws an exception, the {@code other} predicate will not be
     * evaluated.</p>
     *
     * @param other A predicate that will be logically-ANDed with this predicate
     * @return A composed predicate that represents the short-circuiting logical AND of this predicate and the {@code
     *     other} predicate
     *
     * @throws NullPointerException If other is null
     */
    default TriPredicate<T, U, V> and(TriPredicate<? super T, ? super U, ? super V> other) {
        Validate.notNull(other, "other");
        return (t, u, v) -> test(t, u, v) && other.test(t, u, v);
    }

    /**
     * Returns a composed predicate that represents a short-circuiting logical OR of this predicate and another. When
     * evaluating the composed predicate, if this predicate is {@code true}, then the {@code other} predicate is not
     * evaluated.
     *
     * <p>Any exceptions thrown during evaluation of either predicate are relayed
     * to the caller; if evaluation of this predicate throws an exception, the {@code other} predicate will not be
     * evaluated.</p>
     *
     * @param other A predicate that will be logically-ORed with this predicate
     * @return A composed predicate that represents the short-circuiting logical OR of this predicate and the {@code
     *     other} predicate
     *
     * @throws NullPointerException If other is null
     */
    default TriPredicate<T, U, V> or(TriPredicate<? super T, ? super U, ? super V> other) {
        Validate.notNull(other, "other");
        return (t, u, v) -> test(t, u, v) || other.test(t, u, v);
    }

    /**
     * Returns a predicate that represents the logical negation of this predicate.
     *
     * @return A predicate that represents the logical negation of this predicate
     */
    default TriPredicate<T, U, V> negate() {
        return (t, u, v) -> !test(t, u, v);
    }
}
