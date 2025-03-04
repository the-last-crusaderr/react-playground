class Resource implements AutoCloseable {
    private String name;
    private static Resource instance;    // Constructor
    private static Mouse mouse;

    protected Resource(String name) {
        this.name = name;
        System.out.println(name + " resource created.");
    }

    // pubic static factory
    
    public static Resource factoryConstructor(String name){
	    if(instance == null)
	       instance = new Resource(name);	    
             return instance;
	  }


    public static Resource mouseFactory(String name){
       mouse = new Mouse(name);
       return mouse;
	    }
    

    public void use() {
        System.out.println("Using " + name + " resource.");
    }

    // Cleanup method (instead of finalize)
    @Override
    public void close() {
        System.out.println(name + " resource destroyed.");
    }


    // second sol: keeping the subclass nested and private

    private static class Mouse extends Resource{

       private Mouse(String name){
          super(name);
          System.out.println("The mouse resource has been created by "+ name);
        }
      }




    public static void main(String[] args) {
       // try (Resource res = new Resource("TestResource")) {
         //   res.use();
	    Resource temp1 =  Resource.factoryConstructor("Build with static constructor");
            Resource temp2 =  Resource.factoryConstructor("Build with static constructor");
            Resource temp3 =  Resource.mouseFactory("Coder1");
       // } // close() is automatically called here
    }
}

/* first sol - keep the class outside 
   not proper hiding as programmer knows the existence of it 
class Mouse extends Resource{

       Mouse(String name){
	  super(name);     
          System.out.println("The mouse resource has been created by "+ name);
        }   
      }   

      */
