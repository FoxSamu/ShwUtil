/*
 * Copyright (c) 2020 Shadew
 * Licensed under the Apache 2.0 License
 */

package net.shadew.util.contract;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to indicate that something can return, be, or be set to {@code null}. This annotation can be used to
 * set a certain contract of a field, parameter, method or local variable.
 * When this annotation is above:
 * <ul>
 * <li>a method, then that method may return the value {@code null} in all circumstances.</li>
 * <li>a field, then that field may have the value {@code null} in all circumstances.</li>
 * <li>a method parameter, then that parameter can handle the value {@code null} in all circumstances.</li>
 * <li>a local variable, then that variable can handle the value {@code null} in all circumstances.</li>
 * </ul>
 */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.CLASS)
public @interface Nullable {
}
