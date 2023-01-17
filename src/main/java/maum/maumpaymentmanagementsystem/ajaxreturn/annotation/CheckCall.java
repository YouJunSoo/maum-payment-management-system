package maum.maumpaymentmanagementsystem.ajaxreturn.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckCall {

    EnumAccessType accessType() default EnumAccessType.EVERYONE;
    EnumNeedLogin needLogin() default EnumNeedLogin.YES;
    EnumCallType callType() default EnumCallType.AJAX;
}
