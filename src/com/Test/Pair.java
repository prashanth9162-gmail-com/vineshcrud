package com.Test;

public class Pair {
	
	int a,b;
	public Pair() {
		this.a=a;
		this.b=b;
	}

	@Override
	public boolean equals(Object o) {
		return (this==o)||(o instanceof Pair) && equalsImpl((Pair) o);
	}

	private boolean equalsImpl(Pair o) {
		//return false;
		//return a==o.a || b==o.b;
		//return a==o.a && b==o.b;
		return a>=o.a;
	}
}
