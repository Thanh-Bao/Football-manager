# Football-manager
 
![Imgur](https://i.imgur.com/0ZvYu66.jpg)


# **thống kê số lần ra sân của mỗi cầu thủ :**

    public HashMap<Player, Integer> staticPlayer_PlayTime() {
    		HashMap<Player, Integer> result = new HashMap<Player, Integer>();
    		for (FootballMatch match : matchList) {
    			for (Player pl : match.getAllPlayer()) {
    				if (result.containsKey(pl)) {
    					int newTime = result.get(pl) + 1;
    					result.put(pl, newTime);
    				} else {
    					result.put(pl, 1);
    				}
    			}
    		}
    		return result;
    	}

# **Thống kê số lần ghi bàn của cầu thủ :**

	public HashMap<Player, Integer> staticPlayer_winScore() {
		HashMap<Player, Integer> result = new HashMap<Player, Integer>();
		for (FootballMatch match : matchList) {
			match.getWinMap().forEach((k, v) -> {
				if (result.containsKey(k)) {
					int newScore = result.get(k) + match.getWinMap().get(k);
					result.put(k, newScore);
				} else {
					result.put(k, match.getWinMap().get(k));
				}
			});
		}
		return result;
	}

# **Tìm số bàn thắng của một đội cho trước**

    public int winScoreTeam(Team t) {
    	int result = 0;
    	for (FootballMatch match : matchList) {
    		if (match.getTeamWin().equals(t)) {
    			result++;
    		}
    	}
    	return result;
    }

# **Danh sách  (các) cầu thủ ghi bàn nhiều nhất**

	public HashMap<Player, Integer> bestPlayer() {
		HashMap<Player, Integer> output = new HashMap<Player, Integer>();
		Player theBest = null;
		int scoreMax = 0;
		for (Player pl : staticPlayer_winScore().keySet()) {
			if (staticPlayer_winScore().get(pl) > scoreMax) {
				theBest = pl;
				scoreMax = staticPlayer_winScore().get(pl);
			}
		}
		output.put(theBest, scoreMax);
		for (Player pl : staticPlayer_winScore().keySet()) {
			if (staticPlayer_winScore().get(pl) == scoreMax) {
				output.put(pl, scoreMax);
			}
		}

		return output;

	}
