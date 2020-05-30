import java.util.Scanner;
public class CGPA_AV_CAL
{
    public static void main(final String args[]) {

        final double marks[] = new double[10];
        int i;
        float total = 0, avg;
        final Scanner scanner = new Scanner(System.in);
        System.out.print("=============================================================\n");
        for(i=0; i<10; i++) { 
           System.out.print("Enter YOUR CGPA of Semister "+(i+1)+": ");
           marks[i] = scanner.nextDouble();
           total = (float) (total + marks[i]);
        }
        scanner.close();
        //Calculating average here
        avg = total/+i;
        String avgl = String.format("%.2f", avg);
        System.out.print("=============================================================\nYour final CGPA is: "+avgl+" & Grade is: ");
        if(avg>=4)
        {
            System.out.print("A+");
        }
        else if(avg>=3.75 && avg<4)
        {
           System.out.print("A");
        } 
        else if(avg>=3.50 && avg<3.75)
        {
            System.out.print("A-");
        }
        else if(avg>=3.25 && avg<3.50)
        {
            System.out.print("B+");
        }
        else if(avg>=3.00 && avg<3.25)
        {
            System.out.print("B");
        }
        else if(avg>=2.75 && avg<3.00)
        {
            System.out.print("B-");
        }
        else if(avg>=2.50 && avg<2.75)
        {
            System.out.print("C+");
        }
        else if(avg>=2.25 && avg<2.50)
        {
            System.out.print("C");
        }
        else if(avg>=2.00 && avg<2.25)
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("F");
        }
    }
}