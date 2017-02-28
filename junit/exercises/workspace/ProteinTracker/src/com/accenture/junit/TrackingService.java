package com.accenture.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TrackingService{
	private int total;
	private int goal;
	private List<HistoryItem> history = new ArrayList<HistoryItem>();
	private int historyId = 0; 
	
	public void addProtein(int amount){
		total += amount;
		history.add(new HistoryItem(historyId++, amount, "add", total));
	}
	
	public void removeProtein(int amount){		
		total -= amount;
		if (total < 0)
			total = 0;
		history.add(new HistoryItem(historyId++, amount, "substract", total));
	}
	
	public int getTotal(){
		return total;		
	}
	
	public void setGoal(int value) throws InvalidGoalException{
		if (value < 0)
			throw new InvalidGoalException("Gaol was less than zero !");
		goal = value;
	}
	
	@Test
	public void test(){		
//		int length = "Hello".length();
//		System.out.println("Hello "+length);
		assertEquals(5, "Hello".length());
	}
	
	
	
}
