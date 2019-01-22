package butterknife;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

final class AnnotatedMethod<T extends Annotation> {
  private final Method method;
  private final T annotation;

  AnnotatedMethod(Method method, T annotation) {
    this.method = method;
    this.annotation = annotation;
  }

  Method getMethod() {
    return method;
  }

  T getAnnotation() {
    return annotation;
  }
}
