import java.util.HashSet;
import java.util.Iterator;
public class Basic{
   public static void main(String[] args) {
      HashSet<Integer> set=new HashSet<>();
      // Add in Set
      set.add(3);
      set.add(2);
      set.add(1);
      set.add(3);
      System.out.println(set);

      //Search in Set
      System.out.println(set.contains(3));
      Iterator <Integer> it=set.iterator();

      while (it.hasNext()) {
         System.out.print(it.next());
      }
   return;
   }
}