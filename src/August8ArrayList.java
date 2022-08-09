import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * create an arraylist containing data (HP,Dell,Lenovo,Compaq,Apple)
 * return longest string
 **/
public class August8ArrayList {
    public static Set<String> maxStringLength(ArrayList<String> laptops){
        Set<String> ans = new HashSet<>();
        int maxLenString = 0;
        for (String laps: laptops) {
           maxLenString = Math.max(maxLenString,laps.length());
        }
        for (String laps: laptops) {
            if(laps.length() == maxLenString){
                ans.add(laps);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> Laptops = new ArrayList<>();
        Laptops.add("HP");
        Laptops.add("Dell");
        Laptops.add("Lenovo");
        Laptops.add("Compaq");
        Laptops.add("Apple");
        Set<String> ans = maxStringLength(Laptops);
        System.out.println(ans);
    }
}
