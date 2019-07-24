package five;

import java.lang.reflect.Method;

public interface MethodMather {
    boolean matches(Method m,Class<?> targetClass);
    boolean isRuntime();
    boolean matches(Method m,Class<?> targetClass,Object[] args);
}
