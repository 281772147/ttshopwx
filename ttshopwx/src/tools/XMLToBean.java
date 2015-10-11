package tools;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XMLToBean {
	
	@SuppressWarnings("rawtypes")
	public Object xmlToBean(InputStream xmlInputStream,Class clazz) throws Exception{
		Object t = clazz.newInstance();
		Map<String, String> map = new HashMap<String, String>();
		SAXReader reader = new SAXReader();
		Document document = reader.read(xmlInputStream);
		Element root = document.getRootElement();
		@SuppressWarnings("unchecked")
		List<Element> elements = root.elements();
		for (Element element : elements) {
			map.put(element.getName().toLowerCase(), element.getText());
		}
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			Object value = map.get(field.getName());
			BeanUtils.setProperty(t, field.getName(), value);
		}
		return t;
	}
	
	public Map<String, String> xmlToMap(InputStream xmlinputStream) throws DocumentException{
		Map<String, String> map = new HashMap<String, String>();
		SAXReader reader = new SAXReader();
		Document document = reader.read(xmlinputStream);
		Element root = document.getRootElement();
		@SuppressWarnings("unchecked")
		List<Element> elements = root.elements();
		for (Element element : elements) {
			map.put(element.getName().toLowerCase(), element.getText());
		}
		return map;
	}
	
}
