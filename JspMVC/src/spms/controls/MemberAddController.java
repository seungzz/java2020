package spms.controls;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

import spms.dao.MemberDAO;
import spms.vo.MemberVO;

public class MemberAddController implements Controller{


	@Override
	public String excute(HashMap<String, Object> model) throws Exception {
		if(model.get("member") ==  null) {	//get���ȣ��, dispatcherServlet���� member�� key������ ������
			return "/member/MemberForm.jsp";
		}else {
			MemberDAO memberDAO = 
					(MemberDAO) model.get("memberDAO");
			MemberVO member = (MemberVO)model.get("member");
			memberDAO.insert(member);
		
		return "list.do";	//����θ� ���� ���� ��� ��θ� ������ �򰥸� �� �ִ�.
	}
}
}
