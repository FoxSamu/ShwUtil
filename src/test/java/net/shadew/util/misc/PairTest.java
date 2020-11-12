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

import net.shadew.util.data.Either;
import net.shadew.util.data.Pair;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pairs")
public class PairTest {
    private static <T, U> void assertPair(Pair<T, U> pair, T t, U u) {
        assertTrue(pair.first().equals(t));
        assertTrue(pair.second().equals(u));
    }

    private static <T, U> void assertFirst(Either<T, U> either, T t) {
        assertTrue(either.isFirst());
        assertTrue(either.first().equals(t));
    }

    private static <T, U> void assertSecond(Either<T, U> either, U u) {
        assertTrue(either.isSecond());
        assertTrue(either.second().equals(u));
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} has first element ''{0}''")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testHaveFirst(String str, Integer i) {
        assertTrue(Pair.of(str, i).first().equals(str));
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} has second element {1}")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testHaveSecond(String str, Integer i) {
        assertTrue(Pair.of(str, i).second().equals(i));
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} can merge")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testMerge(String str, Integer i) {
        assertTrue(Pair.of(str, i).merge((f, s) -> f + s).equals(str + i));
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} can map first")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testMapFirst(String str, Integer i) {
        assertPair(Pair.of(str, i).mapFirst(String::length), str.length(), i);
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} can map second")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testMapSecond(String str, Integer i) {
        assertPair(Pair.of(str, i).mapSecond(Integer::toHexString), str, Integer.toHexString(i));
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} can map")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testMap(String str, Integer i) {
        assertPair(Pair.of(str, i).map(String::length, Integer::toHexString), str.length(), Integer.toHexString(i));
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} can reverse")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testReverse(String str, Integer i) {
        assertPair(Pair.of(str, i).reverse(), i, str);
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} can with first")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testWithFirst(String str, Integer i) {
        assertPair(Pair.of(str, i).withFirst(i), i, i);
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} can with second")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testWithSecond(String str, Integer i) {
        assertPair(Pair.of(str, i).withSecond(str), str, str);
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} can get first if true")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstIfTrue(String str, Integer i) {
        assertFirst(Pair.of(str, i).firstIf(true), str);
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} cannot get first if false")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testFirstIfFalse(String str, Integer i) {
        assertSecond(Pair.of(str, i).firstIf(false), i);
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} can get second if true")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondIfTrue(String str, Integer i) {
        assertSecond(Pair.of(str, i).secondIf(true), i);
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} cannot get second if false")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testSecondIfFalse(String str, Integer i) {
        assertFirst(Pair.of(str, i).secondIf(false), str);
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} can equals")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testEquals(String str, Integer i) {
        assertTrue(Pair.of(str, i).equals(Pair.of(str, i)));
    }

    @ParameterizedTest(name = "{index} ==> pair of ''{0}'' and {1} has stringified format Pair[{0}, {1}]")
    @CsvFileSource(resources = "pair_random.csv", numLinesToSkip = 1)
    public void testToString(String str, Integer i) {
        assertEquals(Pair.of(str, i).toString(), "Pair[" + str + ", " + i + "]");
    }
}
