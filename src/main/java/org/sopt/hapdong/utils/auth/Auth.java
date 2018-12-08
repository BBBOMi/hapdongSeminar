package org.sopt.hapdong.utils.auth;

import java.lang.annotation.*;

/**
 * Created by bomi on 2018-11-17.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Auth {
}
