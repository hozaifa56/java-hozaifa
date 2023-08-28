public class palindrome {
    public boolean ispalindrome(int x){
        int n=x;
        //n=8008
        int s=0;
        int c=n;
        int r;
        while (n>0) {
            r=n%10; //r=8 r=0 r=0 r=8
            s=(s*10)+r; //s=8 s=80 s=800 s=8008
            n=n/10; //n=800 n=80 n=8 n=0
        }
        if(s==c){
            return true;

        }
        else{
            return false;
        }

        
    }
}
