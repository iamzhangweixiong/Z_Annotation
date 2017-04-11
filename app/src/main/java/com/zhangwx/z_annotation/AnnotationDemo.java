package com.zhangwx.z_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @interface 声明注解类型
 *
 * int value()：返回值表示注解存放的类型值
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AnnotationDemo {
    int value();
}
