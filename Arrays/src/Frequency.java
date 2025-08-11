import java.util.HashMap;
import java.util.Map;
public class Frequency {
    public static void main(String[] args) {
        int []arr={1,4,5,9,7,7,1,4,5};
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry entry :hm.entrySet()){
            System.out.println("Element | Frequency");
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
