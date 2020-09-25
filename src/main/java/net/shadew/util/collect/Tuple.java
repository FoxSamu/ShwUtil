package net.shadew.util.collect;

import java.util.*;

import net.shadew.util.contract.NotNull;
import net.shadew.util.contract.Validate;

/**
 * A tuple is an immutable and ordered collection of not-null elements, all of the same type. Tuples serve as some kind
 * of {@link String}s made of objects instead of characters: strings have the same immutable and ordered properties. The
 * general contract of a tuple is:
 * <ul>
 * <li>Tuples have zero or more elements</li>
 * <li>All elements in a tuple are not null</li>
 * <li>Elements cannot be added or removed from a tuple, nor can they be changed, making it immutable</li>
 * <li>Elements in the tuple may be mutable</li>
 * </ul>
 *
 * @param <E> The generic type of the tuple. All elements in the tuple have this type.
 */
public final class Tuple<E> implements Collection<E> {
    @NotNull
    private final Object[] elements;
    private final int start;
    private final int end;

    private Tuple(@NotNull Object[] elements, int start, int end) {
        this.elements = elements;
        this.start = start;
        this.end = end;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return end - start;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean contains(Object o) {
        if(o == null)
            return false;

        for (E e : this) {
            if (Objects.equals(o, e))
                return true;
        }

        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NotNull
    public Iterator<E> iterator() {
        return new TupleIterator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NotNull
    public Object[] toArray() {
        int l = size();
        Object[] out = new Object[l];
        System.arraycopy(elements, start, out, 0, l);
        return out;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings({"SuspiciousSystemArraycopy", "unchecked"})
    @NotNull
    public <T> T[] toArray(@NotNull T[] a) {
        Validate.notNull(a, "a");
        int size = size();
        if (a.length < size)
            // Make a new array of a's runtime type, but my contents:
            return (T[]) Arrays.copyOf(elements, size, a.getClass());
        System.arraycopy(elements, start, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

    /**
     * Fails, as adding to a tuple is not supported.
     *
     * @throws UnsupportedOperationException Per definition
     */
    @Override
    @Deprecated
    public boolean add(E e) {
        return Validate.unsupported("add");
    }

    /**
     * Fails, as removing from a tuple is not supported.
     *
     * @throws UnsupportedOperationException Per definition
     */
    @Override
    @Deprecated
    public boolean remove(Object o) {
        return Validate.unsupported("remove");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        Validate.notNull(c, "c");

        for (Object o : c) {
            if (!contains(o))
                return false;
        }
        return true;
    }

    /**
     * Fails, as adding to a tuple is not supported.
     *
     * @throws UnsupportedOperationException Per definition
     */
    @Override
    @Deprecated
    public boolean addAll(Collection<? extends E> c) {
        return Validate.unsupported("addAll");
    }

    /**
     * Fails, as removing from a tuple is not supported.
     *
     * @throws UnsupportedOperationException Per definition
     */
    @Override
    @Deprecated
    public boolean removeAll(Collection<?> c) {
        return Validate.unsupported("removeAll");
    }

    /**
     * Fails, as removing from a tuple is not supported.
     *
     * @throws UnsupportedOperationException Per definition
     */
    @Override
    @Deprecated
    public boolean retainAll(Collection<?> c) {
        return Validate.unsupported("retainAll");
    }

    /**
     * Fails, as clearing a tuple is not supported.
     *
     * @throws UnsupportedOperationException Per definition
     */
    @Override
    @Deprecated
    public void clear() {
        Validate.unsupported("clear");
    }

    /**
     * Returns the element at the specified index.
     *
     * @param index The index to get an element at.
     * @return The element taken from the tuple.
     *
     * @throws IndexOutOfBoundsException When the index is out of the bounds of this tuple
     */
    @NotNull
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(index + "");
        }
        return (E) elements[index + start];
    }

    /**
     * Returns a tuple containing all elements from this tuple, starting at the given index.
     *
     * @param from The start index
     * @return A new sub-tuple
     *
     * @throws IndexOutOfBoundsException When the start index is out of the bounds of this tuple
     */
    @NotNull
    public Tuple<E> subtuple(int from) {
        if (from < 0 || from >= size()) {
            throw new IndexOutOfBoundsException(from + "");
        }

        return new Tuple<>(elements, start + from, end);
    }

    /**
     * Returns a tuple containing all elements from this tuple in the given range.
     *
     * @param from The start index
     * @param to   The end index
     * @return A new sub-tuple
     *
     * @throws IndexOutOfBoundsException When the start or end index is out of the bounds of this tuple, or when the end
     *                                   index is less than the start index
     */
    @NotNull
    public Tuple<E> subtuple(int from, int to) {
        if (from < 0 || from >= size()) {
            throw new IndexOutOfBoundsException(from + "");
        }
        if (to < 0 || to >= size()) {
            throw new IndexOutOfBoundsException(to + "");
        }
        if (to < from) {
            throw new IndexOutOfBoundsException("from < to");
        }

        return new Tuple<>(elements, start + from, start + to);
    }

    /**
     * Concatenates this and another tuple, yielding a tuple with all values of this and the other tuple, in order.
     *
     * @param other The other tuple to concatenate
     * @return A tuple containing all elements of this tuple and all elements of the other tuple
     *
     * @throws NullPointerException When the other tuple is null
     */
    @NotNull
    public Tuple<E> concat(@NotNull Tuple<E> other) {
        Validate.notNull(other, "other");
        return concat(this, other);
    }

    /**
     * Creates a {@link Pair} of two elements of this tuple.
     *
     * @param first  The index of the first element
     * @param second The index of the second element
     * @return A pair holding the first and the second element
     *
     * @throws IndexOutOfBoundsException When either of the indexes is not in the bounds of this tuple
     */
    @NotNull
    public Pair<E, E> pair(int first, int second) {
        return Pair.of(get(first), get(second));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple<?> tuple = (Tuple<?>) o;
        int s = size();
        if (tuple.size() != s) return false;
        for (int i = 0; i < s; i++) {
            if (!elements[i].equals(tuple.elements[i]))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;

        for (Object element : this)
            result = 31 * result + element.hashCode();

        return result;
    }

    @Override
    public String toString() {
        int iMax = end - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = start; true; i++) {
            b.append(elements[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    @NotNull
    private static <E> Tuple<E> make(@NotNull Object[] elements, int off, int len) {
        Validate.notNegative(len, "len");
        if (len > elements.length)
            Validate.illegalArgument("len > elements.length");
        if (off < 0 || off + len > elements.length)
            throw new ArrayIndexOutOfBoundsException(off);
        Validate.notNullElements(elements, "elements");

        Object[] arr = new Object[len];
        System.arraycopy(elements, off, arr, 0, len);
        return new Tuple<>(arr, 0, len);
    }

    /**
     * Makes a new tuple by copying certain elements from the given array.
     *
     * @param elements The element array to copy from
     * @param off      The start index to copy from
     * @param len      The amount of elements to copy
     * @return A new tuple
     *
     * @throws ArrayIndexOutOfBoundsException When the offset is out of the compatible bounds
     * @throws IllegalArgumentException       When the length is negative or bigger than the array's length
     * @throws NullPointerException           When the elements array or any of the elements is null
     */
    @NotNull
    public static <E> Tuple<E> of(@NotNull E[] elements, int off, int len) {
        return make(elements, off, len);
    }

    /**
     * Makes a new tuple by copying all elements from the given array/varargs.
     *
     * @param elements The element array to copy from
     * @return A new tuple
     *
     * @throws NullPointerException When the elements array or any of the elements is null
     */
    @SafeVarargs
    @NotNull
    public static <E> Tuple<E> of(@NotNull E... elements) {
        return of(elements, 0, elements.length);
    }

    /**
     * Makes a new tuple by copying all elements from the given list
     *
     * @param elements The element list to copy from
     * @return A new tuple
     *
     * @throws NullPointerException When the element list or any of the elements is null
     */
    @NotNull
    public static <E> Tuple<E> of(@NotNull List<E> elements) {
        return make(elements.toArray(), 0, elements.size());
    }

    /**
     * Makes a new tuple by copying all remaining elements from the given iterator
     *
     * @param itr The iterator to copy from
     * @return A new tuple
     *
     * @throws NullPointerException When the iterator or any of its elements is null
     */
    @NotNull
    public static <E> Tuple<E> of(@NotNull Iterator<? extends E> itr) {
        return Tuple.<E>builder().add(itr).build();
    }

    /**
     * Makes a new tuple by copying all elements from the given iterable
     *
     * @param itr The iterable to copy from
     * @return A new tuple
     *
     * @throws NullPointerException When the iterable or any of its elements is null
     */
    @NotNull
    public static <E> Tuple<E> of(@NotNull Iterable<? extends E> itr) {
        return Tuple.<E>builder().add(itr).build();
    }

    /**
     * Makes a new tuple by copying all elements from the given pair
     *
     * @param pair The pair to copy from
     * @return A new tuple
     *
     * @throws NullPointerException When the pair or any of its elements is null
     */
    @NotNull
    public static <E> Tuple<E> of(@NotNull Pair<E, E> pair) {
        Validate.notNull(pair, "pair");
        return new Tuple<>(new Object[] {pair.first(), pair.second()}, 0, 2);
    }

    /**
     * Concatenates two tuples, yielding a new tuple with all elements of both tuples, in order.
     *
     * @param a The first tuple to concatenate
     * @param b The second tuple to concatenate
     * @return A concatenated tuple
     */
    @NotNull
    public static <E> Tuple<E> concat(@NotNull Tuple<? extends E> a, @NotNull Tuple<? extends E> b) {
        return Tuple.<E>builder().add(a).add(b).build();
    }

    /**
     * Makes a new tuple builder.
     *
     * @return A new tuple builder
     */
    @NotNull
    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    /**
     * A builder class to build tuples.
     */
    public static class Builder<E> {
        private final ArrayList<E> list = new ArrayList<>();

        private Builder() {
        }

        /**
         * Adds an element to this builder.
         *
         * @param element The element to add
         * @return This instance for chaining
         *
         * @throws NullPointerException When the specified element is null
         */
        @NotNull
        public Builder<E> add(@NotNull E element) {
            Validate.notNull(element, "element");
            list.add(element);
            return this;
        }

        /**
         * Adds elements to this builder.
         *
         * @param elements The elements to add
         * @return This instance for chaining
         *
         * @throws NullPointerException When the specified elements array is null or when any of the elements are null
         */
        @NotNull
        @SafeVarargs
        public final Builder<E> add(@NotNull E... elements) {
            Validate.notNullElements(elements, "elements");
            list.addAll(Arrays.asList(elements));
            return this;
        }

        /**
         * Adds all remaining elements to this builder.
         *
         * @param elements The iterator if elements to add
         * @return This instance for chaining
         *
         * @throws NullPointerException When the iterator is null or when any of the elements are null
         */
        @NotNull
        public Builder<E> add(@NotNull Iterator<? extends E> elements) {
            elements.forEachRemaining(e -> {
                Validate.notNull(e, "element in elements");
                list.add(e);
            });
            return this;
        }

        /**
         * Adds elements to this builder.
         *
         * @param elements The elements to add
         * @return This instance for chaining
         *
         * @throws NullPointerException When the specified element iterable is null or when any of the elements are
         *                              null
         */
        @NotNull
        public Builder<E> add(@NotNull Iterable<? extends E> elements) {
            Validate.notNullElements(elements, "elements");
            elements.forEach(list::add);
            return this;
        }

        /**
         * Adds a pair of elements to this builder.
         *
         * @param elements The elements to add
         * @return This instance for chaining
         *
         * @throws NullPointerException When the specified element pair is null or when any of the elements are null
         */
        @NotNull
        public Builder<E> add(@NotNull Pair<E, E> elements) {
            list.add(elements.first());
            list.add(elements.second());
            return this;
        }

        /**
         * Builds a tuple from all collected elements.
         * @return The built tuple
         */
        @NotNull
        public Tuple<E> build() {
            return Tuple.make(list.toArray(), 0, list.size());
        }
    }

    private class TupleIterator implements Iterator<E> {
        private int index = start;

        @Override
        public boolean hasNext() {
            return index < end;
        }

        @Override
        @NotNull
        @SuppressWarnings("unchecked")
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return (E) elements[index++];
        }

        @Override
        @Deprecated
        public void remove() {
            Validate.unsupported("remove");
        }
    }
}
