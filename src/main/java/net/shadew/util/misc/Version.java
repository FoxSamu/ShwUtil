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

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.shadew.util.contract.Nullable;
import net.shadew.util.contract.Validate;
import net.shadew.util.data.Either;

/**
 * The {@code Version} class represents a semantic version number, according to the <a href="https://semver.org/">
 * semantic versioning specification 2.0.0</a>.
 */
public class Version implements Comparable<Version> {
    private final int major;
    private final int minor;
    private final int patch;
    private final Object[] prereleases;
    private final String buildMeta;

    private Version(int major, int minor, int patch, Object[] prereleases, @Nullable String buildMeta) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        Validate.notNegative(patch, "patch");
        Validate.notNull(prereleases, "prereleases");
        this.major = major;
        this.minor = minor;
        this.patch = patch;
        this.prereleases = prereleases;
        this.buildMeta = buildMeta;
    }

    /**
     * Returns the major version number of this version. That is, the first number in the version format, i.e. {@code x}
     * in the version {@code x.y.z}.
     */
    public int major() {
        return major;
    }

    /**
     * Returns the minor version number of this version. That is, the second number in the version format, i.e. {@code
     * y} in the version {@code x.y.z}.
     */
    public int minor() {
        return minor;
    }

    /**
     * Returns the patch version number of this version. That is, the third number in the version format, i.e. {@code z}
     * in the version {@code x.y.z}.
     */
    public int patch() {
        return patch;
    }

    /**
     * Returns the build metadata of this version. The build metadata is appended to a version after a plus-sign ({@code
     * +}), i.e. {@code abc} in the version {@code x.y.z+abc}. When no build data was appended to a version number, this
     * method returns null.
     */
    @Nullable
    public String buildMeta() {
        return buildMeta;
    }

    /**
     * Returns the prerelease identifier at the specified index. A prerelease identifier can either be a string or an
     * integer, hence this method returns an {@link Either} instance. The returned value is for example {@code b} in
     * {@code x.y.z-a.b.c} when the given index is 1.
     *
     * @throws IndexOutOfBoundsException When this version is not a prerelease or when the index is not a valid
     *                                   prerelease index (i.e. less than 0 or more than {@link #prereleaseLength()}).
     */
    public Either<String, Integer> prerelease(int index) {
        Validate.indexInBounds(prereleases, index);
        Object pre = prereleases[index];
        if (pre instanceof String) {
            return Either.first((String) pre);
        } else {
            return Either.second((Integer) pre);
        }
    }

    /**
     * Returns the prerelease number at the specified index. A prerelease identifier can either be a string or an
     * integer, this method throws a {@link NoSuchElementException} if the prerelease value at the given index is not a
     * number. The returned value is for example {@code b} as an integer in {@code x.y.z-a.b.c} when the given index is
     * 1.
     *
     * @throws IndexOutOfBoundsException When this version is not a prerelease or when the index is not a valid
     *                                   prerelease index (i.e. less than 0 or more than {@link #prereleaseLength()}).
     * @throws NoSuchElementException    When the prerelease version at the given index is not a number.
     */
    public int prereleaseNum(int index) {
        Validate.indexInBounds(prereleases, index);
        Object pre = prereleases[index];
        if (pre instanceof Integer)
            return (int) pre;
        throw new NoSuchElementException("Prerelease '" + pre + "' is not a valid number");
    }

    /**
     * Returns the prerelease string at the specified index. A prerelease identifier can either be a string or an
     * integer, this method converts a prerelease version to a string if its a number. The returned value is for example
     * {@code b} as a string in {@code x.y.z-a.b.c} when the given index is 1.
     *
     * @throws IndexOutOfBoundsException When this version is not a prerelease or when the index is not a valid
     *                                   prerelease index (i.e. less than 0 or more than {@link #prereleaseLength()}).
     */
    public String prereleaseString(int index) {
        Validate.indexInBounds(prereleases, index);
        Object pre = prereleases[index];
        return pre.toString();
    }

    /**
     * Returns the amount of prerelease versions in this version. That is, the amount of period-separated values after a
     * dash, i.e. 4 in the version {@code x.y.z-a.b.c.d}.
     */
    public int prereleaseLength() {
        return prereleases.length;
    }

    /**
     * Creates a release version with patch number 0: {@code [major].[minor].0}.
     *
     * @param major The major version number
     * @param minor The minor version number
     */
    public static Version release(int major, int minor) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        return new Version(major, minor, 0, new Object[0], null);
    }

    /**
     * Creates a release version: {@code [major].[minor].[patch]}.
     *
     * @param major The major version number
     * @param minor The minor version number
     * @param patch The patch version number
     */
    public static Version release(int major, int minor, int patch) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        Validate.notNegative(patch, "patch");
        return new Version(major, minor, patch, new Object[0], null);
    }

    /**
     * Creates an alpha version: {@code [major].[minor].[patch]-alpha}.
     *
     * @param major The major version number
     * @param minor The minor version number
     * @param patch The patch version number
     */
    public static Version alpha(int major, int minor, int patch) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        Validate.notNegative(patch, "patch");
        return new Version(major, minor, patch, new Object[] {"alpha"}, null);
    }

    /**
     * Creates an alpha version: {@code [major].[minor].[patch]-alpha.[pre]}.
     *
     * @param major The major version number
     * @param minor The minor version number
     * @param patch The patch version number
     * @param pre   The alpha version number
     */
    public static Version alpha(int major, int minor, int patch, int pre) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        Validate.notNegative(patch, "patch");
        Validate.notNegative(pre, "pre");
        return new Version(major, minor, patch, new Object[] {"alpha", pre}, null);
    }

    /**
     * Creates a beta version: {@code [major].[minor].[patch]-beta}.
     *
     * @param major The major version number
     * @param minor The minor version number
     * @param patch The patch version number
     */
    public static Version beta(int major, int minor, int patch) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        Validate.notNegative(patch, "patch");
        return new Version(major, minor, patch, new Object[] {"beta"}, null);
    }

    /**
     * Creates a beta version: {@code [major].[minor].[patch]-beta.[pre]}.
     *
     * @param major The major version number
     * @param minor The minor version number
     * @param patch The patch version number
     * @param pre   The beta version number
     */
    public static Version beta(int major, int minor, int patch, int pre) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        Validate.notNegative(patch, "patch");
        Validate.notNegative(pre, "pre");
        return new Version(major, minor, patch, new Object[] {"beta", pre}, null);
    }

    /**
     * Creates a pre-released version: {@code [major].[minor].[patch]-pre}.
     *
     * @param major The major version number
     * @param minor The minor version number
     * @param patch The patch version number
     */
    public static Version pre(int major, int minor, int patch) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        Validate.notNegative(patch, "patch");
        return new Version(major, minor, patch, new Object[] {"pre"}, null);
    }

    /**
     * Creates a pre-released version: {@code [major].[minor].[patch]-pre.[pre]}.
     *
     * @param major The major version number
     * @param minor The minor version number
     * @param patch The patch version number
     * @param pre   The pre-release version number
     */
    public static Version pre(int major, int minor, int patch, int pre) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        Validate.notNegative(patch, "patch");
        Validate.notNegative(pre, "pre");
        return new Version(major, minor, patch, new Object[] {"pre", pre}, null);
    }

    /**
     * Creates a release candidate version: {@code [major].[minor].[patch]-rc}.
     *
     * @param major The major version number
     * @param minor The minor version number
     * @param patch The patch version number
     */
    public static Version rc(int major, int minor, int patch) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        Validate.notNegative(patch, "patch");
        return new Version(major, minor, patch, new Object[] {"rc"}, null);
    }

    /**
     * Creates a release candidate version: {@code [major].[minor].[patch]-rc.[pre]}.
     *
     * @param major The major version number
     * @param minor The minor version number
     * @param patch The patch version number
     * @param pre   The release candidate version number
     */
    public static Version rc(int major, int minor, int patch, int pre) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        Validate.notNegative(patch, "patch");
        Validate.notNegative(pre, "pre");
        return new Version(major, minor, patch, new Object[] {"rc", pre}, null);
    }

    /**
     * Creates a custom pre-release version: {@code [major].[minor].[patch]-[pretype]}.
     *
     * @param major The major version number
     * @param minor The minor version number
     * @param patch The patch version number
     */
    public static Version prerelease(int major, int minor, int patch, String pretype) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        Validate.notNegative(patch, "patch");
        Validate.notNull(pretype, "pretype");
        return new Version(major, minor, patch, new Object[] {pretype}, null);
    }

    /**
     * Creates a custom pre-release version: {@code [major].[minor].[patch]-[pretype].[pre]}.
     *
     * @param major The major version number
     * @param minor The minor version number
     * @param patch The patch version number
     * @param pre   The pre-release version number
     */
    public static Version prerelease(int major, int minor, int patch, String pretype, int pre) {
        Validate.notNegative(major, "major");
        Validate.notNegative(minor, "minor");
        Validate.notNegative(patch, "patch");
        Validate.notNull(pretype, "pretype");
        Validate.notNegative(pre, "pre");
        return new Version(major, minor, patch, new Object[] {pretype, pre}, null);
    }

    private static final String PRE = "(?:[a-zA-Z-][a-zA-Z0-9-]*|0|[1-9]\\d*)";
    private static final Pattern VERSION_PATTERN = Pattern.compile(
        "(0|[1-9]\\d*)" + // Major
            "\\.(0|[1-9]\\d*)" + // Minor
            "(?:\\.(0|[1-9]\\d*))?" + // Patch (required in semver, but we allow omitting it anyways)
            "(?:-(" + PRE + "(?:\\." + PRE + ")*))?" + // Prerelease
            "(?:\\+([a-zA-Z0-9-.]))?" // Build metadata
    );

    /**
     * Parses a semantic version string. This parse function is in compliance with the <a href="https://semver.org/">
     * semantic versioning specification 2.0.0</a>, except that it allows omitting the patch number.
     *
     * @param string The version to be parsed
     * @return The parsed version
     *
     * @throws NullPointerException     When the specified string is null.
     * @throws IllegalArgumentException When the specified version string is not in a valid SemVer format.
     */
    public static Version parse(String string) {
        Validate.notNull(string, "string");
        Matcher matcher = VERSION_PATTERN.matcher(string);
        if (!matcher.matches())
            throw new IllegalArgumentException("Invalid version string: " + string);

        String sMajor = matcher.group(1);
        String sMinor = matcher.group(2);
        String sPatch = matcher.group(3);
        String sPre = matcher.group(4);
        String buildMeta = matcher.group(5);

        try {
            int major = Integer.parseInt(sMajor);
            int minor = Integer.parseInt(sMinor);
            int patch = sPatch == null ? 0 : Integer.parseInt(sPatch);

            Object[] pre = {};
            if (sPre != null) {
                String[] preStrs = sPre.split("\\.");
                pre = new Object[preStrs.length];
                for (int i = 0, l = pre.length; i < l; i++) {
                    pre[i] = toIntIfPossible(preStrs[i], string);
                }
            }

            return new Version(major, minor, patch, pre, buildMeta);
        } catch (NumberFormatException exc) {
            // In case of integer overflows just throw an exception
            throw new IllegalArgumentException("Invalid version string: " + string, exc);
        }
    }

    private static Object toIntIfPossible(String str, String input) {
        for (int i = 0, l = str.length(); i < l; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9')
                return str;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException exc) {
            // In case of integer overflows just throw an exception
            throw new IllegalArgumentException("Invalid version string: " + input, exc);
        }
    }

    /**
     * Checks if this version number is the same version number as the object passed to this function. If the given
     * object is not a {@link Version} instance this method will return false. Build metadata is considered. Two version
     * numbers are only equal if their string representations are equal.
     *
     * @param o The object to compare to.
     * @return True if this version is equal to the given object.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Version)) return false;
        Version v = (Version) o;
        return compareTo(v) == 0 && Objects.equals(buildMeta, v.buildMeta);
    }

    /**
     * Returns a hash code of this version. This hashes the version itself, including prereleases and build metadata.
     */
    @Override
    public int hashCode() {
        int result = major;
        result = 31 * result + minor;
        result = 31 * result + patch;
        result = 31 * result + Arrays.hashCode(prereleases);
        result = 31 * result + (buildMeta == null ? 0 : buildMeta.hashCode());
        return result;
    }

    /**
     * Compares this version to another, comparing based on the <a href="https://semver.org/">semantic versioning
     * specification 2.0.0</a>. Build metadata is ignored.
     *
     * @param o The other version to compare to.
     * @return A number equal to zero if the two versions are the same (ignoring build metadata), a number more than
     *     zero if this version is a higher version than the one given, or a number less than zero if this version is a
     *     lower version than the one given.
     *
     * @throws NullPointerException When comparing to a null value.
     */
    @Override
    public int compareTo(Version o) {
        Validate.notNull(o, "o");
        if (o == this) return 0;

        if (major < o.major) return -1;
        if (major > o.major) return 1;
        if (minor < o.minor) return -1;
        if (minor > o.minor) return 1;
        if (patch < o.patch) return -1;
        if (patch > o.patch) return 1;

        int al = prereleases.length;
        int bl = o.prereleases.length;

        if (al == 0 && bl == 0) return 0;
        if (al != 0 && bl == 0) return -1;
        if (al == 0) return 1;

        int l = Math.min(al, bl);
        for (int i = 0; i < l; i++) {
            Object a = prereleases[i];
            Object b = o.prereleases[i];
            int c = comparePrerelease(a, b);
            if (c != 0)
                return c;
        }

        return Integer.compare(al, bl);
    }

    private static int comparePrerelease(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return ((Integer) a).compareTo((Integer) b);
        }
        if (a instanceof String && b instanceof String) {
            return ((String) a).compareTo((String) b);
        }
        return a instanceof Integer ? -1 : 1;
    }

    /**
     * Returns a string representation of this version. The given representation is in compliance with the
     * <a href="https://semver.org/">semantic versioning specification 2.0.0</a>. Build metadata is included.
     */
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append(major);
        out.append(".").append(minor);
        out.append(".").append(patch);
        if (prereleases.length > 0) {
            for (int i = 0, l = prereleases.length; i < l; i++) {
                out.append(i == 0 ? "-" : ".");
                out.append(prereleases[i]);
            }
        }
        if (buildMeta != null) {
            out.append("+").append(buildMeta);
        }
        return out.toString();
    }
}
