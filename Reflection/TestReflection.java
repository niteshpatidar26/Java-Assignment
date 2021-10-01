package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		int i=1;
		Class<?> classData = Class.forName("Reflection.Person");
		Constructor<?>[] constructors = classData.getConstructors();
		
		System.out.println("\n******Constructors ******\n");
		for (Constructor<?> constructor : constructors) {
			System.out.println("Contructor "+i+" : "+constructor);
			i++;
		}
		
		System.out.println("\n*****Getter and Setter Methods ******\n");
		Method[] methods = classData.getMethods();
		i=1;
		for (Method method : methods) {
			if(method.getName().startsWith("get") || method.getName().startsWith("set")) {
				System.out.println("Method "+i+" : "+method);					
				i++;
			}
		}
		
		System.out.println("***************************************************\n");
		Class<?>[] interfaces = classData.getInterfaces();
		for (Class<?> class1 : interfaces) {
			if(class1.getName().equals("java.io.Serializable")) {
				System.out.println("Class is Implementing Serializable interface\n");
			}
		}
		System.out.println("***************************************************\n");
		
		System.out.println("------Creating Object dynamically------\n");
		Object newInstance = classData.newInstance();
		System.out.println("Object Created as : "+newInstance);
	}

	

}