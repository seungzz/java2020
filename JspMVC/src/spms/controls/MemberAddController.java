package spms.controls;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

import spms.dao.MemberDAO;
import spms.vo.MemberVO;

public class MemberAddController implements Controller{


	@Override
	public String excute(HashMap<String, Object> model) throws Exception {
		if(model.get("member") ==  null) {	//get방식호출, dispatcherServlet에서 member를 key값으로 선언함
			return "/member/MemberForm.jsp";
		}else {
			MemberDAO memberDAO = 
					(MemberDAO) model.get("memberDAO");
			MemberVO member = (MemberVO)model.get("member");
			memberDAO.insert(member);
		
		return "list.do";	//상대경로를 많이 쓰면 어느 경로를 탔는지 헷갈릴 수 있다.
	}
}
}
