package _01DOM解析器._01解析;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParserDemo {
    public static void main(String[] args) {
        try {
            // 配置读取xml文件, 注意配置文件的路径要写绝对路径
            File inputFile = new File("src/_01DOM解析器/_01解析/my.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // 输出
            System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println("---------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : " + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    //输出roll No的语句
                    System.out.println("Student rool no : " + eElement.getAttribute("rollno"));
                    //输出First Name的语句
                    System.out.println("First Name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    //输出Last Name的语句
                    System.out.println("Last Name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    //输出nick Name的语句
                    System.out.println("Nick Name: " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
                    //输出marks的语句
                    System.out.println("Marks: " + eElement.getElementsByTagName("marks").item(0).getTextContent());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
