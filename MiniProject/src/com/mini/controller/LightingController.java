package com.mini.controller;

import java.util.List;

import com.mini.model.dao.DeviceDao;
import com.mini.model.dao.MemRollDao;
import com.mini.model.dao.MemberDao;
import com.mini.model.dao.ProductionDao;
import com.mini.model.vo.Convention;
import com.mini.model.vo.Device;
import com.mini.model.vo.Line;
import com.mini.model.vo.Member;
import com.mini.model.vo.MemberRoll;
import com.mini.model.vo.MovingLight;
import com.mini.model.vo.Production;
import com.mini.view.LightingMenu;

public class LightingController {
	MemberDao memDao = new MemberDao();
	DeviceDao dvDao = new DeviceDao();
	ProductionDao proDao = new ProductionDao();
	MemRollDao mrDao = new MemRollDao();
	
	public Member logIn(String id, String password) {
		Member mem = memDao.logIn(id, password);
		
		if(mem != null) {
			new LightingMenu().successProcess("환영합니다, " + mem.getUserGrade().trim() + " " + mem.getUserName() + "님.");
		} else if (mem == null){
			new LightingMenu().failProcess("일치하는 회원 정보가 없습니다. 다시 입력해주세요.");
		}
		
		return mem;
	}
	
	public void signUp(String id, String password, String userName) {
		Member mem = new Member(id, password, userName);
		int result = memDao.insertMember(mem);
			
		if (result > 0) {
			new LightingMenu().successProcess("회원가입에 성공했습니다.");
		} else {
			new LightingMenu().failProcess("중복된 아이디입니다. 회원가입에 실패했습니다.");
		}
	}

	public void selectDeviceList() {
		List<Device> list = dvDao.selectDeviceList();
		new LightingMenu().printDeviceList(list);
	}
	
	public void searchDevice(String dvName) {
		List<Device> list = dvDao.searchDevice(dvName);
		new LightingMenu().printDeviceList(list);
	}

	public void registMovingLight(String dvName, int totalQty, String manufacture, int power,
									double weight, String lamp) {
		Device d = new MovingLight("MovingLight", dvName, totalQty, manufacture, power, weight, lamp);
		int result = dvDao.registMovingLight(d);
		
		if (result > 0) {
			new LightingMenu().successProcess("장비 등록에 성공했습니다.");
		} else {
			new LightingMenu().failProcess("장비 등록에 실패했습니다.");
		}
	}
	
	public void registConvention(String dvName, int totalQty, String manufacture, int power, double weight) {
		Device d = new Convention("Convention", dvName, totalQty, manufacture, power, weight);
		int result = dvDao.registConvention(d);

		if (result > 0) {
			new LightingMenu().successProcess("장비 등록에 성공했습니다.");
		} else {
			new LightingMenu().failProcess("장비 등록에 실패했습니다.");
		}
	}
	
	public void registLine(String dvName, int totalQty) {
		Device d = new Line("Line", dvName, totalQty);
		int result = dvDao.registLine(d);

		if (result > 0) {
			new LightingMenu().successProcess("장비 등록에 성공했습니다.");
		} else {
			new LightingMenu().failProcess("장비 등록에 실패했습니다.");
		}
	}
	
	public void registMemRoll(String userName, String proTitle, String roll) {
		Member mem = memDao.searchMember(userName);
		Production pro = proDao.searchProduction(proTitle);
		
		MemberRoll mr = new MemberRoll(mem, pro, roll);
		int result = mrDao.registMemRoll(mr);
		
		if (result > 0) {
			new LightingMenu().successProcess("등록에 성공했습니다.");
		} else {
			new LightingMenu().failProcess("등록에 실패했습니다.");
		}
	}
	
	
	
	
	
	




}
