package net.shadew.util.misc;

public class ColorUtilTest {
    public static void main(String[] args) {
        double sat = ColorUtil.saturationd(0xFFFFFF);
        double hue = ColorUtil.hued(0xFFFFFF);
        double val = ColorUtil.valued(0xFFFFFF);
        System.out.println(Integer.toHexString(ColorUtil.hsv(hue, sat, val)));
    }
}
