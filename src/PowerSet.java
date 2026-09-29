import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    private static void subsetString(String s, String cur, List<String> ans, int i) {
        if(i == s.length()){
            if(cur.length()>0)
                ans.add(cur);
            return;

        }
        subsetString(s, cur + s.charAt(i), ans, i+1);
        subsetString(s, cur, ans, i+1);
    }
    public static void main(String[] args) {
        String s = "abc";
        List<String> ans = new ArrayList<>();
        subsetString(s, "", ans, 0);

        System.out.println(ans);
    }
}
