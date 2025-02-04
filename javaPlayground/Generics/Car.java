

class Tesla<T,U,V extends String> extends Car<T,U>{
   V affordability;

   Tesla(T engine, U transmission, V affordability){
     super(engine, transmission);
     this.affordability = affordability;
	   }

   void getFeatures(){
    super.getFeatures();

	   }	   


	}





public class Car<T,U>{
  T engine;
  U transmission;

  Car(T engine, U transmission){
    this.engine = engine;
    this.transmission = transmission;
	  }

  void getFeatures(){
    System.out.println("The car is well equiped with " + engine + " and " + transmission);
	  }


public static void main(String[] args){
    
    Car<String,String> ford = new Car<>("v4","dual-clutch"); 
    ford.getFeatures();


    Tesla<String, String, String> modelS = new Tesla<>("induction-motos","automatic","premium");
    modelS.getFeatures();
	}

	}
