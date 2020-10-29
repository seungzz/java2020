package org.java.MemberController;
import java.util.Scanner;

import org.java.MemberCommend.ActionDeleteDo;
import org.java.MemberCommend.ActionInsertDo;
import org.java.MemberCommend.ActionSelectDo;
import org.java.MemberCommend.ActionUpdateDo;
import org.java.MemberCommend.QueryCommend;

public class MemberController {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		QueryCommend delete = new ActionDeleteDo();
		QueryCommend select = new ActionSelectDo();
		QueryCommend update = new ActionUpdateDo();
		QueryCommend insert = new ActionInsertDo();
		
		System.out.println("입력하세요>");
		String inputString = in.nextLine();
		
		if("insert".equals(inputString)) {
			insert.executeQuery();
		}else if("delete".equals(inputString)) {
			delete.executeQuery();
		}else if("update".equals(inputString)) {
			update.executeQuery();
		}else if("select".equals(inputString)) {
			select.executeQuery();
		}else {
			System.out.println("다시");
		}
		}
}

