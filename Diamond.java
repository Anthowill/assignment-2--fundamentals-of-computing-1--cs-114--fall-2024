import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int enteredDiamondSize, remainderDiamondSize, numberOfSpaces,starCount;
    System.out.print("Enter odd or even number for size of diamond: ");
    enteredDiamondSize = input.nextInt();
    remainderDiamondSize = enteredDiamondSize % 2;
    starCount=1;

    if(remainderDiamondSize != 0){
      numberOfSpaces = enteredDiamondSize / 2 + 1;

      for(int topRows = 0; topRows <= enteredDiamondSize / 2 + 1; topRows++){
        for(int spaceindex = numberOfSpaces; spaceindex > 0; spaceindex--){
          System.out.print(" ");
        }

        numberOfSpaces--;

        for(int symbolIndex = 0; symbolIndex < 2 * topRows - 1; symbolIndex++){
          System.out.print("*");
        }

        System.out.println();
      }

      numberOfSpaces = 0;

      for(int bottomRows = enteredDiamondSize; bottomRows >= 0; bottomRows--){
        for(int spaceindex = 0; spaceindex <= numberOfSpaces; spaceindex++){
          System.out.print(" ");
        }

        numberOfSpaces++;

        for(int symbolIndex = enteredDiamondSize; symbolIndex < 2 * bottomRows - 2; symbolIndex++){
          System.out.print("*");
        }

        System.out.println();
      }
    }
    else{
      numberOfSpaces= enteredDiamondSize;
      starCount = 1;

      for(int topRows = 0; topRows < enteredDiamondSize/2+1; topRows++){
        for(int spaceindex = 0; spaceindex< numberOfSpaces; spaceindex++){
          System.out.print(" ");
        }

        for(int symbolIndex = 0; symbolIndex< starCount; symbolIndex++){
          System.out.print("* ");
        }

        System.out.println();

        if(starCount == 1){
          starCount +=1;
        }

        else{
          starCount+=2;
        }

        if(numberOfSpaces==enteredDiamondSize){
          numberOfSpaces--;
        }

        else{
          numberOfSpaces-=2;
        }
      }

      numberOfSpaces=1;
      starCount-=2;

      for( int bottomRows=0; bottomRows<enteredDiamondSize/2-1; bottomRows++){
        for(int spaceindex = -2; spaceindex<numberOfSpaces; spaceindex++){
          System.out.print(" ");
        }

        for(int symbolIndex=2; symbolIndex < starCount; symbolIndex++){
          System.out.print("* ");
        }

        System.out.println();
        starCount-=2;
        numberOfSpaces+=2;
      }

      for(int spaceindex=0; spaceindex<enteredDiamondSize;spaceindex++){
        System.out.print(" ");
      }

      System.out.println("*");
      input.close();
    }
  }
}
