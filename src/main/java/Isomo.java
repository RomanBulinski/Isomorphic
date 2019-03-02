import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Isomo {

    public  Map<Character, List<Character> > isIsomorphic(String input1, String input2) {
        char[] chars1 = input1.toCharArray();
        char[] chars2 = input2.toCharArray();
        List<Character> temp;
        Map<Character, List<Character>> checklist = new HashMap<>();
        for (int i = 0; i < chars1.length; i++) {
            if (checklist.keySet().contains(chars1[i])) {
                if (checklist.get(chars1[i]).contains(chars2[i])) {
                    continue;
                } else {
                    checklist.get(chars1[i]).add(chars2[i]);
                }
            } else {
                temp = new ArrayList<>();
                temp.add(chars2[i]);
                checklist.put(chars1[i], temp);
            }
        }
        return checklist;
    }

    public  boolean isIsomorphicBoolean(String input1, String input2) {
        char[] chars1 = input1.toCharArray();
        char[] chars2 = input2.toCharArray();
        List<Character> temp;
        Map<Character, List<Character>> checklist = new HashMap<>();
        for (int i = 0; i < chars1.length; i++) {
            if (checklist.keySet().contains(chars1[i])) {
                if (checklist.get(chars1[i]).contains(chars2[i])) {
                    continue;
                } else {
                    checklist.get(chars1[i]).add(chars2[i]);
                    return false;
                }
            } else {
                temp = new ArrayList<>();
                temp.add(chars2[i]);
                checklist.put(chars1[i], temp);
            }
        }
        return true;
    }


    public  boolean allBoolean(String input1, String input2) {
        if( isIsomorphicBoolean(input1,input2) && isIsomorphicBoolean(input2,input1) ){
            return true;
        }
        return false;
    }



}
