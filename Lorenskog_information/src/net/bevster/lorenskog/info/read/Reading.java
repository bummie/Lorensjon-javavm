package net.bevster.lorenskog.info.read;

import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Reading {

	Document doc;

	// Abekatt
	public Reading() {
		// TODO Auto-generated constructor stub

		try {
			doc = Jsoup.connect("http://www.novasoftware.se/webviewer/(S(psesyi55jtizxlz3hafnf055))/design1.aspx?schoolid=72150&code=546774").get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getTitle() {

		if (doc.title() != null) {
			return doc.title();
		} else {
			return "RESERVE";
		}

	}

	public String[][] getTable() {

		// Document dpc = Jsoup.connect("http://www.novasoftware.se/webviewer/(S(psesyi55jtizxlz3hafnf055))/MZDesign1.aspx?schoolid=72150&code=546774").get();

		Element table = doc.select("name=\"ScheduleIDDropDownList\"").first();

		// Iterator ite = table.select("g").first();

		return null;

	}

}
