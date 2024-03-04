package com.example.demo;

public class AggregatedActivity extends Activity implements Comparable<AggregatedActivity>{

	private int aggregatedTime;

	public int getAggregatedTime() {
		return aggregatedTime;
	}
	public void setAggregatedTime(int aggregatedTime) {
		this.aggregatedTime = aggregatedTime;
	}
	
	@Override
	public int compareTo(AggregatedActivity o) {
		if(aggregatedTime==o.getAggregatedTime())
		return 0;
		else if(aggregatedTime>o.getAggregatedTime())
			return -1;
		else
			return 1;
	}
	
}
