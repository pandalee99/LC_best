import java.util.ArrayList;
import java.util.List;

public class t22 {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs("",0,0,n);
        return res;
    }

    public void dfs(String s,int left,int right,int n){
        if(left>n||right>n||right>left)return ;
        if(left==right&&left==n){
            res.add(s);
            return;
        }
        dfs(s+"(",left+1,right,n);
        dfs(s+")",left,right+1,n);
    }
}
