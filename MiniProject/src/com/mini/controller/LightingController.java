package com.mini.controller;

import java.sql.Date;
import java.util.List;

import com.mini.model.dao.DeviceDao;
import com.mini.model.dao.MemRollDao;
import com.mini.model.dao.MemberDao;
import com.mini.model.dao.ProductionDao;
import com.mini.model.vo.Convention;
import com.mini.model.vo.Device;
import com.mini.model.vo.InOutList;
import com.mini.model.vo.Line;
import com.mini.model.vo.Member;
import com.mini.model.vo.MemberRoll;
import com.mini.model.vo.MovingLight;
import com.mini.model.vo.Production;
import com.mini.service.DeviceService;
import com.mini.service.InOutListService;
import com.mini.service.MemRollService;
import com.mini.service.MemberService;
import com.mini.service.ProductionService;
import com.mini.view.LightingMenu;

public class LightingController {
	MemberDao memDao = new MemberDao();
	DeviceDao dvDao = new DeviceDao();
	ProductionDao proDao = new ProductionDao();
	MemRollDao mrDao = new MemRollDao();
	
	MemberService memSv = new MemberService();
	ProductionService proSv = new ProductionService();
	MemRollService mrSv = new MemRollService();
	InOutListService ioSv = new InOutListService();
	DeviceService dvSv = new DeviceService();
	
	// 0. 시작 메뉴
	/**
	 * 로그인 정보를 전달 받아 MemberDao에 데이터 조회 요청
	 * 반환 받은 정보로 뷰의 출력 메소드 사용
	 * @param id
	 * @param password
	 * @return
	 */
	public Member logIn(String id, String password) {
		Member mem = memSv.logIn(id, password);
		
		if(mem != null) {
			new LightingMenu().displaySuccess("환영합니다, " + mem.getUserGrade().trim() + " " + mem.getUserName() + "님.");
		} else if (mem == null){
			new LightingMenu().displayFail("일치하는 회원 정보가 없습니다. 다시 입력해주세요.");
		}
		
		return mem;
	}
	
	/**
	 * 회원 정보를 전달 받아 MemberDao에 데이터 등록 요청
	 * 반환 받은 정보로 뷰의 출력 메소드 사용
	 * @param id
	 * @param password
	 * @param userName
	 */
	public void signUp(String id, String password, String userName) {
		Member mem = new Member(id, password, userName);
		int result = memDao.insertMember(mem);
			
		if (result > 0) {
			new LightingMenu().displaySuccess("회원가입에 성공했습니다.");
		} else {
			new LightingMenu().displayFail("중복된 아이디입니다. 회원가입에 실패했습니다.");
		}
	}

	
	// 1. 장비 메뉴
	/**
	 * 전체 장비 리스트를 DeviceDao에 요청해 출력 메소드 사용
	 */
	public void selectDeviceList() {
		List<Device> list = dvSv.selectDeviceList();
		new LightingMenu().displayDeviceList(list);
	}
	
	/**
	 * 장비명 키워드를 전달 받아 DeviceDao에 요청해 검색 결과 list 출력
	 * @param dvName
	 */
	public List<Device> selectDeviceByName(String dvName) {
		List<Device> list = dvSv.selectDeviceByName(dvName);
		
		if (!list.isEmpty()) {
				new LightingMenu().displayDeviceList(list);
		} else {
			new LightingMenu().displayFail("검색 결과가 없습니다.");
		}
		
		return list;
	}

	/**
	 * 장비 정보를 전달 받아 DeviceDao에 데이터 등록 요청
	 * 반환 받은 정보로 뷰의 출력 메소드 사용
	 * @param dvName
	 * @param totalQty
	 * @param manufacture
	 * @param power
	 * @param weight
	 * @param lamp
	 */
	public void registMovingLight(String dvName, int totalQty, String manufacture, int power,
									double weight, String lamp) {
		Device d = new MovingLight("MovingLight", dvName, totalQty, manufacture, power, weight, lamp);
		int result = dvDao.registMovingLight(d);
		
		if (result > 0) {
			new LightingMenu().displaySuccess("장비 등록에 성공했습니다.");
		} else {
			new LightingMenu().displayFail("장비 등록에 실패했습니다.");
		}
	}
	
	public void registConvention(String dvName, int totalQty, String manufacture, int power, double weight) {
		Device d = new Convention("Convention", dvName, totalQty, manufacture, power, weight);
		int result = dvDao.registConvention(d);

		if (result > 0) {
			new LightingMenu().displaySuccess("장비 등록에 성공했습니다.");
		} else {
			new LightingMenu().displayFail("장비 등록에 실패했습니다.");
		}
	}
	
	public void registLine(String dvName, int totalQty) {
		Device d = new Line("Line", dvName, totalQty);
		int result = dvDao.registLine(d);

		if (result > 0) {
			new LightingMenu().displaySuccess("장비 등록에 성공했습니다.");
		} else {
			new LightingMenu().displayFail("장비 등록에 실패했습니다.");
		}
	}
	
	/**
	 * 장비 정보를 전달 받아 DeviceDao에 데이터 삭제 요청
	 * 반환 받은 정보로 뷰의 출력 메소드 사용
	 * @param d
	 */
	public void deleteDevice(Device d) {
		int result = dvSv.deleteDevice(d);
		
		if (result > 0) {
			new LightingMenu().displaySuccess("장비 삭제에 성공했습니다.");
		} else {
			new LightingMenu().displayFail("장비 삭제에 실패했습니다.");
		}
	}
	
	
	// 2. 장비 반입/반출 메뉴
	
	public void selectInOutList() {
		List<InOutList> list = ioSv.selectInOutList();
		
		if (list.isEmpty()) {
			new LightingMenu().displayFail("등록된 반입출 정보가 없습니다.");
		} else {
			new LightingMenu().displayInOutList(list);
		}
	}
	
	public void registInOut(Production pro, Device d, int outQty, int inQty, String outDate, String inDate, String memo) {
		Date newOutDate = Date.valueOf(outDate);
		Date newInDate = Date.valueOf(inDate);
		
		InOutList iol = new InOutList(pro, d, outQty, inQty, newOutDate, newInDate, memo);
		
		int result = ioSv.registInOut(iol);
		
		if (result > 0) {
			new LightingMenu().displaySuccess("등록에 성공했습니다.");
		} else {
			new LightingMenu().displayFail("등록에 실패했습니다.");
		}
	}
	
	
	
	// 3. 공연 정보 메뉴
	
	/**
	 * 전체 공연 정보를 모두 조회하는 메소드
	 */
	public void selectMemRollList() {
		List<MemberRoll> list = mrSv.selectMemRollList();
		
		if (!list.isEmpty()) {
			new LightingMenu().displayMemRollList(list);
		} else {
			new LightingMenu().displayFail("등록된 공연 정보가 없습니다.");
		}
	}
	
	/**
	 * 특정 키워드를 포함하는 공연명을 가진 공연 정보를 모두 조회
	 * @param keyword
	 */
	public List<Production> selectProductionByKeyword(String keyword) {
		List<Production> list = proSv.selectProductionByKeyword(keyword);
	
		if (!list.isEmpty()) {
			new LightingMenu().displayProductionList(list);
		} else {
			new LightingMenu().displayFail("키워드에 해당하는 공연이 없습니다.");
		}
		
		return list;
	}
	
	/**
	 * 공연 정보를 등록하는 메소드
	 * String으로 입력된 날짜를 Date 형식으로 바꾸어 Production 객체에 담아 전달
	 * @param category
	 * @param title
	 * @param theatre
	 * @param opening
	 * @param closing
	 */
	public void registProduction(String category, String title, String theatre, String opening, String closing) {
		Date openDate = Date.valueOf(opening);
		Date closeDate = Date.valueOf(closing);
		
		Production pro = new Production(category, title, theatre, openDate, closeDate);
		
		int result = proSv.registProduction(pro);
		
		if (result > 0) {
			new LightingMenu().displaySuccess("공연 정보 등록에 성공했습니다.");
		} else {
			new LightingMenu().displayFail("공연 정보 등록에 실패했습니다.");
		}
	}
	
	
	/**
	 * 멤버명과 공연명을 전달 받아 각각 MemberDao, ProductionDao에 해당 정보를 요청 후
	 * 전달 받은 정보와 roll 정보를 다시 MemRollDao에 데이터 등록 요청
	 * 
	 * @param userName
	 * @param proTitle
	 * @param roll
	 */
	
	
	public void registMemRoll(Member mem, Production pro, String roll) {

		MemberRoll mr = new MemberRoll(mem, pro, roll);
		int result = mrSv.registMemRoll(mr);
		
		if (result > 0) {
			new LightingMenu().displaySuccess("등록에 성공했습니다.");
		} else {
			new LightingMenu().displayFail("등록에 실패했습니다.");
		}
	}
	
	public List<Member> selectMemberByName(String userName) {
		List<Member> list = memSv.selectMemberByName(userName);
		if (!list.isEmpty()) {
			new LightingMenu().displayMemberList(list);
		} else {
			new LightingMenu().displayFail("회원 정보 불러오기에 실패했습니다.");
		}
		
		return list;
	}
	
	
	
	
	// 8. 회원 정보 관리
	public void SelectMemberList(List<Member> list) {
//		
//		if (list != null) {
//			new LightingMenu().displayMemberList(list);
//		} else {
//			new LightingMenu().displayFail("회원 정보 불러오기에 실패했습니다.");
//		}
	}
	

	
	
	
	
	// 9. 마이페이지
	
	public void selectMyMemRollList(Member user) {
		List<MemberRoll> list = mrSv.selectMyMemRollList(user);
		
		if (list != null) {
			new LightingMenu().displayMemRollList(list);
		} else {
			new LightingMenu().displayFail("해당 정보를 불러오는데 실패했습니다.");
		}
	}
	
	




}
