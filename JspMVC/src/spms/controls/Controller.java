package spms.controls;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public interface Controller {
	String excute(HashMap<String, Object> model) throws Exception;
	
}
