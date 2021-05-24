  import java.util.*;
  public class NoGoal_hash {
    public static void main(String[] args) {
    String[] parti = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] compl = {"josipa", "filipa", "marina", "nikola"};
    String answer = solution(parti, compl);
    System.out.println(answer);
  }

  public static String solution(String[] participant, String[] completion) {
    java.util.Arrays.sort(participant);
    java.util.Arrays.sort(completion);

    int i = 0;
    for(; i < completion.length; i++) {
      if (!(participant[i].equals(completion[i]))) {
        return participant[i];
      }
    }
    return participant[i];

   }

}
