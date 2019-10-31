import java.util.Scanner;
public class Numbers
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //sets length of array
        System.out.println("How long is your number set?");
        int limit = keyboard.nextInt();
        int userArray[] = new int[limit];
        //sets values in array
        System.out.println("Please enter your numbers: ");
        for(int index = 0; index < limit; index++)
        {
            userArray[index] = keyboard.nextInt();
            System.out.print(userArray[index] + " ");
        }//end of for loop cycling through array
    }//end of main method
}//end of nuumbers class
