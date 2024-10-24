public class test7 {
    public static void main(String[] args) {
        int index = 10;
        for(int i=1; i<=index; i++){
            int num = i % 2;
            
            for(int j=1; j<=index; j++){
                int num2 = j %2 ;

                if(i==1 || j==1 || i==index ||  j==index){
                    System.out.print("*");
                } else if(num == 1 && i <= (index+1)/2 && i<=j &&  j <= index - i + 1){ // j <= index - i + 1
                    System.out.print("*");
                } else if(num == 1 && i > (index+1)/2 && i>=j && index-j-i<0){
                    System.out.print("*");
                } else if(num2 == 1 && j <= (index+1)/2 && j<=i && i <= index - j + 1){ 
                    System.out.print("*");
                } else if(num2 == 1 && j > (index+1)/2 && j>=i && index-i-j<0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}