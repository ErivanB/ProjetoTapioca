package Lógica;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Persistencia {

	private XStream xs = new XStream(new DomDriver());
	private File arquivo = new File("central.xml");
	
	public void salvarCentral(Central ci) {
		String xml = xs.toXML(ci);
			try {
				if((arquivo.exists())==false) 
					arquivo.createNewFile();
				PrintWriter gravar = new PrintWriter(arquivo);
				gravar.print(xml);
				gravar.close();
			} catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	public Central recueprarCentral() {
		try {
			if((arquivo.exists())==false) {
				FileInputStream fis = new FileInputStream(arquivo);
				return (Central) xs.fromXML(arquivo);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return new Central();
	}
}
