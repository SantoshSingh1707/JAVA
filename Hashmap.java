import java.util.HashMap;
public class Hashmap{
     public static void main(String[] args) {
     int[] arr={1,2,4,53,2};
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<arr.length;i++){
          if(!map.containsKey(arr[i])){
               map.put(arr[i], 1);
          }
          else if(map.containsKey(arr[i])){
               map.put(arr[i], map.get(arr[i])+1);
          }
     }
     System.out.println(map);
     }    
     
}