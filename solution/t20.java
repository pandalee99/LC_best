public class t20 {
    public boolean isValid(String s) {
        int n=s.length()/2;
        for(int i=0;i<n;i++){
            s=s.replace("()","").replace("[]","").replace("{}","");
        }
        return s.length()==0;
    }
}
