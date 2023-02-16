import java.util.*;
class Conversation {

  /**
   * This method starts by asking the amount of rounds of conversation. Then it enters a for loop where it will run the number
   * of times given the rounds then it will split up the words in the user input then check if each of those words has a mirror word.
   * If it does it replaces it and appends the new response to the chatbox and to transcript. If it doesnt it replies with a regular response.
   * Then after the chatbox is terminated it prints out the transcript
   * @param arguments nothing
   * @ return nothing
   */
  public static void main(String[] arguments) {
    // You will start the conversation here.
    System.out.print("How many rounds? ");
    int rounds;
    Scanner userInput = new Scanner(System.in);
    List <String> transcript = new ArrayList<>();
    transcript.add("Hi there! What's on your mind?");
    rounds = userInput.nextInt();
    System.out.println("Hi there! What's on your mind?");
    for (int i = 0; i < rounds;  i++) {
      Scanner response = new Scanner(System.in);
      String userResponse = response.nextLine();
      String[] mirrorWords = {"I", "me", "Me","Am", "am", "You", "you", "my", "My", "your", "Your"};
      String [] splitPhrase = userResponse.split(" ");

      for (String word: splitPhrase) {
        int index = Arrays.asList(splitPhrase).indexOf(word);
        if (word.equals(mirrorWords[0])) {
          splitPhrase[index] = "you";
        }
        if (word.equals(mirrorWords[1]) || word.equals(mirrorWords[2])) {
          splitPhrase[index] = "you";
        }
        if (word.equals(mirrorWords[3]) || word.equals(mirrorWords[4])) {
          splitPhrase[index] = "are";
        }
        if (word.equals(mirrorWords[5]) || word.equals(mirrorWords[6])) {
          splitPhrase[index] = "I";
        }
        if (word.equals(mirrorWords[7]) || word.equals(mirrorWords[8])) {
          splitPhrase[index] = "your";
        }
        if (word.equals(mirrorWords[9]) || word.equals(mirrorWords[10])) {
          splitPhrase[index] = "my";
        }
        
      }
      
       String new_sent = String.join(" ", splitPhrase);
       if (!userResponse.equals(new_sent)) {
        transcript.add(userResponse);
        transcript.add(new_sent);
        System.out.println(new_sent);
       }
       

      if (userResponse.equals(new_sent)){     
        String[] replies = {"Intresting!", "Cool!", "Nice!", "Ok."};
        Random num = new Random();
        int x = num.nextInt(replies.length);
        System.out.println(replies[x]);
        transcript.add(userResponse);
        transcript.add(replies[x]);
      }
             

    }
    System.out.println("Goodbye!\n");
    transcript.add("Goodbye!");
    // System.out.print(transcript);
    System.out.println("~TRANSCRIPT~");
    for (int i = 0; i < transcript.size(); i+= 1){
      System.out.println(transcript.get(i));
    }
  }

}
