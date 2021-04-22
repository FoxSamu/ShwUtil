/*
 * Copyright (c) 2021 Shadew
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
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import net.shadew.util.io.FlexibleInputStream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Flexible InputStreams")
public class FlexibleInputStreamTest {
    private FlexibleInputStream makeStream(int forward, String text) throws IOException {
        FlexibleInputStream stream = new FlexibleInputStream(new ByteArrayInputStream(text.getBytes()));
        while (forward > 0) {
            stream.read();
            forward--;
        }
        return stream;
    }

    @Test
    @DisplayName("Can read one byte")
    public void testReadOneByte() throws IOException {
        FlexibleInputStream stream = makeStream(0, "abcd");
        assertEquals('a', (char) stream.read());
        assertEquals('b', (char) stream.read());
        assertEquals('c', (char) stream.read());
        assertEquals('d', (char) stream.read());
        assertEquals(-1, stream.read());
    }

    @Test
    @DisplayName("Can read a full byte array with bytes")
    public void testReadByteArray() throws IOException {
        FlexibleInputStream stream = makeStream(0, "abcdefghijklmnopqrstuvwxyz");
        byte[] buf = new byte[5];
        assertEquals(5, stream.read(buf));
        assertEquals("abcde", new String(buf));
        assertEquals(5, stream.read(buf));
        assertEquals("fghij", new String(buf));
        assertEquals(5, stream.read(buf));
        assertEquals("klmno", new String(buf));
        assertEquals(5, stream.read(buf));
        assertEquals("pqrst", new String(buf));
        assertEquals(5, stream.read(buf));
        assertEquals("uvwxy", new String(buf));
        assertEquals(1, stream.read(buf));
        assertEquals("z", new String(buf, 0, 1));
        assertEquals(-1, stream.read(buf));
    }

    @Test
    @DisplayName("Can read a part of a byte array with bytes")
    public void testReadPartialByteArray() throws IOException {
        FlexibleInputStream stream = makeStream(0, "abcdefghij");
        byte[] buf = "-----".getBytes();
        assertEquals(2, stream.read(buf, 2, 2));
        assertEquals("--ab-", new String(buf));
        assertEquals(3, stream.read(buf, 0, 3));
        assertEquals("cdeb-", new String(buf));
        assertEquals(5, stream.read(buf, 0, 5));
        assertEquals("fghij", new String(buf));
    }

    @Test
    @DisplayName("Can unread a byte")
    public void testUnreadOneByte() throws IOException {
        FlexibleInputStream stream = makeStream(0, "abcd");
        int bt = stream.read();
        stream.unread(bt);
        int bt2 = stream.read();
        assertEquals('a', (char) bt);
        assertEquals('a', (char) bt2);
        assertEquals('b', (char) stream.read());
    }

    @Test
    @DisplayName("Can unread a full array of bytes")
    public void testUnreadByteArray() throws IOException {
        FlexibleInputStream stream = makeStream(0, "abcdefghij");
        byte[] buf = new byte[5];
        byte[] buf2 = new byte[5];
        stream.read(buf);
        stream.unread(buf);
        stream.read(buf2);
        assertEquals("abcde", new String(buf));
        assertEquals("abcde", new String(buf2));
    }

    @Test
    @DisplayName("Can unread a partial array of bytes")
    public void testUnreadPartialByteArray() throws IOException {
        FlexibleInputStream stream = makeStream(0, "abcdefghij");
        byte[] buf = new byte[5];
        byte[] buf2 = new byte[5];
        stream.read(buf);
        stream.unread(buf, 2, 2);
        assertEquals("abcde", new String(buf));
        assertEquals(2, stream.read(buf2));   // FlexibleInputStream first gets rid of its unread bytes - there are only 2 unread bytes now
        assertEquals("cd", new String(buf2, 0, 2));
    }

    @Test
    @DisplayName("Can peek a byte")
    public void testPeekOneByte() throws IOException {
        FlexibleInputStream stream = makeStream(0, "abcd");
        int bt = stream.peek();
        int bt2 = stream.peek();
        assertEquals('a', (char) bt);
        assertEquals('a', (char) bt2);
    }

    @Test
    @DisplayName("Can peek a byte array with bytes")
    public void testPeekByteArray() throws IOException {
        FlexibleInputStream stream = makeStream(0, "abcdefghijklmnopqrstuvwxyz");
        byte[] buf1 = new byte[10];
        byte[] buf2 = new byte[5];
        byte[] buf3 = new byte[15];
        stream.peek(buf1);
        stream.peek(buf2);
        assertEquals(10, stream.peek(buf3));
        assertEquals("abcdefghij", new String(buf1));
        assertEquals("abcde", new String(buf2));
        assertEquals("abcdefghij", new String(buf3, 0, 10));
    }

    @Test
    @DisplayName("Can peek a partial byte array with bytes")
    public void testPeekPartialByteArray() throws IOException {
        FlexibleInputStream stream = makeStream(0, "abcdefghijklmnopqrstuvwxyz");
        byte[] buf1 = new byte[10];
        byte[] buf2 = new byte[5];
        byte[] buf3 = new byte[15];
        stream.peek(buf1, 5, 5);
        stream.peek(buf2);
        assertEquals(5, stream.peek(buf3));
        assertEquals("abcde", new String(buf1, 5, 5));
        assertEquals("abcde", new String(buf2));
        assertEquals("abcde", new String(buf3, 0, 5));
    }

    @Test
    @DisplayName("Can mark and reset")
    public void testMarkAndReset() throws IOException {
        FlexibleInputStream stream = makeStream(0, "abcdefghijklmnopqrstuvwxyz");
        byte[] buf = new byte[10];
        stream.mark(10);
        stream.read(buf);
        assertEquals("abcdefghij", new String(buf));
        stream.reset();
        assertEquals('a', (char) stream.peek());
    }

    @Test
    @DisplayName("Can invalidate the mark")
    public void testInvalidatedMark() throws IOException {
        FlexibleInputStream stream = makeStream(0, "abcdefghijklmnopqrstuvwxyz");
        byte[] buf = new byte[10];
        stream.mark(5);
        stream.read(buf);
        assertEquals("abcdefghij", new String(buf));
        assertThrows(IOException.class, stream::reset);
        assertEquals('k', (char) stream.peek());
    }

    @Test
    @DisplayName("Can change the mark")
    public void testChangedMark() throws IOException {
        FlexibleInputStream stream = makeStream(0, "abcdefghijklmnopqrstuvwxyz");
        byte[] buf = new byte[10];
        stream.mark(15);
        stream.read(buf);
        assertEquals("abcdefghij", new String(buf));
        stream.mark(15);
        stream.read(buf);
        assertEquals("klmnopqrst", new String(buf));
        stream.reset();
        assertEquals('k', (char) stream.peek());
    }

    @Test
    @DisplayName("Can unread behind the mark")
    public void testForwardMark() throws IOException {
        FlexibleInputStream stream = makeStream(10, "abcdefghijklmnopqrstuvwxyz");
        byte[] buf = new byte[10];
        stream.read(buf, 0, 5);
        stream.mark(15);
        stream.read(buf, 5, 5);
        assertEquals("klmnopqrst", new String(buf));
        stream.unread(buf);
        assertEquals('k', (char) stream.peek());
        stream.reset();
        assertEquals('p', (char) stream.peek());
    }

    @Test
    @DisplayName("Can unread behind the mark and then read some bytes again")
    public void testForwardBackwardMark() throws IOException {
        FlexibleInputStream stream = makeStream(10, "abcdefghijklmnopqrstuvwxyz");
        byte[] buf = new byte[10];
        stream.read(buf, 0, 5);
        stream.mark(15);
        stream.read(buf, 5, 5);
        assertEquals("klmnopqrst", new String(buf));
        stream.unread(buf);
        stream.read(buf);
        assertEquals("klmnopqrst", new String(buf));
        assertEquals('u', (char) stream.peek());
        stream.reset();
        assertEquals('p', (char) stream.peek());
    }
}
