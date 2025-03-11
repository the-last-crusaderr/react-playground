import java.lang.reflect.*;

interface Greeting {
    void sayHello(String name);
}

class GreetingHandler implements InvocationHandler {
    private Object target;

    public GreetingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Custom behavior before invoking the actual method
        System.out.println("Before invoking: " + method.getName());
        
        // Invoke the actual method on the target object
        Object result = method.invoke(target, args);

        // Custom behavior after invoking the method
        System.out.println("After invoking: " + method.getName());
        
        return result;
    }
}

public class ProxyExample {
    public static void main(String[] args) {
        // Real object
        Greeting realGreeting = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello, " + name);
            }
        };

        // Create a proxy
        Greeting proxyGreeting = (Greeting) Proxy.newProxyInstance(
            Greeting.class.getClassLoader(), 
            new Class[] { Greeting.class }, 
            new GreetingHandler(realGreeting)
        );

        // Call method on proxy
        proxyGreeting.sayHello("Alice");
    }
}

