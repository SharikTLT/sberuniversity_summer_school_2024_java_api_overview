package e1.lang;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class Part4_Annotations {

    public static void main(String[] args) throws IllegalAccessException {
        MyClass obj = new MyClass("Значение", 12, true);

        Class<? extends MyClass> aClass = obj.getClass();
        for (Field field : aClass.getDeclaredFields()) {
            MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
            Class<?> type = field.getType();
            System.out.printf("Имя: %s, тип: %s, Значение: %s, Значение аннотации: %s, комментарий: %s%n",
                    field.getName(),
                    field.getType(),
                    field.get(obj),
                    myAnnotation.value(),
                    myAnnotation.comment()
                    );
        }
    }
}


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

    String comment() default "пусто";

    String value() default "не заполнено";
}

class MyClass {

    @MyAnnotation(comment = "строка")
    String a;

    @MyAnnotation("число")
    int b;

    @MyAnnotation("флаг")
    Boolean c;

    public MyClass(String a, int b, Boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}