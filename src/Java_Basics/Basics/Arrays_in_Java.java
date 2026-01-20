package Java_Basics.Basics;
import java.util.Arrays;

public class Arrays_in_Java {
    public static void main(String[] args){
        //1D Array
        int[] arr={1,2,3,4,5};
        int[] arr1=new int[5];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));


        System.out.println();

        //2D Array
        int[][] arr2=new int[3][3];
        for(int[] ar:arr2){
            for(int num:ar){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        //3D Array
        int[][][] arr3=new int[2][3][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    arr3[i][j][k]=(int) (Math.random()*10);
                }
            }
        }

        //printing of 3D Array
        for(int[][] a:arr3){
            for(int[] k:a){
                System.out.print(Arrays.toString(k));
            }
            System.out.println();
        }
    }
}
