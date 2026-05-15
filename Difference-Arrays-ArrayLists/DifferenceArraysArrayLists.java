import java.util.ArrayList;

public class DifferenceArraysArrayLists 
{

    public static void main(String[] args) 
    {

        int[] numbersArray = new int[3]; //sets array to a size of 3

        numbersArray[0] = 1; //fills the array with numbers 1-3
        numbersArray[1] = 2;
        numbersArray[2] = 3;

        System.out.println("Array Numbers:"); //displays the arrary printed one at a time starting with the 0th spot until the size of the array met

        for (int i = 0; i < numbersArray.length; i++) 
        {
            System.out.println(numbersArray[i]);
        }

        ArrayList<Integer> numbersList = new ArrayList<>(); //sets the array list which can be changed after

        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);

        System.out.println("ArrayList Numbers:"); //prints out the array list numbers same as above

        for (int i = 0; i < numbersList.size(); i++) 
        {
            System.out.println(numbersList.get(i));
        }

        numbersList.remove(1); //remove index 1 which is '2' since array indexes start at 0

        System.out.println("ArrayList After Removing Index 1:"); //prints out new arrarylist numbers same as above but with the removal showing size can change

        for (int number : numbersList) 
        {
            System.out.println(number);
        }
    }
}
