package spms.controls;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

import spms.dao.MemberDAO;

public class MemberListController implements Controller{

	@Override
	public String excute(HashMap<String, Object> model) throws Exception {
		MemberDAO memberDAO = (MemberDAO) model.get("memberDAO");
		model.put("members", memberDAO.selectList());
		return "/member/MemberList.jsp";
	}

}
