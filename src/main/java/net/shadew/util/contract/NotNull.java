package net.shadew.util.contract;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation to indicate that something can <strong>not</strong> return, be, or be set to {@code null}. This
 * annotation can be used to  set a certain contract of a field, parameter, method or local variable.
 * When this annotation is above:
 * <ul>
 * <li>a method, then that method always returns a value other than {@code null}.</li>
 * <li>a field, then that field may never have the value {@code null}.</li>
 * <li>a method parameter, then that parameter can never handle the value {@code null}.</li>
 * <li>a local variable, then that variable can never handle the value {@code null}.</li>
 * </ul>
 */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.CLASS)
public @interface NotNull {
}
