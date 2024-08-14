class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> list0 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer,Boolean> winnerMap = new HashMap<>();
        for(int row = 0; row < matches.length; row++){
            for(int column = 0; column < matches[0].length; column++){
                if(column == 0){
                    list0.add(matches[row][column]);
                }
                else{
                    if(!map.containsKey(matches[row][column])){
                        map.put(matches[row][column], 1);
                        list1.add(matches[row][column]);
                    }
                    else{
                        map.put(matches[row][column], map.get(matches[row][column]) + 1);
                    }
                }
            }
        }

        List<Integer> winners = new ArrayList<>();
        List<Integer> losers = new ArrayList<>();
        for(int index = 0; index < list0.size(); index++){
            if(!map.containsKey(list0.get(index))){
                if(!winnerMap.containsKey(list0.get(index))){
                    winners.add(list0.get(index));
                    winnerMap.put(list0.get(index), true);
                }
            }
        }
        for(int index = 0; index < list1.size(); index++){
            if(map.get(list1.get(index)) == 1){
                losers.add(list1.get(index));
            }
        }

        int winnerArray[] = new int[winners.size()];
        for(int index = 0; index < winners.size(); index++){
            winnerArray[index] = winners.get(index);
        }
        int loserArray[] = new int[losers.size()];
        for(int index = 0; index < losers.size(); index++){
            loserArray[index] = losers.get(index);
        }
        Arrays.sort(winnerArray);
        Arrays.sort(loserArray);
        winners.clear();
        losers.clear();

        for(int index = 0; index < winnerArray.length; index++){
            winners.add(winnerArray[index]);
        }
        for(int index = 0; index < loserArray.length; index++){
            losers.add(loserArray[index]);
        }
        List<List<Integer>> players = new ArrayList<>();
        players.add(winners);
        players.add(losers);

        return players;
    }
}