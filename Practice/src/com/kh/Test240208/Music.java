package com.kh.Test240208;

public class Music {
	private String title;
	private String singer;
	
	public Music() {
		super();
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return singer + " - " + title;
	}

	@Override
	public int hashCode() {
		String str = title + singer;
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Music) {
			Music m = (Music)obj;
			
			if (this.getTitle().equals(m.getTitle()) &&
				this.getSinger().equals(m.getSinger())) {
				return true;
			}
		}
		return false;
	}
	
//	@Override
//	public int compareTo(Object o) {
//		if (o instanceof Music) {
//			Music m = (Music)o;
//			
//			if 
//		}
//	}
}
