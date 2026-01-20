package Exception_Handling;



//Custom exception class
class CustomException extends Exception{
   CustomException(String msg){
       super(msg);
   }
}

class A{
    public void divide(int num1,int num2) throws ArithmeticException{
        try{
            int ans= num1/num2;
            System.out.println(ans);
        }catch(ArithmeticException e){
            throw new ArithmeticException();
        }finally {
            System.out.println("Always executes!");
        }
    }
}

public class Exception_Handling {
    public static void main(String[] args){

        int num=10;
        int a=0;
        int result;
//        System.out.println(num/a); //Divide by zero error!
//        try{
//            if(a==0){
//                throw new CustomException("Divide by zero not allowed!");
//            }
//            result=num/a;
//        }catch(CustomException e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("Always executes!");
//        }

        A obj=new A();
        obj.divide(10,0);

    }
}
