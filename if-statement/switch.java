public class Main {
    public static void main(String[] args) {
      // switch

       char grade = 'A' ;

     /*  if (grade == 'A'){
           System.out.println("Excellent");
       } else if(grade == 'B' || grade == 'C'){
           System.out.println("Pass");
       }else {
           System.out.println("Failed");
       } */

       switch (grade){
           case 'A':
               System.out.println("Excellent");
               break;
           case 'B':
           case 'C':
               System.out.println("Pass");
               break;
           default:
               System.out.println("Failed");


       }

    }
}
