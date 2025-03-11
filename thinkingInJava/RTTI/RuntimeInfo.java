//import com.print;


interface Interface1{}

interface Interface2{}

class BaseClass{}

class A{

 static {
    System.out.println("A is created.");

	 }
	}


class B{

 static {
    System.out.println("B is created.");

         }
        }


class C extends BaseClass implements Interface1,Interface2{


 static int hidden = 7;
 C(){}
 void displayInfo(){}

 static {
    System.out.println("C is created.");

         }
        }




public class RuntimeInfo{

 public static void main(String[] args){
   A a = new A();
   B b = new B();
   Class<C> classObject = C.class;   // loading and linking is done here, but no initialisation
   
// C c = new C();
  try{
   Class cc =  Class.forName("C");
  // Class bb =  Class.forName("B");
   System.out.println(cc.getSimpleName() + cc.getName());
   System.out.println(cc.isInterface());

   for(Class c: cc.getInterfaces()){
    System.out.println(c);
	   }
  
  System.out.println(cc.getSuperclass());

  Class bb = Class.forName("B");
  System.out.println(bb.getSuperclass());


 //  Class.forName("D");
   }
   catch(ClassNotFoundException e){
    System.out.println("the requested class is not found");
	   }
	 }


	}
