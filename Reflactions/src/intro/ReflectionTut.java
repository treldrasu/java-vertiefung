package intro;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTut {

	public static void main(String[] args) throws Exception {

		Cat c = new Cat("Hansi", 4);
		
		c.meow();
		
		Field[] f = c.getClass().getDeclaredFields();
		
		for (Field field : f) {
			if(field.getName().equals("name")){
				field.setAccessible(true);
				field.set(c, "Mausi");
			}
		}
//		System.out.println(c.getName());
		
		Method[] declaredMethods = c.getClass().getDeclaredMethods();
		
		for (Method method : declaredMethods) {
			if(method.getName().equals("geheim")) {
				method.setAccessible(true);
				method.invoke(null);
			}
		}
	}

}
