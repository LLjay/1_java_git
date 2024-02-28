package com.mini.controller;

import java.util.List;

import com.mini.data.DeviceData;
import com.mini.data.MemberData;
import com.mini.model.vo.Device;
import com.mini.model.vo.Member;

public class LightingController {
	
	MemberData mData = new MemberData();
	DeviceData dData = new DeviceData();
	
	public Member logIn(String id, String password) {
		return mData.existMember(id, password);
	}
	
	public boolean signUp(Member mem) {
		return mData.saveMember(mem);
	}
	
	public List<Device> checkDeviceList() {
		
	}

}
