package xml;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class ValidateXML {

	public static void main(String[] args) {
		String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
		SchemaFactory schemaFactory = SchemaFactory.newInstance(language);
		try {
			File file = new File("C:\\Users\\nitesh.patidar\\Documents\\workspace-spring-tool-suite-4-4.7.1.RELEASE\\YashTraining\\src\\xml\\Student.xsd");
			File xmlFile = new File("C:\\Users\\nitesh.patidar\\Documents\\workspace-spring-tool-suite-4-4.7.1.RELEASE\\YashTraining\\src\\xml\\Student.xml");
			if(!file.exists() && !xmlFile.exists()) {
				throw new IOException();
			}
			Schema schema = schemaFactory.newSchema(file);
			Validator validator = schema.newValidator();
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(xmlFile);
			DOMSource domSource = new DOMSource(document);
			validator.validate(domSource);
			System.out.println(" Given "+xmlFile.getName()+ " is valid xml document");
			
			SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			SAXParser saxParser = saxParserFactory.newSAXParser();
			saxParser.parse(xmlFile, new DataHandler());	
					
		} catch (SAXException | ParserConfigurationException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			System.err.println("Required files not found");
		}
	}
}