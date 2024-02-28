package com.mini.model.vo;

import java.util.Date;

public class InOutQty {
	private Production pd;
	private Device dv;
	private int outQty;
	private int inQty;
	private String outCall;
	private String inCall; // 데이터베이스의 Date 형식을 자바에서 어떻게 받아주지?
	private String memo;
	
	public InOutQty() {
		super();
	}

	public InOutQty(Production pd, Device dv, int outQty, int inQty, String outCall, String inCall, String memo) {
		super();
		this.pd = pd;
		this.dv = dv;
		this.outQty = outQty;
		this.inQty = inQty;
		this.outCall = outCall;
		this.inCall = inCall;
		this.memo = memo;
	}

	
}
