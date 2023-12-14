package intro;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Cat c = new Cat("Hansi", 4);
        c.meow();
        
        Field[] f = c.getClass().getDeclaredFields();   
        for (Field field : f) {
            System.out.println(field);
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.get(c);
                field.set(c, "Mausi");
            }
        }
        System.out.println(c);


        Method[] m = c.getClass().getDeclaredMethods();
        for (Method method : m) {
            if(method.getName().equals("geheim")){
                method.setAccessible(true);
                method.invoke(null);
            }
        }
    }
}
