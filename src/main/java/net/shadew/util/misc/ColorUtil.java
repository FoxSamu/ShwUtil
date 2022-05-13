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

import net.shadew.util.contract.NotNull;
import net.shadew.util.contract.Validate;

/**
 * Utilities for creating and manipulating colors, encoded in integers.
 */
public final class ColorUtil {
    /**
     * Fully transparent black
     */
    public static final int TRANSPARENT = 0;

    /**
     * Black:
     * <span style="background-color: black;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int BLACK = 0xFF000000;

    /**
     * White:
     * <span style="background-color: white;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int WHITE = 0xFFFFFFFF;

    /**
     * Grey:
     * <span style="background-color: #888888;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int GREY = 0xFF888888;

    /**
     * Silver/Light grey:
     * <span style="background-color: #cccccc;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int SILVER = 0xFFCCCCCC;

    /**
     * Red:
     * <span style="background-color: #ff0000;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int RED = 0xFFFF0000;

    /**
     * Lime/Light green:
     * <span style="background-color: #00ff00;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int LIME = 0xFF00FF00;

    /**
     * Blue:
     * <span style="background-color: #0000ff;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int BLUE = 0xFF0000FF;

    /**
     * Green:
     * <span style="background-color: #008800;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int GREEN = 0xFF008800;

    /**
     * Yellow:
     * <span style="background-color: #ffff00;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int YELLOW = 0xFFFFFF00;

    /**
     * Cyan:
     * <span style="background-color: #00ffff;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int CYAN = 0xFF00FFFF;

    /**
     * Magenta:
     * <span style="background-color: #ff00ff;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int MAGENTA = 0xFFFF00FF;

    /**
     * Orange:
     * <span style="background-color: #ff8800;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int ORANGE = 0xFFFF8800;

    /**
     * Purple:
     * <span style="background-color: #8800ff;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int PURPLE = 0xFF8800FF;

    /**
     * Teal:
     * <span style="background-color: #008888;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int TEAL = 0xFF008888;

    /**
     * Brown:
     * <span style="background-color: #884400;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int BROWN = 0xFF884400;

    /**
     * Indigo:
     * <span style="background-color: #330088;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int INDIGO = 0xFF330088;

    /**
     * Pink:
     * <span style="background-color: #ff88cc;"><code>&nbsp;&nbsp;</code></span>
     */
    public static final int PINK = 0xFFFF88CC;

    private ColorUtil() {
    }

    /**
     * Returns the red value of a color, as an int between 0 and 255 (inclusive)
     *
     * @param rgb The color
     * @return The red value
     */
    public static int redi(int rgb) {
        return rgb >>> 16 & 0xFF;
    }

    /**
     * Returns the green value of a color, as an int between 0 and 255 (inclusive)
     *
     * @param rgb The color
     * @return The green value
     */
    public static int greeni(int rgb) {
        return rgb >>> 8 & 0xFF;
    }

    /**
     * Returns the blue value of a color, as an int between 0 and 255 (inclusive)
     *
     * @param rgb The color
     * @return The blue value
     */
    public static int bluei(int rgb) {
        return rgb & 0xFF;
    }

    /**
     * Returns the alpha value of a color, as an int between 0 and 255 (inclusive)
     *
     * @param rgba The color
     * @return The alpha value
     */
    public static int alphai(int rgba) {
        return rgba >>> 24 & 0xFF;
    }

    /**
     * Returns the red value of a color, as a double between 0 and 1 (inclusive)
     *
     * @param rgb The color
     * @return The red value
     */
    public static double redd(int rgb) {
        return redi(rgb) / 255D;
    }

    /**
     * Returns the green value of a color, as a double between 0 and 1 (inclusive)
     *
     * @param rgb The color
     * @return The green value
     */
    public static double greend(int rgb) {
        return greeni(rgb) / 255D;
    }

    /**
     * Returns the blue value of a color, as a double between 0 and 1 (inclusive)
     *
     * @param rgb The color
     * @return The blue value
     */
    public static double blued(int rgb) {
        return bluei(rgb) / 255D;
    }

    /**
     * Returns the alpha value of a color, as a double between 0 and 1 (inclusive)
     *
     * @param rgba The color
     * @return The alpha value
     */
    public static double alphad(int rgba) {
        return alphai(rgba) / 255D;
    }

    /**
     * Returns the red value of a color, as a float between 0 and 1 (inclusive)
     *
     * @param rgb The color
     * @return The red value
     */
    public static float redf(int rgb) {
        return redi(rgb) / 255F;
    }

    /**
     * Returns the green value of a color, as a float between 0 and 1 (inclusive)
     *
     * @param rgb The color
     * @return The green value
     */
    public static float greenf(int rgb) {
        return greeni(rgb) / 255F;
    }

    /**
     * Returns the blue value of a color, as a float between 0 and 1 (inclusive)
     *
     * @param rgb The color
     * @return The blue value
     */
    public static float bluef(int rgb) {
        return bluei(rgb) / 255F;
    }

    /**
     * Returns the alpha value of a color, as a float between 0 and 1 (inclusive)
     *
     * @param rgba The color
     * @return The alpha value
     */
    public static float alphaf(int rgba) {
        return alphai(rgba) / 255F;
    }

    /**
     * Returns the color from rgb values, not considering alpha
     *
     * @param r Red (0-255)
     * @param g Green (0-255)
     * @param b Blue (0-255)
     * @return The computed color
     */
    public static int rgb(int r, int g, int b) {
        return (r & 0xFF) << 16 | (g & 0xFF) << 8 | b & 0xFF;
    }

    /**
     * Returns the color from rgb values, considering alpha
     *
     * @param r Red (0-255)
     * @param g Green (0-255)
     * @param b Blue (0-255)
     * @param a Alpha (0-255)
     * @return The computed color
     */
    public static int rgba(int r, int g, int b, int a) {
        return (a & 0xFF) << 24 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | b & 0xFF;
    }

    /**
     * Returns the color from rgb values, considering alpha
     *
     * @param r Red (0-255)
     * @param g Green (0-255)
     * @param b Blue (0-255)
     * @return The computed color
     */
    public static int rgba(int r, int g, int b) {
        return 0xFF000000 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | b & 0xFF;
    }

    /**
     * Returns the color from rgb values, not considering alpha
     *
     * @param r Red (0-1)
     * @param g Green (0-1)
     * @param b Blue (0-1)
     * @return The computed color
     */
    public static int rgb(float r, float g, float b) {
        return rgb((int) (r * 255), (int) (g * 255), (int) (b * 255));
    }

    /**
     * Returns the color from rgb values, considering alpha
     *
     * @param r Red (0-1)
     * @param g Green (0-1)
     * @param b Blue (0-1)
     * @param a Alpha (0-1)
     * @return The computed color
     */
    public static int rgba(float r, float g, float b, float a) {
        return rgba((int) (r * 255), (int) (g * 255), (int) (b * 255), (int) (a * 255));
    }

    /**
     * Returns the color from rgb values, considering alpha
     *
     * @param r Red (0-1)
     * @param g Green (0-1)
     * @param b Blue (0-1)
     * @return The computed color
     */
    public static int rgba(float r, float g, float b) {
        return rgba((int) (r * 255), (int) (g * 255), (int) (b * 255));
    }

    /**
     * Returns the color from rgb values, not considering alpha
     *
     * @param r Red (0-1)
     * @param g Green (0-1)
     * @param b Blue (0-1)
     * @return The computed color
     */
    public static int rgb(double r, double g, double b) {
        return rgb((int) (r * 255), (int) (g * 255), (int) (b * 255));
    }

    /**
     * Returns the color from rgb values, considering alpha
     *
     * @param r Red (0-1)
     * @param g Green (0-1)
     * @param b Blue (0-1)
     * @param a Alpha (0-1)
     * @return The computed color
     */
    public static int rgba(double r, double g, double b, double a) {
        return rgba((int) (r * 255), (int) (g * 255), (int) (b * 255), (int) (a * 255));
    }

    /**
     * Returns the color from rgb values, considering alpha
     *
     * @param r Red (0-1)
     * @param g Green (0-1)
     * @param b Blue (0-1)
     * @return The computed color
     */
    public static int rgba(double r, double g, double b) {
        return rgba((int) (r * 255), (int) (g * 255), (int) (b * 255));
    }

    /**
     * Returns the specified color with the alpha set to fully opaque
     *
     * @param rgb A color, with or without alpha value
     * @return The new color
     */
    public static int opaque(int rgb) {
        return 0xFF000000 | rgb & 0xFFFFFF;
    }

    /**
     * Returns the specified color with the alpha set to a given value
     *
     * @param rgb A color, with or without alpha value
     * @param a   The alpha value (0-255)
     * @return The new color
     */
    public static int withAlpha(int rgb, int a) {
        return (a & 0xFF) << 24 | rgb & 0xFFFFFF;
    }

    /**
     * Returns the specified color with the alpha set to a given value
     *
     * @param rgb A color, with or without alpha value
     * @param a   The alpha value (0-1)
     * @return The new color
     */
    public static int withAlpha(int rgb, float a) {
        return withAlpha(rgb, (int) (a * 255));
    }

    /**
     * Returns the specified color with the alpha set to a given value
     *
     * @param rgb A color, with or without alpha value
     * @param a   The alpha value (0-1)
     * @return The new color
     */
    public static int withAlpha(int rgb, double a) {
        return withAlpha(rgb, (int) (a * 255));
    }

    /**
     * Returns the specified color without alpha
     *
     * @param rgba A color, with or without alpha value
     * @return The new color
     */
    public static int rgb(int rgba) {
        return rgba & 0x00FFFFFF;
    }

    /**
     * Computes a color from HSV (hue-saturation-value) values, not considering alpha
     *
     * @param h Hue (0-360)
     * @param s Saturation (0-1)
     * @param v Value (0-1)
     * @return The new color
     */
    public static int hsv(float h, float s, float v) {
        h %= 360;

        float c = v * s;
        float x = c * (1 - Math.abs(h / 60 % 2 - 1));
        int hi = (int) (h / 60);

        float ra, ga, ba;
        switch (hi) {
            default:
            case 0:
                ra = c;
                ga = x;
                ba = 0;
                break;
            case 1:
                ra = x;
                ga = c;
                ba = 0;
                break;
            case 2:
                ra = 0;
                ga = c;
                ba = x;
                break;
            case 3:
                ra = 0;
                ga = x;
                ba = c;
                break;
            case 4:
                ra = x;
                ga = 0;
                ba = c;
                break;
            case 5:
                ra = c;
                ga = 0;
                ba = x;
                break;
        }

        float m = v - c;

        float r = ra + m;
        float g = ga + m;
        float b = ba + m;

        return rgb(r, g, b);
    }

    /**
     * Computes a color from HSV (hue-saturation-value) values, considering alpha
     *
     * @param h Hue (0-360)
     * @param s Saturation (0-1)
     * @param v Value (0-1)
     * @param a Alpha (0-1)
     * @return The new color
     */
    public static int hsva(float h, float s, float v, float a) {
        return withAlpha(hsv(h, s, v), a);
    }

    /**
     * Computes a color from HSV (hue-saturation-value) values, considering alpha
     *
     * @param h Hue (0-360)
     * @param s Saturation (0-1)
     * @param v Value (0-1)
     * @return The new color
     */
    public static int hsva(float h, float s, float v) {
        return opaque(hsv(h, s, v));
    }

    /**
     * Computes a color from HSV (hue-saturation-value) values, not considering alpha
     *
     * @param h Hue (0-360)
     * @param s Saturation (0-1)
     * @param v Value (0-1)
     * @return The new color
     */
    public static int hsv(double h, double s, double v) {
        return hsv((float) h, (float) s, (float) v);
    }

    /**
     * Computes a color from HSV (hue-saturation-value) values, considering alpha
     *
     * @param h Hue (0-360)
     * @param s Saturation (0-1)
     * @param v Value (0-1)
     * @param a Alpha (0-1)
     * @return The new color
     */
    public static int hsva(double h, double s, double v, double a) {
        return hsva((float) h, (float) s, (float) v, (float) a);
    }

    /**
     * Computes a color from HSV (hue-saturation-value) values, considering alpha
     *
     * @param h Hue (0-360)
     * @param s Saturation (0-1)
     * @param v Value (0-1)
     * @return The new color
     */
    public static int hsva(double h, double s, double v) {
        return hsva((float) h, (float) s, (float) v);
    }

    /**
     * Returns the average of the red, green and blue components as a float between 0 and 1 (inclusive)
     *
     * @param rgb The input color
     * @return The greyscale value
     */
    public static float greyf(int rgb) {
        return (redf(rgb) + greenf(rgb) + bluef(rgb)) / 3;
    }

    /**
     * Returns the average of the red, green and blue components as a double between 0 and 1 (inclusive)
     *
     * @param rgb The input color
     * @return The greyscale value
     */
    public static double greyd(int rgb) {
        return (redd(rgb) + greend(rgb) + blued(rgb)) / 3;
    }

    /**
     * Returns the average of the red, green and blue components as an int between 0 and 255 (inclusive)
     *
     * @param rgb The input color
     * @return The greyscale value
     */
    public static int greyi(int rgb) {
        return (redi(rgb) + greeni(rgb) + bluei(rgb)) / 3;
    }

    /**
     * Returns the CIE-1931-Y weighted average of the red, green and blue components as a float between 0 and 1
     * (inclusive)
     *
     * @param rgb The input color
     * @return The greyscale value
     */
    public static float cie1931yf(int rgb) {
        return (2126 * redf(rgb) + 7152 * greenf(rgb) + 722 * bluef(rgb)) / 10000;
    }

    /**
     * Returns the CIE-1931-Y weighted average of the red, green and blue components as a double between 0 and 1
     * (inclusive)
     *
     * @param rgb The input color
     * @return The greyscale value
     */
    public static double cie1931yd(int rgb) {
        return (2126 * redd(rgb) + 7152 * greend(rgb) + 722 * blued(rgb)) / 10000;
    }

    /**
     * Returns the CIE-1931-Y weighted average of the red, green and blue components as an int between 0 and 255
     * (inclusive)
     *
     * @param rgb The input color
     * @return The greyscale value
     */
    public static int cie1931yi(int rgb) {
        return (2126 * redi(rgb) + 7152 * greeni(rgb) + 722 * bluei(rgb)) / 10000;
    }

    /**
     * Returns the color from a greyscale value, not considering alpha
     *
     * @param tint Grey tint (0-255)
     * @return The new color
     */
    public static int grey(int tint) {
        return rgb(tint, tint, tint);
    }

    /**
     * Returns the color from a greyscale value, considering alpha
     *
     * @param tint Grey tint (0-255)
     * @param a    Alpha (0-255)
     * @return The new color
     */
    public static int greya(int tint, int a) {
        return rgba(tint, tint, tint, a);
    }

    /**
     * Returns the color from a greyscale value, considering alpha
     *
     * @param tint Grey tint (0-255)
     * @return The new color
     */
    public static int greya(int tint) {
        return rgba(tint, tint, tint);
    }

    /**
     * Returns the color from a greyscale value, not considering alpha
     *
     * @param tint Grey tint (0-1)
     * @return The new color
     */
    public static int grey(float tint) {
        return rgb(tint, tint, tint);
    }

    /**
     * Returns the color from a greyscale value, considering alpha
     *
     * @param tint Grey tint (0-1)
     * @param a    Alpha (0-1)
     * @return The new color
     */
    public static int greya(float tint, float a) {
        return rgba(tint, tint, tint, a);
    }

    /**
     * Returns the color from a greyscale value, considering alpha
     *
     * @param tint Grey tint (0-1)
     * @return The new color
     */
    public static int greya(float tint) {
        return rgba(tint, tint, tint);
    }

    /**
     * Returns the color from a greyscale value, not considering alpha
     *
     * @param tint Grey tint (0-1)
     * @return The new color
     */
    public static int grey(double tint) {
        return rgb(tint, tint, tint);
    }

    /**
     * Returns the color from a greyscale value, considering alpha
     *
     * @param tint Grey tint (0-1)
     * @param a    Alpha (0-1)
     * @return The new color
     */
    public static int greya(double tint, double a) {
        return rgba(tint, tint, tint, a);
    }

    /**
     * Returns the color from a greyscale value, considering alpha
     *
     * @param tint Grey tint (0-1)
     * @return The new color
     */
    public static int greya(double tint) {
        return rgba(tint, tint, tint);
    }

    /**
     * Returns the inverse of the specified color. The alpha channel is included but not inverted
     *
     * @param rgb The color to get the inverse of
     * @return The inverse color
     */
    public static int inverse(int rgb) {
        int a = rgb >>> 24 & 0xFF;
        int r = rgb >>> 16 & 0xFF;
        int g = rgb >>> 8 & 0xFF;
        int b = rgb & 0xFF;
        r = 255 - r;
        g = 255 - g;
        b = 255 - b;
        return rgba(r, g, b, a);
    }

    /**
     * Makes the specified color blacker by the specified amount. This is equivalent to mixing with black. Alpha channel
     * is considered but not changed.
     *
     * @param rgb    The color to make blacker, with or without alpha
     * @param amount The amount of black that should be added (0-1)
     * @return A blacker color
     */
    public static int blacker(int rgb, float amount) {
        float a = alphaf(rgb);
        float r = redf(rgb);
        float g = greenf(rgb);
        float b = bluef(rgb);
        float mul = 1 - amount;
        r *= mul;
        g *= mul;
        b *= mul;
        return rgba(r, g, b, a);
    }

    /**
     * Makes the specified color whiter by the specified amount. This is equivalent to mixing with white. Alpha channel
     * is considered but not changed.
     *
     * @param rgb    The color to make whiter, with or without alpha
     * @param amount The amount of white that should be added (0-1)
     * @return A whiter color
     */
    public static int whiter(int rgb, float amount) {
        float a = alphaf(rgb);
        float r = 1 - redf(rgb);
        float g = 1 - greenf(rgb);
        float b = 1 - bluef(rgb);
        float mul = 1 - amount;
        r *= mul;
        g *= mul;
        b *= mul;
        return rgba(1 - r, 1 - g, 1 - b, a);
    }

    /**
     * Makes the specified color blacker by the specified amount. This is equivalent to mixing with black. Alpha channel
     * is considered but not changed.
     *
     * @param rgb    The color to make blacker, with or without alpha
     * @param amount The amount of black that should be added (0-1)
     * @return A blacker color
     */
    public static int blacker(int rgb, double amount) {
        return blacker(rgb, (float) amount);
    }

    /**
     * Makes the specified color whiter by the specified amount. This is equivalent to mixing with white. Alpha channel
     * is considered but not changed.
     *
     * @param rgb    The color to make whiter, with or without alpha
     * @param amount The amount of white that should be added (0-1)
     * @return A whiter color
     */
    public static int whiter(int rgb, double amount) {
        return whiter(rgb, (float) amount);
    }

    /**
     * Makes the specified color blacker by the specified amount. This is equivalent to mixing with black. Alpha channel
     * is considered but not changed.
     *
     * @param rgb    The color to make blacker, with or without alpha
     * @param amount The amount of black that should be added (0-255)
     * @return A blacker color
     */
    public static int blacker(int rgb, int amount) {
        return blacker(rgb, amount / 255F);
    }

    /**
     * Makes the specified color whiter by the specified amount. This is equivalent to mixing with white. Alpha channel
     * is considered but not changed.
     *
     * @param rgb    The color to make whiter, with or without alpha
     * @param amount The amount of white that should be added (0-255)
     * @return A whiter color
     */
    public static int whiter(int rgb, int amount) {
        return whiter(rgb, amount / 255F);
    }

    /**
     * Makes the specified color darker by the specified amount. The alpha channel is considered but not changed.
     *
     * @param rgb    The color to make darker
     * @param amount The amount to make the color darker (0-1)
     * @return A darker color
     */
    public static int darker(int rgb, float amount) {
        float h = huef(rgb);
        float s = saturationf(rgb);
        float l = lightnessf(rgb);
        float a = alphaf(rgb);
        return hsla(h, s, l * (1 - amount), a);
    }

    /**
     * Makes the specified color lighter by the specified amount. The alpha channel is considered but not changed.
     *
     * @param rgb    The color to make lighter
     * @param amount The amount to make the color lighter (0-1)
     * @return A lighter color
     */
    public static int lighter(int rgb, float amount) {
        float h = huef(rgb);
        float s = saturationf(rgb);
        float l = lightnessf(rgb);
        float a = alphaf(rgb);
        return hsla(h, s, 1 - (1 - l) * (1 - amount), a);
    }

    /**
     * Makes the specified color darker by the specified amount. The alpha channel is considered but not changed.
     *
     * @param rgb    The color to make darker
     * @param amount The amount to make the color darker (0-1)
     * @return A darker color
     */
    public static int darker(int rgb, double amount) {
        return darker(rgb, (float) amount);
    }

    /**
     * Makes the specified color lighter by the specified amount. The alpha channel is considered but not changed.
     *
     * @param rgb    The color to make lighter
     * @param amount The amount to make the color lighter (0-1)
     * @return A lighter color
     */
    public static int lighter(int rgb, double amount) {
        return lighter(rgb, (float) amount);
    }

    /**
     * Makes the specified color darker by the specified amount. The alpha channel is considered but not changed.
     *
     * @param rgb    The color to make darker
     * @param amount The amount to make the color darker (0-255)
     * @return A darker color
     */
    public static int darker(int rgb, int amount) {
        return darker(rgb, amount / 255F);
    }

    /**
     * Makes the specified color lighter by the specified amount. The alpha channel is considered but not changed.
     *
     * @param rgb    The color to make lighter
     * @param amount The amount to make the color lighter (0-255)
     * @return A lighter color
     */
    public static int lighter(int rgb, int amount) {
        return lighter(rgb, amount / 255F);
    }

    /**
     * Adds two colors. The alpha value of each color is used to weigh out that color against the other and the final
     * alpha value is the maximum of both.
     *
     * @param a The first color
     * @param b The second color
     * @return The added color
     */
    public static int add(int a, int b) {
        float rA = redf(a);
        float gA = greenf(a);
        float bA = bluef(a);
        float aA = alphaf(a);
        float rB = redf(b);
        float gB = greenf(b);
        float bB = bluef(b);
        float aB = alphaf(b);

        float maxAlpha = Math.max(aA, aB);
        // When maxAlpha is 0 both alpha values are 0 and mix values should be 1
        // Skip an unnecessary and impossible division by 0
        float aMix = maxAlpha == 0 ? 1 : MathUtil.clamp(0, 1, aA / maxAlpha);
        float bMix = maxAlpha == 0 ? 1 : MathUtil.clamp(0, 1, aB / maxAlpha);

        return rgba(
            MathUtil.clamp(0, 1, rA * aMix + rB * bMix),
            MathUtil.clamp(0, 1, gA * aMix + gB * bMix),
            MathUtil.clamp(0, 1, bA * aMix + bB * bMix),
            maxAlpha
        );
    }

    /**
     * Subtracts two colors. The alpha value of each color is used to weigh out that color against the other and the
     * final alpha value is the minimum of both.
     *
     * @param a The first color
     * @param b The second color
     * @return The subtracted color
     */
    public static int sub(int a, int b) {
        float rA = redf(a);
        float gA = greenf(a);
        float bA = bluef(a);
        float aA = alphaf(a);
        float rB = redf(b);
        float gB = greenf(b);
        float bB = bluef(b);
        float aB = alphaf(b);

        float maxAlpha = Math.max(aA, aB);
        // When maxAlpha is 0 both alpha values are 0 and mix values should be 1
        // Skip an unnecessary and impossible division by 0
        float aMix = maxAlpha == 0 ? 1 : MathUtil.clamp(0, 1, aA / maxAlpha);
        float bMix = maxAlpha == 0 ? 1 : MathUtil.clamp(0, 1, aB / maxAlpha);

        return rgba(
            MathUtil.clamp(0, 1, rA * aMix - rB * bMix),
            MathUtil.clamp(0, 1, gA * aMix - gB * bMix),
            MathUtil.clamp(0, 1, bA * aMix - bB * bMix),
            Math.min(aA, aB)
        );
    }

    /**
     * Multiplies two colors. The alpha value of each color is used to weigh out that color agains the others and the
     * final alpha value is the minimum of both.
     *
     * @param a The first color
     * @param b The second color
     * @return The multiplied color
     */
    public static int mul(int a, int b) {
        float rA = redf(a);
        float gA = greenf(a);
        float bA = bluef(a);
        float aA = alphaf(a);
        float rB = redf(b);
        float gB = greenf(b);
        float bB = bluef(b);
        float aB = alphaf(b);

        float maxAlpha = Math.max(aA, aB);
        // When maxAlpha is 0 both alpha values are 0 and mix values should be 1
        // Skip an unnecessary and impossible division by 0
        float aMix = maxAlpha == 0 ? 1 : MathUtil.clamp(0, 1, aA / maxAlpha);
        float bMix = maxAlpha == 0 ? 1 : MathUtil.clamp(0, 1, aB / maxAlpha);

        return rgba(
            MathUtil.clamp(0, 1, rA * aMix * (rB * bMix)),
            MathUtil.clamp(0, 1, gA * aMix * (gB * bMix)),
            MathUtil.clamp(0, 1, bA * aMix * (bB * bMix)),
            MathUtil.min(aA, aB)
        );
    }

    /**
     * Multiplies a color with a scalar. The alpha value of the output is untouched
     *
     * @param a   The color
     * @param val The mutliplier
     * @return The multiplied color
     */
    public static int mul(int a, float val) {
        return rgba(
            MathUtil.clamp(0, 1, redf(a) * val),
            MathUtil.clamp(0, 1, greenf(a) * val),
            MathUtil.clamp(0, 1, bluef(a) * val),
            alphaf(a)
        );
    }

    /**
     * Divides two colors. The alpha value of each color is used to weigh out that color agains the others and the final
     * alpha value is the maximum of both.
     *
     * @param a The first color
     * @param b The second color
     * @return The divided color
     */
    public static int div(int a, int b) {
        float rA = redf(a);
        float gA = greenf(a);
        float bA = bluef(a);
        float aA = alphaf(a);
        float rB = redf(b);
        float gB = greenf(b);
        float bB = bluef(b);
        float aB = alphaf(b);

        float maxAlpha = Math.max(aA, aB);
        // When maxAlpha is 0 both alpha values are 0 and mix values should be 1
        // Skip an unnecessary and impossible division by 0
        float aMix = maxAlpha == 0 ? 1 : MathUtil.clamp(0, 1, aA / maxAlpha);
        float bMix = maxAlpha == 0 ? 1 : MathUtil.clamp(0, 1, aB / maxAlpha);

        return rgba(
            MathUtil.clamp(0, 1, rA * aMix / (rB * bMix)),
            MathUtil.clamp(0, 1, gA * aMix / (gB * bMix)),
            MathUtil.clamp(0, 1, bA * aMix / (bB * bMix)),
            maxAlpha
        );
    }

    /**
     * Divides a color by a scalar. The alpha value of the output is untouched
     *
     * @param a   The color
     * @param val The mutliplier
     * @return The divided color
     */
    public static int div(int a, float val) {
        return rgba(
            MathUtil.clamp(0, 1, redf(a) / val),
            MathUtil.clamp(0, 1, greenf(a) / val),
            MathUtil.clamp(0, 1, bluef(a) / val),
            alphaf(a)
        );
    }

    /**
     * Composites two colors by taking the minimum of each channel (this includes alpha, but it's not required).
     *
     * @param a The first color
     * @param b The second color
     * @return The darkened color
     */
    public static int darken(int a, int b) {
        return rgba(
            MathUtil.min(redf(a), redf(b)),
            MathUtil.min(greenf(a), greenf(b)),
            MathUtil.min(bluef(a), bluef(b)),
            MathUtil.min(alphaf(a), alphaf(b))
        );
    }

    /**
     * Composites two colors by taking the maximum of each channel (this includes alpha, but it's not required).
     *
     * @param a The first color
     * @param b The second color
     * @return The lightened color
     */
    public static int lighten(int a, int b) {
        return rgba(
            MathUtil.max(redf(a), redf(b)),
            MathUtil.max(greenf(a), greenf(b)),
            MathUtil.max(bluef(a), bluef(b)),
            MathUtil.max(alphaf(a), alphaf(b))
        );
    }

    /**
     * Returns the color with the least {@linkplain #greyf greyscale} value.
     *
     * @param a The first color
     * @param b The second color
     * @return The darkest color
     */
    public static int darkest(int a, int b) {
        return greyf(a) < greyf(b) ? a : b;
    }

    /**
     * Returns the color with the highest {@linkplain #greyf greyscale} value.
     *
     * @param a The first color
     * @param b The second color
     * @return The lightest color
     */
    public static int lightest(int a, int b) {
        return greyf(a) > greyf(b) ? a : b;
    }

    /**
     * Returns the color with the least {@linkplain #cie1931yf CIE-1931-Y greyscale} value.
     *
     * @param a The first color
     * @param b The second color
     * @return The darkest color
     */
    public static int darkestCIE1931(int a, int b) {
        return cie1931yf(a) < cie1931yf(b) ? a : b;
    }

    /**
     * Returns the color with the highest {@linkplain #cie1931yf CIE-1931-Y greyscale} value.
     *
     * @param a The first color
     * @param b The second color
     * @return The lightest color
     */
    public static int lightestCIE1931(int a, int b) {
        return cie1931yf(a) > cie1931yf(b) ? a : b;
    }

    /**
     * Returns the color with the least {@linkplain #redf red} value.
     *
     * @param a The first color
     * @param b The second color
     * @return The darkest color
     */
    public static int darkestRed(int a, int b) {
        return redf(a) < redf(b) ? a : b;
    }

    /**
     * Returns the color with the highest {@linkplain #redf red} value.
     *
     * @param a The first color
     * @param b The second color
     * @return The lightest color
     */
    public static int lightestRed(int a, int b) {
        return redf(a) > redf(b) ? a : b;
    }

    /**
     * Returns the color with the least {@linkplain #greenf green} value.
     *
     * @param a The first color
     * @param b The second color
     * @return The darkest color
     */
    public static int darkestGreen(int a, int b) {
        return greenf(a) < greenf(b) ? a : b;
    }

    /**
     * Returns the color with the highest {@linkplain #greenf green} value.
     *
     * @param a The first color
     * @param b The second color
     * @return The lightest color
     */
    public static int lightestGreen(int a, int b) {
        return greenf(a) > greenf(b) ? a : b;
    }

    /**
     * Returns the color with the least {@linkplain #bluef blue} value.
     *
     * @param a The first color
     * @param b The second color
     * @return The darkest color
     */
    public static int darkestBlue(int a, int b) {
        return bluef(a) < bluef(b) ? a : b;
    }

    /**
     * Returns the color with the highest {@linkplain #bluef blue} value.
     *
     * @param a The first color
     * @param b The second color
     * @return The lightest color
     */
    public static int lightestBlue(int a, int b) {
        return bluef(a) > bluef(b) ? a : b;
    }

    /**
     * Mixes two colors based on the alpha of the second color, yielding the color obtained by laying the second color
     * over the first color.
     *
     * @param a The background color
     * @param b The foreground color
     * @return The mixed color
     */
    public static int overlay(int a, int b) {
        return interpolate(a, b, alphaf(b));
    }

    /**
     * Interpolates two colors using the given interpolation value. This considers alpha (which is also interpolated),
     * but it also works on colors without an alpha channel.
     *
     * @param a The first color
     * @param b The second color
     * @param t The interpolation factor (0-1)
     * @return The interpolated color
     */
    public static int interpolate(int a, int b, float t) {
        return rgba(
            MathUtil.lerp(redf(a), redf(b), t),
            MathUtil.lerp(greenf(a), greenf(b), t),
            MathUtil.lerp(bluef(a), bluef(b), t),
            MathUtil.lerp(alphaf(a), alphaf(b), t)
        );
    }

    /**
     * Interpolates two colors using the given interpolation value. This considers alpha (which is also interpolated),
     * but it also works on colors without an alpha channel.
     *
     * @param a The first color
     * @param b The second color
     * @param t The interpolation factor (0-1)
     * @return The interpolated color
     */
    public static int interpolate(int a, int b, double t) {
        return interpolate(a, b, (float) t);
    }

    /**
     * Interpolates two colors using the given interpolation value. This considers alpha (which is also interpolated),
     * but it also works on colors without an alpha channel.
     *
     * @param a The first color
     * @param b The second color
     * @param t The interpolation factor (0-255)
     * @return The interpolated color
     */
    public static int interpolate(int a, int b, int t) {
        return interpolate(a, b, t / 255F);
    }

    /**
     * Removes translucency from this color by converting it to a fully transparent color when its alpha is less than
     * the given threshold, and to a fully opaque color otherwise.
     *
     * @param color     The color to remove translucency from
     * @param threshold The alpha threshold (0-1)
     * @return An opaque or fully transparent color
     */
    public static int noTranslucency(int color, float threshold) {
        return withAlpha(color, alphaf(color) < threshold ? 0F : 1F);
    }

    /**
     * Removes translucency from this color by converting it to a fully transparent color when its alpha is less than
     * the given threshold, and to a fully opaque color otherwise.
     *
     * @param color     The color to remove translucency from
     * @param threshold The alpha threshold (0-255)
     * @return An opaque or fully transparent color
     */
    public static int noTranslucency(int color, int threshold) {
        return withAlpha(color, alphai(color) < threshold ? 0 : 255);
    }

    /**
     * Removes translucency from this color by converting it to a fully transparent color when its alpha is less than
     * the given threshold, and to a fully opaque color otherwise.
     *
     * @param color     The color to remove translucency from
     * @param threshold The alpha threshold (0-1)
     * @return An opaque or fully transparent color
     */
    public static int noTranslucency(int color, double threshold) {
        return withAlpha(color, alphad(color) < threshold ? 0D : 1D);
    }

    /**
     * Returns the HSV value component of a color as a number between 0 and 1
     *
     * @param color The RGB(A) color
     * @return The HSV value
     */
    public static float valuef(int color) {
        float r = redf(color);
        float g = greenf(color);
        float b = bluef(color);
        return Math.max(r, Math.max(g, b));
    }

    /**
     * Returns the HSV value component of a color as a number between 0 and 1
     *
     * @param color The RGB(A) color
     * @return The HSV value
     */
    public static double valued(int color) {
        double r = redd(color);
        double g = greend(color);
        double b = blued(color);
        return Math.max(r, Math.max(g, b));
    }

    /**
     * Returns the HSL lightness component of a color as a number between 0 and 1
     *
     * @param color The RGB(A) color
     * @return The HSL lightness
     */
    public static float lightnessf(int color) {
        float r = redf(color);
        float g = greenf(color);
        float b = bluef(color);
        float cmax = Math.max(r, Math.max(g, b));
        float cmin = Math.min(r, Math.min(g, b));
        return (cmax + cmin) / 2;
    }

    /**
     * Returns the HSL lightness component of a color as a number between 0 and 1
     *
     * @param color The RGB(A) color
     * @return The HSL lightness
     */
    public static double lightnessd(int color) {
        double r = redd(color);
        double g = greend(color);
        double b = blued(color);
        double cmax = Math.max(r, Math.max(g, b));
        double cmin = Math.min(r, Math.min(g, b));
        return (cmax + cmin) / 2;
    }

    /**
     * Returns the HSV/HSL saturation component of a color as a number between 0 and 1
     *
     * @param color The RGB(A) color
     * @return The HSV/HSL saturation
     */
    public static float saturationf(int color) {
        float r = redf(color);
        float g = greenf(color);
        float b = bluef(color);
        float cmax = Math.max(r, Math.max(g, b));
        float cmin = Math.min(r, Math.min(g, b));
        float delta = cmax - cmin;
        return cmax == 0 ? 0 : delta / cmax;
    }

    /**
     * Returns the HSV/HSL saturation component of a color as a number between 0 and 1
     *
     * @param color The RGB(A) color
     * @return The HSV/HSL saturation
     */
    public static double saturationd(int color) {
        double r = redd(color);
        double g = greend(color);
        double b = blued(color);
        double cmax = Math.max(r, Math.max(g, b));
        double cmin = Math.min(r, Math.min(g, b));
        double delta = cmax - cmin;
        return cmax == 0 ? 0 : delta / cmax;
    }

    /**
     * Returns the HSV/HSL hue component of a color as a number between 0 and 360
     *
     * @param color The RGB(A) color
     * @return The HSV/HSL hue
     */
    public static float huef(int color) {
        float r = redf(color);
        float g = greenf(color);
        float b = bluef(color);

        float cmax = MathUtil.max(r, MathUtil.max(g, b));
        float cmin = MathUtil.min(r, MathUtil.min(g, b));

        float delta = cmax - cmin;
        float hue = 0F;

        if (delta == 0) return hue;

        if (cmax == r) {
            hue = (g - b) / delta % 6 * 60;
        } else if (cmax == g) {
            hue = ((b - r) / delta + 2) * 60;
        } else {
            hue = ((r - g) / delta + 4) * 60;
        }

        return hue < 0 ? hue + 360 : hue;
    }

    /**
     * Returns the HSV/HSL hue component of a color as a number between 0 and 360
     *
     * @param color The RGB(A) color
     * @return The HSV/HSL hue
     */
    public static double hued(int color) {
        double r = redd(color);
        double g = greend(color);
        double b = blued(color);

        double cmax = Math.max(r, Math.max(g, b));
        double cmin = Math.min(r, Math.min(g, b));

        double delta = cmax - cmin;
        double hue = 0D;

        if (delta == 0) return hue;

        if (cmax == r) {
            hue = (g - b) / delta % 6 * 60;
        } else if (cmax == g) {
            hue = ((b - r) / delta + 2) * 60;
        } else {
            hue = ((r - g) / delta + 4) * 60;
        }

        return hue < 0 ? hue + 360 : hue;
    }

    /**
     * Returns a color from HSL values, not considering alpha
     *
     * @param h Hue (0-360)
     * @param s Saturation (0-1)
     * @param l Value (0-1)
     * @return The new color
     */
    public static int hsl(float h, float s, float l) {
        h %= 360;

        float c = (1 - Math.abs(2 * l - 1)) * s;
        float x = c * (1 - Math.abs(h / 60 % 2 - 1));
        int hi = (int) (h / 60);

        float ra, ga, ba;
        switch (hi) {
            default:
            case 0:
                ra = c;
                ga = x;
                ba = 0;
                break;
            case 1:
                ra = x;
                ga = c;
                ba = 0;
                break;
            case 2:
                ra = 0;
                ga = c;
                ba = x;
                break;
            case 3:
                ra = 0;
                ga = x;
                ba = c;
                break;
            case 4:
                ra = x;
                ga = 0;
                ba = c;
                break;
            case 5:
                ra = c;
                ga = 0;
                ba = x;
                break;
        }

        float m = l - c / 2;

        float r = ra + m;
        float g = ga + m;
        float b = ba + m;

        return rgb(r, g, b);
    }

    /**
     * Returns a color from HSL values, considering alpha
     *
     * @param h Hue (0-360)
     * @param s Saturation (0-1)
     * @param l Value (0-1)
     * @param a Alpha (0-1)
     * @return The new color
     */
    public static int hsla(float h, float s, float l, float a) {
        return withAlpha(hsl(h, s, l), a);
    }

    /**
     * Returns a color from HSL values, considering alpha
     *
     * @param h Hue (0-360)
     * @param s Saturation (0-1)
     * @param l Value (0-1)
     * @return The new color
     */
    public static int hsla(float h, float s, float l) {
        return opaque(hsl(h, s, l));
    }

    /**
     * Returns a color from HSL values, not considering alpha
     *
     * @param h Hue (0-360)
     * @param s Saturation (0-1)
     * @param l Value (0-1)
     * @return The new color
     */
    public static int hsl(double h, double s, double l) {
        return hsl((float) h, (float) s, (float) l);
    }

    /**
     * Returns a color from HSL values, considering alpha
     *
     * @param h Hue (0-360)
     * @param s Saturation (0-1)
     * @param l Value (0-1)
     * @param a Alpha (0-1)
     * @return The new color
     */
    public static int hsla(double h, double s, double l, double a) {
        return hsla((float) h, (float) s, (float) l, (float) a);
    }

    /**
     * Returns a color from HSL values, considering alpha
     *
     * @param h Hue (0-360)
     * @param s Saturation (0-1)
     * @param l Value (0-1)
     * @return The new color
     */
    public static int hsla(double h, double s, double l) {
        return hsla((float) h, (float) s, (float) l);
    }

    /**
     * Returns a new color from CMYK values, not considering alpha. Note that this CMYK implementation is pretty
     * primitive and may not be completely correct in several color spaces.
     *
     * @param c Cyan (0-1)
     * @param m Magenta (0-1)
     * @param y Yellow (0-1)
     * @param k Key (0-1)
     * @return The new color
     */
    public static int cmyk(float c, float m, float y, float k) {
        return rgb(
            (1 - c) * (1 - k),
            (1 - m) * (1 - k),
            (1 - y) * (1 - k)
        );
    }

    /**
     * Returns a new color from CMYK values, considering alpha. Note that this CMYK implementation is pretty primitive
     * and may not be completely correct in several color spaces.
     *
     * @param c Cyan (0-1)
     * @param m Magenta (0-1)
     * @param y Yellow (0-1)
     * @param k Key (0-1)
     * @param a Alpha (0-1)
     * @return The new color
     */
    public static int cmyka(float c, float m, float y, float k, float a) {
        return withAlpha(cmyk(c, m, y, k), a);
    }

    /**
     * Returns a new color from CMYK values, considering alpha. Note that this CMYK implementation is pretty primitive
     * and may not be completely correct in several color spaces.
     *
     * @param c Cyan (0-1)
     * @param m Magenta (0-1)
     * @param y Yellow (0-1)
     * @param k Key (0-1)
     * @return The new color
     */
    public static int cmyka(float c, float m, float y, float k) {
        return opaque(cmyk(c, m, y, k));
    }

    /**
     * Returns a new color from CMYK values, not considering alpha. Note that this CMYK implementation is pretty
     * primitive and may not be completely correct in several color spaces.
     *
     * @param c Cyan (0-1)
     * @param m Magenta (0-1)
     * @param y Yellow (0-1)
     * @param k Key (0-1)
     * @return The new color
     */
    public static int cmyk(double c, double m, double y, double k) {
        return cmyk((float) c, (float) m, (float) y, (float) k);
    }

    /**
     * Returns a new color from CMYK values, considering alpha. Note that this CMYK implementation is pretty primitive
     * and may not be completely correct in several color spaces.
     *
     * @param c Cyan (0-1)
     * @param m Magenta (0-1)
     * @param y Yellow (0-1)
     * @param k Key (0-1)
     * @param a Alpha (0-1)
     * @return The new color
     */
    public static int cmyka(double c, double m, double y, double k, double a) {
        return cmyka((float) c, (float) m, (float) y, (float) k, (float) a);
    }

    /**
     * Returns a new color from CMYK values, considering alpha. Note that this CMYK implementation is pretty primitive
     * and may not be completely correct in several color spaces.
     *
     * @param c Cyan (0-1)
     * @param m Magenta (0-1)
     * @param y Yellow (0-1)
     * @param k Key (0-1)
     * @return The new color
     */
    public static int cmyka(double c, double m, double y, double k) {
        return cmyka((float) c, (float) m, (float) y, (float) k);
    }

    /**
     * Returns the CMYK key component from the specified color as a number between 0 and 1. Note that this CMYK
     * implementation is pretty primitive and may not be completely correct in several color spaces.
     *
     * @param rgb The RGB(A) color
     * @return The CMYK key
     */
    public static float keyf(int rgb) {
        float r = redf(rgb);
        float g = greenf(rgb);
        float b = bluef(rgb);
        float max = MathUtil.max(r, MathUtil.max(g, b));
        return 1 - max;
    }

    /**
     * Returns the CMYK key component from the specified color as a number between 0 and 1. Note that this CMYK
     * implementation is pretty primitive and may not be completely correct in several color spaces.
     *
     * @param rgb The RGB(A) color
     * @return The CMYK key
     */
    public static double keyd(int rgb) {
        double r = redd(rgb);
        double g = greend(rgb);
        double b = blued(rgb);
        double max = Math.max(r, Math.max(g, b));
        return 1 - max;
    }

    /**
     * Returns the CMYK cyan component from the specified color as a number between 0 and 1. Note that this CMYK
     * implementation is pretty primitive and may not be completely correct in several color spaces.
     *
     * @param rgb The RGB(A) color
     * @return The CMYK cyan
     */
    public static float cyanf(int rgb) {
        float r = redf(rgb);
        float k = keyf(rgb);
        return (1 - r - k) / (1 - k);
    }

    /**
     * Returns the CMYK cyan component from the specified color as a number between 0 and 1. Note that this CMYK
     * implementation is pretty primitive and may not be completely correct in several color spaces.
     *
     * @param rgb The RGB(A) color
     * @return The CMYK cyan
     */
    public static double cyand(int rgb) {
        double r = redd(rgb);
        double k = keyd(rgb);
        return (1 - r - k) / (1 - k);
    }

    /**
     * Returns the CMYK magenta component from the specified color as a number between 0 and 1. Note that this CMYK
     * implementation is pretty primitive and may not be completely correct in several color spaces.
     *
     * @param rgb The RGB(A) color
     * @return The CMYK magenta
     */
    public static float magentaf(int rgb) {
        float g = greenf(rgb);
        float k = keyf(rgb);
        return (1 - g - k) / (1 - k);
    }

    /**
     * Returns the CMYK magenta component from the specified color as a number between 0 and 1. Note that this CMYK
     * implementation is pretty primitive and may not be completely correct in several color spaces.
     *
     * @param rgb The RGB(A) color
     * @return The CMYK magenta
     */
    public static double magentad(int rgb) {
        double g = greend(rgb);
        double k = keyd(rgb);
        return (1 - g - k) / (1 - k);
    }

    /**
     * Returns the CMYK yellow component from the specified color as a number between 0 and 1. Note that this CMYK
     * implementation is pretty primitive and may not be completely correct in several color spaces.
     *
     * @param rgb The RGB(A) color
     * @return The CMYK yellow
     */
    public static float yellowf(int rgb) {
        float b = bluef(rgb);
        float k = keyf(rgb);
        return (1 - b - k) / (1 - k);
    }

    /**
     * Returns the CMYK yellow component from the specified color as a number between 0 and 1. Note that this CMYK
     * implementation is pretty primitive and may not be completely correct in several color spaces.
     *
     * @param rgb The RGB(A) color
     * @return The CMYK yellow
     */
    public static double yellowd(int rgb) {
        double b = blued(rgb);
        double k = keyd(rgb);
        return (1 - b - k) / (1 - k);
    }

    private static int hexChar(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        } else if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        } else {
            throw new NumberFormatException("Not a hex char: '" + c + "'");
        }
    }

    private static int d(int s) {
        return s << 4 | s;
    }

    private static int d(int a, int b) {
        return a << 4 | b;
    }

    /**
     * Parses a hexadecimal color string, not considering alpha. Only strings of length 3 or 6 are allowed, and they may
     * only contain hexadecimal digits (0-9, A-F, case insensitive). Possible formats are:
     * <ul>
     * <li><code>RGB</code></li>
     * <li><code>RRGGBB</code></li>
     * </ul>
     *
     * @param hex The hexadecimal string
     * @return The color parsed from the string
     *
     * @throws NumberFormatException When the input string is not valid
     * @throws NullPointerException  When the input string is null
     */
    public static int hex(@NotNull String hex) {
        Validate.notNull(hex, "hex");
        if (hex.length() == 3) {
            int r = d(hexChar(hex.charAt(0)));
            int g = d(hexChar(hex.charAt(1)));
            int b = d(hexChar(hex.charAt(2)));
            return rgb(r, g, b);
        }
        if (hex.length() == 6) {
            int r = d(hexChar(hex.charAt(0)), hexChar(hex.charAt(1)));
            int g = d(hexChar(hex.charAt(2)), hexChar(hex.charAt(3)));
            int b = d(hexChar(hex.charAt(4)), hexChar(hex.charAt(5)));
            return rgb(r, g, b);
        }
        throw new NumberFormatException("Color input '" + hex + "' does not have 3 or 6 hex chars");
    }

    /**
     * Parses a hexadecimal color string, considering alpha. Only strings of length 3, 4, 6 or 8 are allowed, and they
     * may only contain hexadecimal digits (0-9, A-F, case insensitive). Possible formats are:
     * <ul>
     * <li><code>RGB</code></li>
     * <li><code>RRGGBB</code></li>
     * <li><code>ARGB</code></li>
     * <li><code>AARRGGBB</code></li>
     * </ul>
     *
     * @param hex The hexadecimal string
     * @return The color parsed from the string
     *
     * @throws NumberFormatException When the input string is not valid
     * @throws NullPointerException  When the input string is null
     */
    public static int hexa(String hex) {
        if (hex.length() == 3) {
            int r = d(hexChar(hex.charAt(0)));
            int g = d(hexChar(hex.charAt(1)));
            int b = d(hexChar(hex.charAt(2)));
            return rgba(r, g, b);
        }
        if (hex.length() == 4) {
            int r = d(hexChar(hex.charAt(1)));
            int g = d(hexChar(hex.charAt(2)));
            int b = d(hexChar(hex.charAt(3)));
            int a = d(hexChar(hex.charAt(0)));
            return rgba(r, g, b, a);
        }
        if (hex.length() == 6) {
            int r = d(hexChar(hex.charAt(0)), hexChar(hex.charAt(1)));
            int g = d(hexChar(hex.charAt(2)), hexChar(hex.charAt(3)));
            int b = d(hexChar(hex.charAt(4)), hexChar(hex.charAt(5)));
            return rgba(r, g, b);
        }
        if (hex.length() == 8) {
            int r = d(hexChar(hex.charAt(2)), hexChar(hex.charAt(3)));
            int g = d(hexChar(hex.charAt(4)), hexChar(hex.charAt(5)));
            int b = d(hexChar(hex.charAt(6)), hexChar(hex.charAt(7)));
            int a = d(hexChar(hex.charAt(0)), hexChar(hex.charAt(1)));
            return rgba(r, g, b, a);
        }
        throw new NumberFormatException("Color input '" + hex + "' does not have 3, 4, 6 or 8 hex chars");
    }

    /**
     * Converts this color to a hexadecimal string representation, encoded as {@code RRGGBB}. Alpha is not considered.
     * @param color The color to stringify
     * @return A hexadecimal string
     */
    @NotNull
    public static String toHexString(int color) {
        return String.format("%6x", color & 0xFFFFFF);
    }

    /**
     * Converts this color to a hexadecimal string representation, encoded as {@code AARRGGBB}. Alpha is considered.
     * @param color The color to stringify
     * @return A hexadecimal string
     */
    @NotNull
    public static String toHexaString(int color) {
        return String.format("%8x", (long) color & 0xFFFFFFFFL);
    }
}
