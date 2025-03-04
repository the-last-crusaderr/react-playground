class Resource implements AutoCloseable {
    private String name;

    // Constructor
    public Resource(String name) {
        this.name = name;
        System.out.println(name + " resource created.");
    }

    // pubic static factory
    
    public static Resource factoryConstructor(String name){

        Resource res = new Resource(name);
        return res;

	    }



    public void use() {
        System.out.println("Using " + name + " resource.");
    }

    // Cleanup method (instead of finalize)
    @Override
    public void close() {
        System.out.println(name + " resource destroyed.");
    }

    public static void main(String[] args) {
        try (Resource res = new Resource("TestResource")) {
            res.use();
	    Resource temp =  Resource.factoryConstructor("Build with static constructor");
        } // close() is automatically called here
    }
}

