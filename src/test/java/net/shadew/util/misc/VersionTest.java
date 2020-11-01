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

public final class VersionTest {
    private VersionTest() {
    }

    public static void main(String[] args) {
        System.out.println(Version.parse("1.0.0-alpha").compareTo(Version.parse("1.0.0-alpha.1")));
        System.out.println(Version.parse("1.0.0-alpha.1").compareTo(Version.parse("1.0.0-alpha.beta")));
        System.out.println(Version.parse("1.0.0-alpha.beta").compareTo(Version.parse("1.0.0-beta")));
        System.out.println(Version.parse("1.0.0-beta").compareTo(Version.parse("1.0.0-beta.2")));
        System.out.println(Version.parse("1.0.0-beta.2").compareTo(Version.parse("1.0.0-beta.11")));
        System.out.println(Version.parse("1.0.0-beta.11").compareTo(Version.parse("1.0.0-rc.1")));
        System.out.println(Version.parse("1.0.0-rc.1").compareTo(Version.parse("1.0.0")));
    }
}
