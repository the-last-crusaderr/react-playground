import java.util.Random;



interface Generator<T>{
      T next(String type);
	}


public class UniversalGenerator implements Generator<Object> {
    private Random random = new Random();

//    @Override
    public Object next(String type) {
        switch (type.toLowerCase()) {
            case "string":
                return generateRandomString(5); // Generate a random string of length 5
            case "integer":
                return random.nextInt(100); // Generate a random integer
            case "double":
                return random.nextDouble(); // Generate a random double
            case "boolean":
                return random.nextBoolean(); // Generate a random boolean
            default:
                throw new IllegalArgumentException("Unsupported type: " + type);
        }
    }

    private String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String charPool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            sb.append(charPool.charAt(index));
        }
        return sb.toString();
    }
}

