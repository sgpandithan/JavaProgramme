package Array_question;

import com.beust.ah.A;

import java.util.ArrayList;


public class commentElementsInArray {
    public static void main(String[] args) {
        int[] array1 = {5,10,15,20,25,30,35,40};
        int[] array2 = {10,20,30,40,15,35,25,5};
        ArrayList<Integer> commonElements = new ArrayList<>();
        for(int num1:array1){
            for(int num2:array2){
                if(num1==num2){
                    commonElements.add(num1);
                }
            }
        }System.out.println(commonElements);
    }
}
