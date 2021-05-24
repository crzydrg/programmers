  public class NoGoal {
    public static void main(String[] args) {
    String[] parti = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] compl = {"josipa", "filipa", "marina", "nikola"};
    String answer = "";
    for (int i = parti.length-1; i >= 0; i--){
      for (int j = 0; j < compl.length; j++) {
        if (parti[i].equals(compl[j])) {
          compl[j] = null;
          break;
        } else if (!(parti[i].equals(compl[j])) && j == compl.length -1) {
          answer = parti[i];
        }
      }
    }
    System.out.println(answer);
  }
}
