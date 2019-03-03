import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Isomo {

    private  boolean isIsomorphic(String input1, String input2) {
        char[] chars1 = input1.toCharArray();
        char[] chars2 = input2.toCharArray();
        List<Character> tempArraylist;
        Map<Character, List<Character>> checkMap = new HashMap<>();
        for (int i = 0; i < chars1.length; i++) {
            if (checkMap.keySet().contains(chars1[i])) {
                if (checkMap.get(chars1[i]).contains(chars2[i])) {
                    continue;
                } else {
                    checkMap.get(chars1[i]).add(chars2[i]);
                    return false;
                }
            } else {
                tempArraylist = new ArrayList<>();
                tempArraylist.add(chars2[i]);
                checkMap.put(chars1[i], tempArraylist);
            }
        }
        return true;
    }


    public  boolean isIsomorphicTwoDirection(String input1, String input2) {
        if( isIsomorphic(input1,input2) && isIsomorphic(input2,input1) ){
            return true;
        }
        return false;
    }



}
