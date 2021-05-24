  public class NoGoal {
    /**
    hash 없이도 가능할 것 같아서 한번 만들어 보았다.
    프로그래머스 에서 코드실행은 되나
    효율성은 0으로 나와서 쓸 수 없다.
    */
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
