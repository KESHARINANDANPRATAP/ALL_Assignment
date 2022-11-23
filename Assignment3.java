import java.util.Scanner;
class Assignment3{ 
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Sentence-");
    String sentence = input.nextLine();
    System.out.println("Enter a Letter-");
    String letter = input.nextLine();
    
    int index = sentence.indexOf(letter);
    if(index == -1){
        System.out.println("The letter does not exist in the sentence");
    }
    else{
        System.out.println("Result:"+sentence.substring(index+1));
    }
  }
}