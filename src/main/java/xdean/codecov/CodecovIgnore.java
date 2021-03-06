package xdean.codecov;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ ElementType.TYPE, ElementType.PACKAGE })
public @interface CodecovIgnore {
  String value() default "";// ignore reason
}
