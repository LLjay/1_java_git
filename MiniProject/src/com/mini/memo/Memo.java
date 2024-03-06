package com.mini.memo;

public class Memo {
	/*
	 * 써보고 싶은 것
	 * 
	 * 오름차순 내림차순
	 * IO
	 * 컬렉션 List, Set, Map
	 * Network - 채팅
	 * 인터페이스
	 * 예외처리
	 * 상속, 다형성
	 * 
	 * 장비는 오름차순 내림차순이 편하니까 List를 써야 함
	 * 공유할 수 있는 파일 적어서 저장하는 기능
	 * Map 이용해서 Member를 키로 하는 이용 횟수 페이지
	 * 모든 정보는 메모장을 데이터베이스로 함
	 * 
	 * 
	 * #정책
	 * - 모든 것은 검색이나 등록 시 공백이 제거되어 대문자소문자 구별이 없어야 함
	 * - 회원가입 후 로그인
	 * - 없어도 되는 정보 스킵 누르면 넘어가도록
	 * 
	 * #Lighting Device
	 * -> product, weight, totalQty
	 * 
	 * = Lighting
	 * -> manufacture, power, species
	 * 
	 * - Convention
	 * - Moving Light
	 * -> chNum
	 * 
	 * = Line
	 * -> power
	 * --------------------------------------------------------------------------------------------
	 * 0. 회원가입 및 로그인
	 * 1. 장비 조회 및 관리
	 * 2. 장비 반입/반출 관리
	 * 3. 장비 수량/전력/무게 계산
	 * 7. 회원 관리 (관리자 계정에서만)
	 * 8. 마이페이지
	 * 9. 프로그램 종료
	 * --------------------------------------------------------------------------------------------
	 * 0. 회원가입 및 로그인
	 * 0-1. 로그인, 회원가입 중 선택
	 * 0-2. 로그인
	 * 		- 아이디, 비밀번호 입력 후 회원 정보가 관리자와 회원 중 어느 것과 일치하는지 확인해 알맞은 메뉴로 넘어가기
	 * 		- 일치하지 않으면 이전으로 돌아가기
	 * 0-3. 회원가입
	 * 		- 아이디, 비밀번호, 등급(관리자, 회원 중 하나)을 정해 정보 저장 후 알맞은 메뉴로 넘어가기
	 * --------------------------------------------------------------------------------------------
	 * 1. 장비 조회 및 관리
	 * 1-1. 전체 장비 리스트 조회
	 * 		- 처음 들어가면 전체 페이지 출력
	 * 		- sort 기능, species 기준으로 선택하면 걸러서 보여줄 것
	 * 1-2. 장비 검색
	 * 		- 장비명, 제조사 중 하나를 골라 검색 (라인은 제조사 제외)
	 * 		- 키워드를 포함하는 항목을 전부 출력
	 * 1-3. 장비 등록
	 * 		- 항목을 전부 입력 후 등록, 등록된 정보 출력
	 * 1-4. 장비 삭제
	 * 		- 키워드를 포함하는 항목을 전부 출력 후 인덱스 부여해 삭제할 장비 번호 선택
	 * 1-5. 장비 총수량 수정?
	 * 1-9. 메인 메뉴로 돌아가기
	 * --------------------------------------------------------------------------------------------
	 * 2. 장비 반입/반출 관리
	 * 2-1. 장비 반입/반출 현황
	 * 		- 반입/반출 현황이 있는 장비일 경우 공연명, 총수량, 현수량, 반출 수량과 반출 일시, 반입 수량 및 예정 반입 일시 출력
	 * 2-2. 장비 반출 등록
	 * 		- 공연명 검색해 선택
	 * 		- 반출 수량, 반출 일시, 반입 수량, 예정 반입 일시 입력
	 * 		- 등록 현황 출력
	 * 2-3. 장비 반입 등록
	 * 		- 장비 반입/반출 현황 출력 후 장비명 선택
	 * 		- 반입 수량, 실제 반입 일시 입력
	 * 2-4. 장비 반입/반출 비고란 등록
	 * 		- 장비 반입/반출 시 에러사항 및 주의사항 출력, 아이디 출력 후 코멘트 출력 (아이디 : 코멘트)
	 * 2-5. 장비 반입/반출 비고란 열람
	 * --------------------------------------------------------------------------------------------
	 * 3. 장비 수량/전력/무게 계산
	 * 3-1. 장비 전력 계산
	 * 		- SUS/발코니/DECK 수량 입력
	 * 		- 조명기 검색 후 번호 입력, 조명기 수량 입력 => 반복
	 * 		- "끝" 입력 시 다음 SUS로 넘어감
	 * 		- 모두 입력 시 마이페이지에 저장하시겠습니까? 출력, Y 하면 내역 이름 저장, N 하면 이전 메뉴로
	 * 		- 전체 SUS와 발코니 계산 결과를 마이페이지에 저장
	 * 3-2. 장비 무게 계산
	 * 		- SUS/발코니/DECK 수량 입력
	 * 		- 조명기 검색 후 번호 입력, 조명기 수량 입력 => 반복
	 * 		- "끝" 입력 시 다음 SUS로 넘어감
	 * 		- 모두 입력 시 마이페이지에 저장하시겠습니까? 출력, Y 하면 내역 이름 저장, N 하면 이전 메뉴로
	 * 		- 전체 SUS와 발코니 계산 결과를 마이페이지에 저장
	 * 3-3. 수량?
	 * --------------------------------------------------------------------------------------------
	 * 4. 회원 관리
	 * 4-1. 전체 회원 정보 출력
	 * 4-2. 회원 정보 삭제
	 * --------------------------------------------------------------------------------------------
	 * 8. 마이페이지
	 * 8-0. 처음 들어갔을 때 회원 정보 (아이디, 등급 출력)
	 * 8-1. 반입/반출 등록 내역
	 * 		- 본인이 등록한 반입/반출 내역 출력
	 * 		(단 탈퇴 시에도 내역은 남아 있도록 해야 함) => 이걸 어떻게 하지? 남들도 수정할 수 있어야 함
	 * 8-2. 전력 계산 내역
	 * 		- 전력 계산 이름을 출력, 고르면 그 이름으로 된 계산 내역 출력
	 * 8-3. 무게 계산 내역
	 * 		- 전력 계산 이름을 출력, 고르면 그 이름으로 된 계산 내역 출력
	 * 8-9. 회원 탈퇴 (계정 정보, 마이페이지 삭제)
	 * --------------------------------------------------------------------------------------------
	 * 9. 프로그램 종료
	 * 
	 */
	
	
	
	
	
	
	//-------------------------------------------------------------
	
	/*
	 * 전체적으로 훑기
	 * 조명 회사를 차린다고 가정 시 사용할 프로그램
	 * 회사가 보유한 조명기에 대한 정보와 총수량, 반입반출을 진행할 공연, 프로그램에 가입한 회사원 중 공연에서 어시스턴트를 맡은 사람에 대한 정보 등록 및 조회
	 * 
	 * 시작 메뉴 - 로그인과 회원가입
	 * 관리자 등급, 회원등급으로 메뉴를 나눠 활용할 수 있는 기능을 일부 삭제
	 * 장비 조회 및 관리, 장비 반입반출, 공연과 어시스턴트에 대한 관리, 회원관리, 마이페이지
	 * 
	 * 1. 총 3개의 주요 클래스 - Device, Production, Member
	 * Device, Production 중계테이블 InOutList
	 * Production, Member 중계테이블 MemberRoll
	 * 
	 * 1) Device를 상위부모클래스로 두고 조명기 종류별 구분과 전선에 대한 클래스를 따로 둠 / 반입반출에 Device 객체 자체를 멤버변수로 두고 활용
	 * - 조회할 때 객체 별로 들어가는 컬럼이 다 다르므로 카테고리 컬럼 데이터로 구분해 다운캐스팅 해서 값을 가져옴
	 * - 멤버변수로 중계테이블을 만들기 위해서 한 선택이었으나 좀 더 괜찮은 방법이 없었을까 고민스러움 > 쿼리도 좀 더 줄일 수 있었지 않았을까?
	 * 2) 가장 잘못 생각하고 있었던 게 생성자가 있는 모든 항목은 다 값이 들어가야 한다는 것
	 * - 장비 자체에 정보를 넣어서 활용할 수 있는 방법이 없을까를 고민
	 * - 그냥 이름만 넣은 객체여도 활용 가능, 정보를 가져오는데는 중계테이블이 편리
	 * 
	 * 2. 트리거 이용, MemRoll이 삽입될 때마다 그 회원의 포인트가 1점씩 오르게 함
	 * - 공연에서 어시스턴트 등의 직책을 맡을 때마다 경험이 쌓이므로 관리자로 등급을 올리고 싶었음
	 * - 여기서 IF문에 POINT 컬럼을 가져올 수 있는 쿼리문이 무엇인지 아직 발견하지 못함
	 * 
	 * > 로그인 시 받은 유저 정보를 필드에 저장해 프로그램을 사용하는 동안 그 사람의 회원 정보를 유지하게 함
	 * 
	 */
	
	/*
	 * 장비 반출 시 현재 남아있는 수량과 총수량을 비교하도록 하는 기능 - Device에 필드 추가
	 * 장비 반입출 등록 시 현재 남아있는 수량 이상을 입력할 수 없도록 하는 기능
	 * 각 항목 별 수정 및 삭제하는 기능 추가
	 * 관리자로 업데이트 되는 기능 추가
	 * 메소드 구분
	 * 각 필드에 생성했던 객체들 전부 new 방식으로 그때 생성하도록 바꾸기
	 * 
	 */
}
