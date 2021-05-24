import java.util.HashMap;
  public class NoGoal_hash {
    public static void main(String[] args) {
    String[] parti = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] compl = {"josipa", "filipa", "marina", "nikola"};
    String answer = solution(parti, compl);
    System.out.println(answer);
  }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }

}
