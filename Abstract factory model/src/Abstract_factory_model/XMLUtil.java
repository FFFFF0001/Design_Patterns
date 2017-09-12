package Abstract_factory_model;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
//通过一个工具类 XMLUtil 来读取配置文件中的字符串参数
public class XMLUtil 
{
	//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean()
	{
		try
		{
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("config.xml"));
			
			//获取包含类名的文本节点
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String cName = classNode.getNodeValue();
			
			//通过类名生成实例对象并将其返回
			Class c = Class.forName(cName);
			Object obj=c.newInstance();
			return obj;
		}
		catch( Exception e )
		{
			e.printStackTrace();
			return null;
		}
	}
}

/*
 我们可以将静态工厂方法的参数存储在 XML 或 properties 格式的配置文件中，如下 config.xml 所示：
 	<?xml version="1.0"?>
	<config>
    <className>AudiFactory</classNamee>
	</config>
 */
