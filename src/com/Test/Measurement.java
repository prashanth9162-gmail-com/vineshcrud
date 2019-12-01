package com.Test;

public class Measurement {
	
	int count;
	int accumulated;
	
	public Measurement() {
	}
	
	public void record(int v) {
		count++;
		accumulated +=v;
	}
	public int average() {
		return accumulated/count;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (!(obj instanceof Measurement)) 
			return false;
		Measurement	 o = (Measurement) obj;
		if(count !=0 && o.count !=0)
			return average() == o.average();
		return count == o.count;
	}
	@Override
	public int hashCode() {
		// return accumulated/count;
		//return 31337;
		// return ~accumulated;
		return (count << 16) ^ accumulated;
	}

}
