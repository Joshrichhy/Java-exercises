package chapterFive;

public class triangleAsterisksShape {
    public static void main(String[] args) {
        int blank = 4;

        for (int i = 1; i < 10; i+=2){
            for (int j = 0; j < blank; j++ ){
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            System.out.println();
            blank--;
        }
        blank = 1;
        for (int i = 7; i > 0; i-=2){
            for (int j = 0; j < blank; j++ ){
                System.out.print("*");
            }
            for (int j = i; j > 0; j--){
                System.out.print(" ");
            }
            System.out.println();
            blank ++;
        }

        System.out.println();
         blank = 8;

        for (int i = 0; i < 10; i+=2){
            for (int j = 0; j < i; j+=2 ){
                System.out.print(" ");
            }

            for (int j = 1; j < blank; j+=2 ){
                System.out.print("*");
            }
            System.out.println();
            blank-=2;
        }

        System.out.println();
        blank = 8;

        for (int i = 0; i < 10; i+=2){
            for (int j = 0; j < blank; j+=2 ){
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j+=2 ){
                System.out.print("*");
            }
            System.out.println();
            blank-=2;


        }
}}
