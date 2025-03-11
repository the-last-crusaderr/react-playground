//: reusing/Detergent.java
// Inheritance syntax & properties.
//import static net.mindview.util.Print.*;
class Cleanser {
 private String s = "Cleanser";
 public void append(String a) { s += a; }
 public void dilute() { append(" dilute()"); }
 public void apply() { append(" apply()"); }
 public void scrub() { append(" scrub()"); }
 public String toString() { return s; }
 public static void main(String[] args) {
 Cleanser x = new Cleanser();
 x.dilute(); x.apply(); x.scrub();
 System.out.println(x);
 }
}


class Vanish extends Detergent{
    
    public void scrub(){
       append(" Vanish.scrub()");
       super.scrub();          // call base class version
	    }


// add methods to interface
    
    public void sterlise(){
      append(" Vanish.sterlise()");
	    }


 public static void main(String[]args){
	Vanish v = new Vanish();
        v.scrub();
	v.sterlise();
	v.dilute();
        v.apply();
	v.foam();
	System.out.println(v);
	 }
	}





public class Detergent extends Cleanser {
 // Change a method:
 public void scrub() {
 append(" Detergent.scrub()");
 super.scrub(); // Call base-class version
 }
 // Add methods to the interface:
 public void foam() { append(" foam()"); }
 // Test the new class:
 public static void main(String[] args) {
 Detergent x = new Detergent();
 x.dilute();
 x.apply();
 x.scrub();
 x.foam();
System.out. println(x);
System.out. println("Testing base class:");
 Cleanser.main(args);
 }
} /* Output:
Cleanser dilute() apply() Detergent.scrub() scrub() foam()
Testing base class:
Cleanser dilute() apply() scrub()
*///:~ 
