

public class Patterns {
    public static void main(String[] args) {
        Pattern1(5);
        System.out.println();
        Pattern2(5);
        System.out.println();
        Pattern3(5);
        System.out.println();
        Pattern4(5);
        System.out.println();
        Pattern5(7);
        System.out.println();
        Pattern6(5);
        System.out.println();
        Pattern7(5);

    }
    static void Pattern1(int n){
        /*Pattern1
         *****
         *****
         *****
         *****
         *****
          */

        for (int row = 1; row <= n; row++) {
            for(int coll = 1; coll <= n; coll++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void Pattern2(int n){
//        Patern to be printed
//        *
//        **
//        ***
//        ****
//        *****
        for(int row = 1; row <= n; row++){
            for (int coll = 1; coll <= row; coll++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }

    static void Pattern3(int n){
//    Pattern to be printed is
//        *****
//        ****
//        ***
//        **
//        *

    for(int row = 1; row <= n; row++){
        for(int coll = n-row+1; coll >= 1; coll--){
            System.out.print("* ");
        }
        System.out.println();
    }
    }

    static void Pattern4(int n){
//        Pattern to be printed is
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        for(int row = 1; row <= n; row++){
            int count = 0;
            for(int coll = 1; coll <= row; coll++){
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }

    }


    static void Pattern5(int n){
//        Pattern to  be printed
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
      for(int row = 1; row <= n*2; row++){
          if(row <= n) {
              for (int coll = 1; coll <= row; coll++) {
                  System.out.print("* ");

              }
              System.out.println();

          }
          if(row>n){
              for(int coll2 = 2*n - row; coll2 >= 1; coll2--){
                  System.out.print("* ");
              }
              System.out.println();

          }
      }


    }

    static void Pattern6(int n){
//        Pattern to be printed
//         *
//        **
//       ***
//      ****
//     *****
        for(int row = 1; row <= n; row++){
            int i = 1;
            for(int coll = 1; coll <= row; coll++){


                if(i <= n - row ) {
                    for (i = 1; i <= n - row; i++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern7(int n){
//        Pattern to be printed
//        *****
//         ****
//          ***
//           **
//            *
        for(int row = 1; row <= n; row++){
            int i = 1 ;
            for(int coll = 1; coll <= n-row+1 ; coll++){
                if(i<=row-1) {
                    for (i = 1; i <= row-1; i++){
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
            }
            System.out.println();

            }

    }

    static void Pattern8(int n){
//        Pattern to be printed
//        *
//       ***
//      *****
//     *******
//    *********

        for(int row = 1; row <= n; row++){
            int i ;
            for(int coll = 1; coll <= 2*n - 1; coll++){
                for(i = 1; i < n - row; i++){
                    System.out.print(" ");
                }
                System.out.println();


            }
        }
    }




}
