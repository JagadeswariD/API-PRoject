package com.practice;

import java.util.Comparator;
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
class Checker implements Comparator<Player>
{

	@Override
	public int compare(Player p1, Player p2) {
		if(Integer.valueOf(p2.score).compareTo(Integer.valueOf(p1.score))==0){
	        return p1.name.compareTo(p2.name);
	    }
	    else{
	        return Integer.valueOf(p2.score).compareTo(Integer.valueOf(p1.score));
	    }
	}
	
}

public class PlayerComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
