import java.util.*;




public class PrintingContainers{


   static Collection fill(Collection<String> c){
      c.add("peru");
      c.add("columbia");
      c.add("brazil");
      c.add("argentina");
      return c;
	   }


   static Map fill(Map<String,String> m){
     m.put("india","asia");
     m.put("morocco","africa");
     m.put("denamrk","europe");
     m.put("australia","australia");
     m.put("mexico","north america");
     m.put("eucador","south america");
     return m;
	   }

  public static void main(String[] args){
     
     // collection
    System.out.println(fill(new ArrayList<String>()));
    System.out.println(fill(new LinkedList<String>()));
    System.out.println(fill(new HashSet<String>()));
    System.out.println(fill(new TreeSet<String>()));
    System.out.println(fill(new PriorityQueue<String>()));


     // map
   System.out.println(fill(new TreeMap<String,String>()));
   System.out.println(fill(new HashMap<String,String>()));
   System.out.println(fill(new LinkedHashMap<String,String>()));



	  }



	}



