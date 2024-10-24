public class test6 {
    public static void main(String[] args) {
        

        int index = 0; 
        int star = 100;
        int index1 = star;
        while(index < star){
            if(index == 0 || index == star - 1){
                for(var i = star;i > 0;i--){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(int a = index1;a > index + 2;a--){//
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int b = index;b > 1;b--){//
                    System.out.print(" ");
                }
                System.out.print("*");
                
                
            }
            System.out.println();
            index++;
          }
    }
}