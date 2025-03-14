interface Product{

  void displayInfo();

        }


class ProductA implements Product{

    public void displayInfo(){
      System.out.println("Product A is created");

            }


        }


class ProductB implements Product{

      public void displayInfo(){
        System.out.println("Product B is created");
 
              }   
 
 
         }   


class ProductC implements Product{
 
      public void displayInfo(){
        System.out.println("Product C is created");
 
              }   
 
 
          }   





public class Strategy{

 //Product specificProd = new Product();

 Product createProduct(String name){

          switch(name){

             case "ProductA":
               return new ProductA();
             case "ProductB":
              return new ProductB();
             case "ProductC":
              return new ProductC();
             default:
              throw new IllegalArgumentException("this product is not valid");
                  }
         }

 public void strategyContext(Product p){
     p.displayInfo();
	 }


  public static void main(String[] args){

        Strategy factory = new Strategy();
        Product[] products = new Product[3];
        products[0] = factory.createProduct("ProductA");
        products[1] = factory.createProduct("ProductB");
        products[2] = factory.createProduct("ProductC");

       for(Product p : products){
        // p.displayInfo();
         factory.strategyContext(p);
               }
     }

}





