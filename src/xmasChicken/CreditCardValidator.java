package xmasChicken;


import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Card details");
        String cardDetails = input.nextLine();
        String[] cardDetailsArray = new String[cardDetails.length()];
        for (int index = 0; index < cardDetailsArray.length; index++) {
            cardDetailsArray[index] = String.valueOf(cardDetails.charAt(index));

        }
        System.out.println("***************************************");
        if (cardDetailsArray.length < 13 || cardDetailsArray.length > 16) {
            System.out.println("Card number is incorrect, please try again");

        } else {

            if (Objects.equals(cardDetailsArray[0], "4")) {
                System.out.println("**Credit Card Type: Visa Card");
            } else if (Objects.equals(cardDetailsArray[0], "5")) {
                System.out.println("**Credit Card Type: MasterCard");

            } else if (Objects.equals(cardDetailsArray[0], "3") && Objects.equals(cardDetailsArray[1], "7")) {
                System.out.println("**Credit Card Type: American Express Cards");

            } else if (Objects.equals(cardDetailsArray[0], "6")) {
                System.out.println("**Credit Card Type: Discover Cards");

            }else {  System.out.println("**Credit Card Type: Invalid Card");}
        }
        int counter = 1;
        int[] secondDigitOfTheCard = new int[counter];
        for (int i = cardDetailsArray.length - 2; i >= 0; i -= 2) {
            secondDigitOfTheCard = new int[counter];
            counter++;
        }
        int count = 0;
        for (int j = cardDetailsArray.length - 2; j >= 0; j -= 2) {
            if ((Integer.parseInt(cardDetailsArray[j] ) * 2) > 9){
                int sum = Integer.parseInt(cardDetailsArray[j] ) * 2;
                int num1 = sum % 10 ;
                int num2 = sum /10 ;
                int newSum = num1 + num2;

                secondDigitOfTheCard[count] = newSum;
                count ++;
            }
            else{

            secondDigitOfTheCard[count] = Integer.parseInt(cardDetailsArray[j] ) * 2;
            count++;
        }}

        System.out.printf("**Credit Card Number: %s%n**Credit Card Digit Length:%s%n",
                cardDetails, cardDetailsArray.length);
        int sum1 = 0 ;

        for (int number = 0; number < secondDigitOfTheCard.length; number++) {

                    sum1 += secondDigitOfTheCard[number];}

        int sum2 = 0;
        for (int number = cardDetailsArray.length -1 ; number >= 0 ; number-=2) {
            sum2 += Integer.parseInt(cardDetailsArray[number]);

        }

        if((sum1 + sum2)% 10 == 0){
            System.out.println("**Credit Card Validity Status: Valid");
        }
        else{
            System.out.println("**Credit Card Validity Status: Invalid");
        }
        System.out.println("***************************************");



    }



}









