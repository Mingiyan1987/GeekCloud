package ru.basanov.GeekCloud.interceptor;

import ru.basanov.GeekCloud.api.annotation.Loggable;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Loggable
@Interceptor
public class LogInterceptor {

    @AroundInvoke
    public Object intercept(final InvocationContext context) throws Exception {
        System.out.println(context.getTarget().getClass().getClass().getSimpleName() + ":" + context.getMethod().getName());
        return context.proceed();
    }
}
