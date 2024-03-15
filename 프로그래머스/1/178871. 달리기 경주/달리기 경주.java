import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // <선수명, 등수> map 생성
        Map<String, Integer> rankMap = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            rankMap.put(players[i], i);
        }
        
        for(String player : callings){
            // 등수 호출
            int ownRank =rankMap.get(player);
            // 앞서 가던 선수 호출
            String beforePlayer = players[ownRank - 1];
            
            // players 배열 갱신
            players[ownRank - 1] = player;
            players[ownRank] = beforePlayer;
            
            // rankMap 갱신
            rankMap.put(player, ownRank - 1);
            rankMap.put(beforePlayer, ownRank);
        }
        
        return players;
    }
}