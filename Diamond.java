import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int enteredDiamondSize, remainderDiamondSize,numberOfSpaces;
    enteredDiamondSize = scan.nextInt();
    remainderDiamondSize = enteredDiamondSize % 2;
    numberOfSpaces = enteredDiamondSize/2+1;
    System.out.println(numberOfSpaces);

    if(remainderDiamondSize != 0){
      for(int topRows=0; topRows <= enteredDiamondSize/2+1; topRows++){
        for(int spaceindex = numberOfSpaces; spaceindex > 0;  spaceindex--){
          System.out.print(" ");
        }
        numberOfSpaces--;
        for(int symbolIndex=0; symbolIndex < 2*topRows-1; symbolIndex++){
          System.out.print("*");
        }
        System.out.println();
      }
      
      numberOfSpaces = 0;
      
      for(int bottomRows= enteredDiamondSize; bottomRows >= 0; bottomRows--){
        for(int spaceindex = 0; spaceindex <= numberOfSpaces;  spaceindex++){
          System.out.print(" ");
        }

        numberOfSpaces++;
        
        for(int symbolIndex=enteredDiamondSize; symbolIndex < 2*bottomRows-2; symbolIndex++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
    
  }
}
