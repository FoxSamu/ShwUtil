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

import java.util.Locale;

import net.shadew.util.contract.NotNull;

/**
 * An enumeration of the most common operating systems: Widnows, OSX and Linux. Any other uncommon operating system
 * falls under the category 'other'. To obtain the operating system hosting the current Java VM, call {@link
 * OS#current() OS.current()}.
 */
public enum OS {
    /**
     * The Microsoft Windows operating system
     */
    WINDOWS,

    /**
     * The Apple MacOS/Darwin operating system
     */
    MAC_OS,

    /**
     * Any Linux-based operating system
     */
    LINUX,

    /**
     * Any generic operating system that is not Windows, MacOS or Linux
     */
    OTHER;

    /**
     * @deprecated Renamed to {@link #MAC_OS}
     */
    @Deprecated
    public static final OS OSX = MAC_OS;

    private static OS detected;

    /**
     * Returns the operating system the current Java runtime is running on, based on the {@code os.name} {@linkplain
     * System#getProperty(String) system property}.
     */
    @NotNull
    public static OS current() {
        if (detected == null) {
            String os = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
            if (os.contains("mac") || os.contains("darwin")) {
                detected = MAC_OS;
            } else if (os.contains("win")) {
                detected = WINDOWS;
            } else if (os.contains("nux")) {
                detected = LINUX;
            } else {
                detected = OTHER;
            }
        }
        return detected;
    }
}
