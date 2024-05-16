import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class t93 {
    ArrayList<String> list;
    LinkedList<String> temp;
    public List<String> restoreIpAddresses(String s) {
        list=new ArrayList<>();
        temp=new LinkedList<>();
        dfs(s,0);
        return list;
    }

    public void dfs(String s,int begin){
        if(temp.size()==4&&begin!=s.length())return;//已有四位有效值，却没到尾部
        if(temp.size()==4&&begin==s.length()){
            list.add(String.join(".",temp));
            return;
        }
        for(int i=begin;i<s.length()&&i<begin+3;i++){
            String num=s.substring(begin,i+1);
            if(Integer.parseInt(num)<=255){
                if(s.charAt(begin)=='0'&&num.length()>1){
                    return;//只有单独的0，才是正确的数值。既,不能有前导零
                }
                temp.add(num);
                dfs(s,i+1);
                temp.removeLast();
            }else{
                return;
            }
        }
    }
}
