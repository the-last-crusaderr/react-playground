import java.lang.reflect.*;

class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "John Doe";
        this.age = 30;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void privateMethod() {
        System.out.println("Private method invoked!");
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // 1. Obtain the Class object
            Class<?> personClass = Person.class;

            // 2. Print class name
            System.out.println("Class Name: " + personClass.getName());

            // 3. Print declared fields
            System.out.println("\nDeclared Fields:");
            Field[] fields = personClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("- " + field.getName() + " (type: " + field.getType() + ")");
            }

            // 4. Print declared methods
            System.out.println("\nDeclared Methods:");
            Method[] methods = personClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("- " + method.getName() + " (return type: " + method.getReturnType() + ")");
            }

            // 5. Print declared constructors
            System.out.println("\nDeclared Constructors:");
            Constructor<?>[] constructors = personClass.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println("- Constructor: " + constructor);
            }

            // 6. Create an instance using reflection
            Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
            Object personInstance = constructor.newInstance("Alice", 25);
            System.out.println("\nCreated Instance: " + personInstance);

            // 7. Access and modify private fields
            Field ageField = personClass.getDeclaredField("age");
            ageField.setAccessible(true); // Bypass private access modifier
            ageField.set(personInstance, 35);
            System.out.println("Modified Instance: " + personInstance);

            // 8. Invoke a method
            Method setNameMethod = personClass.getMethod("setName", String.class);
            setNameMethod.invoke(personInstance, "Bob");
            System.out.println("After setName Invocation: " + personInstance);

            // 9. Invoke a private method
            Method privateMethod = personClass.getDeclaredMethod("privateMethod");
            privateMethod.setAccessible(true); // Bypass private access modifier
            privateMethod.invoke(personInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

