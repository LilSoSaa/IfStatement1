import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name: ");
        String myName= sc.next();

        if(myName.length() %2==0) {
            System.out.printf("The name %s is even",myName);
        }else
            System.out.printf("The number of letters is odd",myName);


        }


    }

