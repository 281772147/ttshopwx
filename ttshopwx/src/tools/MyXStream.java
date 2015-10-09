package tools;

import java.io.Writer;
import java.util.regex.Pattern;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

public class MyXStream {
	
	private static String prefix_cdata = "<![CDATA[";
	private static String suffix_cdata = "]]>";
	public static XStream initXStream(boolean isAddCDATA){
		if(isAddCDATA){
			XStream xStream = new XStream(new XppDriver(){
				public HierarchicalStreamWriter createWriter(Writer out){
					return new PrettyPrintWriter(out){
						protected void writeText(QuickWriter writer,String text) {
							Pattern patternInt = Pattern.compile("[0-9]*(\\.?)[0-9]*");
		                        //整型判断
		                    Pattern patternFloat = Pattern.compile("[0-9]+");
		                        //如果是整数或浮点数 就不要加[CDATA[]了
		                    if(patternInt.matcher(text).matches() || patternFloat.matcher(text).matches()){
		                    	writer.write(text);
		                    }else{
								writer.write(prefix_cdata+text+suffix_cdata);
		                    }
						}
					};
				}
			});
			return xStream;
		}else{
			return new XStream();
		}
	}
	
}
