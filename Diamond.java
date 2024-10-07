import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int enteredDiamondSize, remainderDiamondSize;
    enteredDiamondSize = scan.nextInt();
    remainderDiamondSize= enteredDiamondSize % 2;

    if(remainderDiamondSize == 0){
      for(int index=enteredDiamondSize; index > 0; index--){
        System.out.print(" ");
      }

      for(int index=0; index < enteredDiamondSize; index++){
        System.out.print("*");
      }
    }
  }
}
