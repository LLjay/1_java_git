package com.kh.Test240201;

public class FileController {
	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) {
//		String s = sb.toString();
//		fd.fileSave(file, s);
		
		fd.fileSave(file, sb.toString());
	}
	
	public StringBuilder fileOpen(String file) {
//		return fd.fileOpen(file);
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		String st = sb.toString(); // toString은 애초에 모든 정보를 스트링으로 반환하는 메소드, 객체를 스트링으로 바꾸려니까 정보의 나열이 된 것임
		fd.fileEdit(file, st);
	}

}
