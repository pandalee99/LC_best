public class t8 {
    public int myAtoi(String s) {
        int i=0,n=s.length(),ans=0;
        boolean flag=true;
        while(i<n&&s.charAt(i)==' ')i++;
        if(i<n&&s.charAt(i)=='+'){
            i++;
        }else if(i<n&&s.charAt(i)=='-'){
            flag=false;
            i++;
        }
        int max=Integer.MAX_VALUE,min=Integer.MIN_VALUE;
        while(i<n&&isNum(s.charAt(i))){
            int num=s.charAt(i)-'0';
            if(ans>max/10 || (ans==max/10&&num>7)){
                return flag?max:min;
            }
            ans=ans*10+num;
            i++;
        }
        return flag?ans:-ans;
    }

    public boolean isNum(char c){
        return c - '0' >= 0 && c - '9' <= 0;
    }
}
