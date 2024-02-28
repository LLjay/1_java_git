package com.mini.data;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.mini.model.vo.Member;

public class MemberData {
	List<Member> list = new ArrayList<>();
	
	public boolean saveMember(Member mem) {
		this.fileToList();
		int i;
		for(i = 0; i < list.size(); i++) {
			if (list.get(i).getUserID().equals(mem.getUserID())) {
				return false;
			} else if (!(list.get(i).getUserID().equals(mem.getUserID()))) {
				break;
			}
		}
		list.add(mem);
		return this.listToFile();
	}
	
	public Member existMember(String id, String password) {
		this.fileToList();
		int i;
		Member mem = null;
		for(i = 0; i < list.size(); i++) {
			if (list.get(i).getUserID().equals(id) &&
				list.get(i).getUserPassword().equals(password)) {
				mem = list.get(i);
				break;
			} 
		}
		this.listToFile();
		
		return mem;
	}
	
	public void fileToList() {
		Object obj;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("MemberData.txt"))){
			while(true) {
				obj = ois.readObject();
				if (obj instanceof Member) {
					list.add((Member)obj);
				} else if (obj == null) {
					break;
				}
			}
		} catch (EOFException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public boolean listToFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("MemberData.txt"))){
			for (int j = 0; j < list.size(); j++) {
				oos.writeObject(list.get(j));
			}
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}


}
