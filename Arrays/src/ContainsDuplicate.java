import java.util.HashMap;
import java.util.Map;
public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] num = {1,2,3,1};
        int k=3;
        System.out.println(containsDuplicate(num,k));

    }
    public static boolean containsDuplicate(int[] num , int k){
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<num.length;i++){
            if(!hm.containsKey(num[i])){
                hm.put(num[i],i);
            }
            else{
                int PastIndex=hm.get(num[i]);
                if(Math.abs(PastIndex-i)<=k){
                    return true;
                }
                else{
                    hm.put(num[i],i);
                }

            }

        }
        return false;
    }
}
