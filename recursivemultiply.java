public class recursivemultiply {
    public static int multiply(int num2, int num1){
        if(num2 == 0){
            return 0;
        }
        // else if (num2<0){
        //     return -1;
        // }
        else{
            return  multiply(num1, num2 - 1)+num1;
        }
        
    }
    public static void main(String[] args) {
        int num1=5;
        int num2=9;
        System.out.println("answer " + multiply(num1, num2));
    }
    
}
