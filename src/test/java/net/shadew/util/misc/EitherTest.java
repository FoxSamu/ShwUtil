/*
 * Copyright (c) 2020 Shadew
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.shadew.util.misc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.NoSuchElementException;
import java.util.Optional;

import net.shadew.util.data.Either;
import net.shadew.util.data.Pair;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pairs")
public class EitherTest {
    private static <T, U> void assertPair(Pair<T, U> pair, T t, U u) {
        assertTrue(pair.first().equals(t));
        assertTrue(pair.second().equals(u));
    }

    private static <T> void assertPresent(Optional<T> optional, T t) {
        assertTrue(optional.isPresent());
        assertTrue(optional.get().equals(t));
    }

    private static <T> void assertAbsent(Optional<T> optional) {
        assertFalse(optional.isPresent());
    }

    private static <T, U> void assertFirst(Either<T, U> either, T t) {
        assertTrue(either.isFirst());
        assertTrue(either.first().equals(t));
    }

    private static <T, U> void assertSecond(Either<T, U> either, U u) {
        assertTrue(either.isSecond());
        assertTrue(either.second().equals(u));
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} has first element")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstHaveFirst(String str, Integer i) {
        assertFirst(Either.first(str), str);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} has no second element")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstFailSecond(String str, Integer i) {
        assertThrows(NoSuchElementException.class, () -> Either.first(str).second());
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} has second element")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondHaveSecond(String str, Integer i) {
        assertSecond(Either.second(i), i);
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} has no first element")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondFailFirst(String str, Integer i) {
        assertThrows(NoSuchElementException.class, () -> Either.second(i).first());
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} is first")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstIsFirst(String str, Integer i) {
        assertTrue(Either.first(str).isFirst());
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} is not second")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstIsSecond(String str, Integer i) {
        assertFalse(Either.first(str).isSecond());
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} is not first")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondIsFirst(String str, Integer i) {
        assertFalse(Either.second(str).isFirst());
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} is second")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondIsSecond(String str, Integer i) {
        assertTrue(Either.second(str).isSecond());
    }


    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} has present optFirst")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstOptionalFirst(String str, Integer i) {
        assertPresent(Either.first(str).optFirst(), str);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} has absent optSecond")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstOptionalSecond(String str, Integer i) {
        assertAbsent(Either.first(str).optSecond());
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} has present optSecond")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondOptionalSecond(String str, Integer i) {
        assertPresent(Either.second(i).optSecond(), i);
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} has absent optFirst")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondOptionalFirst(String str, Integer i) {
        assertAbsent(Either.second(i).optFirst());
    }


    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} has nonnull firstOrNull")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstFirstOrNull(String str, Integer i) {
        assertEquals(Either.first(str).firstOrNull(), str);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} has null secondOrNull")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstSecondOrNull(String str, Integer i) {
        assertEquals(Either.first(str).secondOrNull(), null);
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} has nonnull secondOrNull")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondFirstOrNull(String str, Integer i) {
        assertEquals(Either.second(i).secondOrNull(), i);
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} has null firstOrNull")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondSecondOrNull(String str, Integer i) {
        assertEquals(Either.second(i).firstOrNull(), null);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} merges")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstMerge(String str, Integer i) {
        assertEquals(Either.first(str, Integer.class).merge(String::length, s -> s), str.length());
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} merges")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondMerge(String str, Integer i) {
        assertEquals(Either.second(String.class, i).merge(String::length, s -> s), i);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} maps with mapFirst")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstMapFirst(String str, Integer i) {
        assertFirst(Either.first(str, Integer.class).mapFirst(String::length), str.length());
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} same with mapSecond")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstMapSecond(String str, Integer i) {
        assertFirst(Either.first(str, Integer.class).mapSecond(Integer::toHexString), str);
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} same with mapFirst")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondMapFirst(String str, Integer i) {
        assertSecond(Either.second(String.class, i).mapFirst(String::length), i);
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} maps with mapSecond")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondMapSecond(String str, Integer i) {
        assertSecond(Either.second(String.class, i).mapSecond(Integer::toHexString), Integer.toHexString(i));
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} maps with map")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstMap(String str, Integer i) {
        assertFirst(Either.first(str, Integer.class).map(String::length, Integer::toHexString), str.length());
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} maps with map")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondMap(String str, Integer i) {
        assertSecond(Either.second(String.class, i).map(String::length, Integer::toHexString), Integer.toHexString(i));
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} changes by withFirst")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstWithFirst(String str, Integer i) {
        assertFirst(Either.first(str, Integer.class).withFirst(str.hashCode()), str.hashCode());
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} untouched by withSecond")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstWithSecond(String str, Integer i) {
        assertFirst(Either.first(str, Integer.class).withSecond(i.toString()), str);
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} untouched by withFirst")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondWithFirst(String str, Integer i) {
        assertSecond(Either.second(String.class, i).withFirst(str.hashCode()), i);
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} changes by withSecond")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondWithSecond(String str, Integer i) {
        assertSecond(Either.second(String.class, i).withSecond(i.toString()), i.toString());
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} reverses to second")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstReverse(String str, Integer i) {
        assertSecond(Either.first(str, Integer.class).reverse(), str);
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} reverses to first")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondReverse(String str, Integer i) {
        assertFirst(Either.second(String.class, i).reverse(), i);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} calls ifFirst")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstIfFirst(String str, Integer i) {
        int[] res = {0};
        Either.first(str, Integer.class).ifFirst(f -> res[0] = f.hashCode());
        assertEquals(res[0], str.hashCode());
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} won't call ifSecond")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstIfSecond(String str, Integer i) {
        int[] res = {0};
        Either.first(str, Integer.class).ifSecond(s -> res[0] = s);
        assertEquals(res[0], 0);
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} won't call ifFirst")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondIfFirst(String str, Integer i) {
        int[] res = {0};
        Either.second(String.class, i).ifFirst(f -> res[0] = f.hashCode());
        assertEquals(res[0], 0);
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} calls ifSecond")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondIfSecond(String str, Integer i) {
        int[] res = {0};
        Either.second(String.class, i).ifSecond(s -> res[0] = s);
        assertEquals(res[0], i);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} calls first of ifElse")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstIfElse(String str, Integer i) {
        int[] res = {0};
        Either.first(str, Integer.class).ifElse(f -> res[0] = f.hashCode(), s -> res[0] = s);
        assertEquals(res[0], str.hashCode());
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} calls second of ifElse")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondIfElse(String str, Integer i) {
        int[] res = {0};
        Either.second(String.class, i).ifElse(f -> res[0] = f.hashCode(), s -> res[0] = s);
        assertEquals(res[0], i);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} returns first from firstOrElse")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstFirstOrElse(String str, Integer i) {
        assertEquals(Either.first(str, Integer.class).firstOrElse(i.toString()), str);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} returns else from secondOrElse")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstSecondOrElse(String str, Integer i) {
        assertEquals(Either.first(str, Integer.class).secondOrElse(str.hashCode()), str.hashCode());
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} returns else from firstOrElse")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondFirstOrElse(String str, Integer i) {
        assertEquals(Either.second(String.class, i).firstOrElse(i.toString()), i.toString());
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} returns second from secondOrElse")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondSecondOrElse(String str, Integer i) {
        assertEquals(Either.second(String.class, i).secondOrElse(str.hashCode()), i);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} returns first from firstOrElseGet")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstFirstOrElseGet(String str, Integer i) {
        assertEquals(Either.first(str, Integer.class).firstOrElseGet(i::toString), str);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} returns else from secondOrElseGet")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstSecondOrElseGet(String str, Integer i) {
        assertEquals(Either.first(str, Integer.class).secondOrElseGet(str::hashCode), str.hashCode());
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} returns else from firstOrElseGet")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondFirstOrElseGet(String str, Integer i) {
        assertEquals(Either.second(String.class, i).firstOrElseGet(i::toString), i.toString());
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} returns second from secondOrElseGet")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondSecondOrElseGet(String str, Integer i) {
        assertEquals(Either.second(String.class, i).secondOrElseGet(str::hashCode), i);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} returns first from firstOrElseThrow")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstFirstOrElseThrow(String str, Integer i) {
        assertEquals(Either.first(str, Integer.class).firstOrElseThrow(AssertionError::new), str);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} fails from secondOrElseThrow")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstSecondOrElseThrow(String str, Integer i) {
        assertThrows(AssertionError.class, () -> Either.first(str, Integer.class).secondOrElseThrow(AssertionError::new));
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} fails from firstOrElseThrow")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondFirstOrElseThrow(String str, Integer i) {
        assertThrows(AssertionError.class, () -> Either.second(String.class, i).firstOrElseThrow(AssertionError::new));
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} returns second from secondOrElseThrow")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondSecondOrElseThrow(String str, Integer i) {
        assertEquals(Either.second(String.class, i).secondOrElseThrow(AssertionError::new), i);
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} equals")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstEquals(String str, Integer i) {
        assertTrue(Either.first(str, Integer.class).equals(Either.first(str, Integer.class)));
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} equals")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondEquals(String str, Integer i) {
        assertTrue(Either.second(String.class, i).equals(Either.second(String.class, i)));
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} does not equal second")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstEqualsSecond(String str, Integer i) {
        assertFalse(Either.first(str, Integer.class).equals(Either.second(String.class, i)));
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} does not equal first")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondEqualsFirst(String str, Integer i) {
        assertFalse(Either.second(String.class, i).equals(Either.first(str, Integer.class)));
    }

    @ParameterizedTest(name = "{index} ==> first of ''{0}'' and {1} stringifies to Either.first[{0}]")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstToString(String str, Integer i) {
        assertEquals(Either.first(str, Integer.class).toString(), "Either.first[" + str + "]");
    }

    @ParameterizedTest(name = "{index} ==> second of ''{0}'' and {1} stringifies to Either.second[{1}]")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondToString(String str, Integer i) {
        assertEquals(Either.second(String.class, i).toString(), "Either.second[" + i + "]");
    }

    @ParameterizedTest(name = "{index} ==> firstOrElse with ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstOrElsePresent(String str, Integer i) {
        assertFirst(Either.firstOrElse(Optional.of(str), i), str);
    }

    @ParameterizedTest(name = "{index} ==> firstOrElse with <empty> and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstOrElseAbsent(String str, Integer i) {
        assertSecond(Either.firstOrElse(Optional.empty(), i), i);
    }

    @ParameterizedTest(name = "{index} ==> secondOrElse with ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondOrElsePresent(String str, Integer i) {
        assertSecond(Either.secondOrElse(str, Optional.of(i)), i);
    }

    @ParameterizedTest(name = "{index} ==> secondOrElse with ''{0}'' and <empty>")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondOrElseAbsent(String str, Integer i) {
        assertFirst(Either.secondOrElse(str, Optional.empty()), str);
    }

    @ParameterizedTest(name = "{index} ==> firstOrElseGet with ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstOrElseGetPresent(String str, Integer i) {
        assertFirst(Either.firstOrElseGet(Optional.of(str), () -> i), str);
    }

    @ParameterizedTest(name = "{index} ==> firstOrElseGet with <empty> and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstOrElseGetAbsent(String str, Integer i) {
        assertSecond(Either.firstOrElseGet(Optional.empty(), () -> i), i);
    }

    @ParameterizedTest(name = "{index} ==> secondOrElseGet with ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondOrElseGetPresent(String str, Integer i) {
        assertSecond(Either.secondOrElseGet(() -> str, Optional.of(i)), i);
    }

    @ParameterizedTest(name = "{index} ==> secondOrElseGet with ''{0}'' and <empty>")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondOrElseGetAbsent(String str, Integer i) {
        assertFirst(Either.secondOrElseGet(() -> str, Optional.empty()), str);
    }

    @ParameterizedTest(name = "{index} ==> firstIf true with ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstIfTrue(String str, Integer i) {
        assertFirst(Either.firstIf(true, str, i), str);
    }

    @ParameterizedTest(name = "{index} ==> firstIf false with ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstIfFalse(String str, Integer i) {
        assertSecond(Either.firstIf(false, str, i), i);
    }

    @ParameterizedTest(name = "{index} ==> secondIf true with ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondIfTrue(String str, Integer i) {
        assertSecond(Either.secondIf(true, str, i), i);
    }

    @ParameterizedTest(name = "{index} ==> secondIf false with ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondIfFalse(String str, Integer i) {
        assertFirst(Either.secondIf(false, str, i), str);
    }

    @ParameterizedTest(name = "{index} ==> firstIf true with ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testGetFirstIfTrue(String str, Integer i) {
        assertFirst(Either.getFirstIf(true, () -> str, () -> i), str);
    }

    @ParameterizedTest(name = "{index} ==> firstIf false with ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testGetFirstIfFalse(String str, Integer i) {
        assertSecond(Either.getFirstIf(false, () -> str, () -> i), i);
    }

    @ParameterizedTest(name = "{index} ==> secondIf true with ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testGetSecondIfTrue(String str, Integer i) {
        assertSecond(Either.getSecondIf(true, () -> str, () -> i), i);
    }

    @ParameterizedTest(name = "{index} ==> secondIf false with ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testGetSecondIfFalse(String str, Integer i) {
        assertFirst(Either.getSecondIf(false, () -> str, () -> i), str);
    }

    @ParameterizedTest(name = "{index} ==> get with first of ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testGetFirst(String str, Integer i) {
        assertEquals(Either.get(Either.first(str.hashCode())), str.hashCode());
    }

    @ParameterizedTest(name = "{index} ==> get with second of ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testGetSecond(String str, Integer i) {
        assertEquals(Either.get(Either.second(i)), i);
    }

    private static boolean generalContract(Either<?, ?> e) {
        return e.isFirst() ^ e.isSecond();
    }

    @ParameterizedTest(name = "{index} ==> general contract, first of ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testGeneralContractFirst(String str, Integer i) {
        assertTrue(generalContract(Either.first(str)));
    }

    @ParameterizedTest(name = "{index} ==> general contract, second of ''{0}'' and {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testGeneralContractSecond(String str, Integer i) {
        assertTrue(generalContract(Either.second(i)));
    }
}
