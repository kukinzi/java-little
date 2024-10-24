
public class palindrome {
    public static void main(String[] args) {
        //Palindrome
        System.out.println("回文串作业 王亦凡");
        String a = "abc";
        int start = 0;
        int end = a.length() - 1;
        boolean is = false;
        while(start<=end){
            Character i=a.charAt(start);
            Character j=a.charAt(end);
            if(i == j){
                is = true;
                start++;
                end--;
            }else{
                is=false;
                break;
            }
        }
        if (is) {
            System.out.println("Yes, it is Palimdrome");
        } else{
            System.out.println("NO");
        }
        // Anagram
        System.out.println("变位词作业 王亦凡");
        String A = "adc";
        String B = "bac";
        boolean same=false;
        Character k='a';
        Character l='a';
        if(A.length() != B.length()){
            same=false;
            System.out.println("NO!");
            System.exit(0);
        }
        for(int c = 0;c < A.length() ;c++){
            for(int d = 0;d <= B.length() -1;d++){
                k=A.charAt(c);
                l=B.charAt(d);
                if(k==l){
                    same = true;
                    break;
                }
            }
            if(k!=l){
                same = false;
                break;
            }
        }
        if (same) {
            System.out.println("Yes");
        } else{
            System.out.println("No!");
        }
    }
}