package Practice;

import java.util.Scanner;

public class SwitchCaseExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Player Number");
        int number = input.nextInt();


        switch(number){
            case 1: System.out.println("Goalkeeper");
            break;
            case 2: System.out.println("Defender 1");
            break;
            case 3: System.out.println("Defender 2");
                break;
            case 4: System.out.println("Defender 3");
                break;
            case 5: System.out.println("Defender 4");
                break;
            case 6: System.out.println("Striker 1");
                break;
            case 7: System.out.println("Striker 2");
                break;
            case 8: System.out.println("Striker 3");
                break;
            case 9: System.out.println("Attacker 1");
                break;
            case 10: System.out.println("Attacker 2");
                break;
            case 11: System.out.println("Attacker 3");
                break;
            default:
             System.out.println("Fellow Onlooker, whatsup man, we gather no sabi ball");


        }

      ;
        int student = 1;
        int sum = 0;

        while(student <= 10){

            System.out.println("Enter grade");
            int grade = input.nextInt();
          //  if (grade < 0 || grade > 100) System.exit(1);
            if (grade < 0 || grade > 100) terminateAbruptly();
            sum  += grade;
            student += 1;

        }
        int average = sum/10;
        System.out.println(average);
    }
    private static void terminateAbruptly(){
        System.out.println("you entered a wrong grade");
        System.exit(1);
    }

    public static class comparingUserInputInString {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int [][] number = new int [7][4];
            for (int i = 0; i < number.length; i++){
                if (i == 0 || i == 3 || i == 6){
                for (int j = 0; j < number[i].length; j++){
                    number[i][j] =  i + 1;}}
                if (i == 1 || i == 2 || i == 4 || i == 5){
                    for (int j = 0; j < number[i].length; j++){
                        number[i][0] =  i + 1;
                        number[i][3] = i + 1;}}
                System.out.println();
            }

            for (int []rows: number) {
              //  System.out.println(Arrays.toString(rows));

            }

            //System.out.println("Enter Binary number");
            String binary = scanner.nextLine();

            int[] userInput = new int[8];

            int index;
            for (index = 0; index < userInput.length; index++) {
                userInput[index] = Integer.parseInt(String.valueOf(binary.charAt(index)));

                if (Integer.parseInt(String.valueOf(binary.charAt(index))) > 0 || Integer.parseInt(String.valueOf(binary.charAt(index))) < 1){

                }

            }
            if (userInput[7] == 1){
            if (userInput[0] == 1){
                System.out.print(number[0][0] +" " );
                System.out.print(number[0][1]+" " );
                System.out.print(number[0][2]+" " );
                System.out.println(number[0][3]);
            }
            if (userInput[1] == 1 && userInput[2] == 1){
                System.out.println(number[1][0] + "     " +number[1][3]);
                System.out.println(number[2][0] + "     " +number[2][3]);
                System.out.println(number[3][0]+ "     "+number[3][3] );
            }
           else if (userInput[1] == 1){
                System.out.println(number[1][0]);
                System.out.println(number[2][0]);
                System.out.println(number[3][0]);
            }
            else if (userInput[2] == 1){
                System.out.println("      " +number[1][3]);
                System.out.println("      " +number[2][3]);
                System.out.println("      "+number[3][3]);
            }
            if (userInput[3] == 1){
                System.out.print(number[3][0] +" " );
                System.out.print(number[3][1]+" " );
                System.out.print(number[3][2]+" " );
                System.out.println(number[3][3]);
            }
            if (userInput[4] == 1 && userInput[5] == 1){
                System.out.println(number[4][0] + "     " +number[4][3]);
                System.out.println(number[5][0] + "     " +number[5][3]);
                System.out.println(number[6][0]+ "     "+number[6][3] );
            }
            else if (userInput[4] == 1){
                System.out.println(number[4][0]);
                System.out.println(number[5][0]);
                System.out.println(number[6][0]);
            }
            else if (userInput[5] == 1){
                System.out.println("      " +number[4][3]);
                System.out.println("      " +number[5][3]);
                System.out.println("      "+number[6][3]);
            }
            if (userInput[6] == 1){
                System.out.print(number[6][0] +" " );
                System.out.print(number[6][1]+" " );
                System.out.print(number[6][2]+" " );
                System.out.println(number[6][3]);
            }
            else { System.out.println("THE SYSTEM IS OFF, TRY AND ON IT...");}
            }


            else{
                System.out.println("Invalid number");
            }

        }
    }
}
