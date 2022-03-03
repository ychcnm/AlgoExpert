import java.util.*;

public class Tournament_winner {
    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        int idx = 0;
        HashMap<String, Integer> scoreCard = new HashMap<>();
        while (idx < results.size()) {
            int winTeamIdx = 1 - results.get(idx);
            String winTeam = competitions.get(idx).get(winTeamIdx);
            if (scoreCard.containsKey(winTeam)) {
                scoreCard.put(winTeam, scoreCard.get(winTeam) + 1);
            } else {
                scoreCard.put(winTeam, 1);
            }
            idx++;
        }
        int maxScore = 0;
        String finalWinnder = "";
        for (String i : scoreCard.keySet()) {
            if (scoreCard.get(i) > maxScore) {
                maxScore = scoreCard.get(i);
                finalWinnder = i;
            }
        }
        return finalWinnder;
    }
}
