package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebCurdTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebCurdTest1Application.class, args);
	}
	
}

/*



package com.app;

import java.sql.Timestamp;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class PdFTest {
	public static void main(String args[]) throws Exception {
		// Creating a PdfWriter object
		String file = "C:/itextExamples/tests.pdf";
		PdfDocument pdfDoc = new PdfDocument(new PdfWriter(file));

		// Creating a Document object
		Document doc = new Document(pdfDoc);

		// Creating a table
		float[] pointColumnWidths = { 350F, 300F };// making column
		Table table = new Table(pointColumnWidths);

		// Adding row 1 to the table
		Cell c1 = new Cell();
		c1.add("Chick Fil-a Atlanta Distribution \n ORDER SUMMARY");
		c1.setTextAlignment(TextAlignment.CENTER);
		table.addCell(c1);

		List list1 = new List();
		ListItem item1 = new ListItem("Order Date " + new Timestamp(System.currentTimeMillis()));
		ListItem item2 = new ListItem("Request Date " + new Timestamp(System.currentTimeMillis()));
		ListItem item3 = new ListItem("PO Number " + "0115151");
		list1.add(item1);
		list1.add(item2);
		list1.add(item3);

		Cell c2 = new Cell();
		c2.add(list1);
		c2.setTextAlignment(TextAlignment.LEFT);// move text inserted position
		table.addCell(c2);

		// Adding row 2 to the table
		Cell c3 = new Cell();

		// Creating nested table for contact
		float[] pointColumnWidths2 = { 90, 90f, 90f, 90f };
		Table nestedTable = new Table(pointColumnWidths2);

		// Populating row 1 and adding it to the nested table
		Cell nested5 = new Cell();
		nested5.add("Bill To");
		nestedTable.addCell(nested5);

		Cell nested2 = new Cell();
		nested2.add("      ");
		nestedTable.addCell(nested2);

		// Populating row 2 and adding it to the nested table
		Cell nested3 = new Cell();
		nested3.add("");
		nestedTable.addCell(nested3);

		Cell nested4 = new Cell();
		nested4.add("");
		nestedTable.addCell(nested4);

		// Populating row 2 and adding it to the table
		float[] pointColumnWidths3 = { 90, 90f, 90f, 90f };
		Table nestedTable2 = new Table(pointColumnWidths3);

		// Adding row 2 to the table
		Cell cc4 = new Cell();
		Cell nested6 = new Cell();
		nested6.add("Distributor");
		nestedTable.addCell(nested6);

		Cell nested7 = new Cell();
		nested7.add("Pre filled");
		nestedTable.addCell(nested7);

		// Populating row 2 and adding it to the nested table
		Cell nested8 = new Cell();
		nested8.add("AB Number");
		nestedTable.addCell(nested8);

		Cell nested9 = new Cell();
		nested9.add("PO458789");// dynamic po number
		nestedTable.addCell(nested9);

		// Populating row 2 and adding it to the table
		float[] pointColumnWidths4 = { 90, 90f, 90f, 100f };
		Table nestedTable3 = new Table(pointColumnWidths4);

		// Adding row 3 to the table
		Cell cc6 = new Cell();
		Cell nested10 = new Cell();
		nested10.add("Salesperson");
		nestedTable.addCell(nested10);

		Cell nested11 = new Cell();
		nested11.add("Dale Smith");
		nestedTable.addCell(nested11);

		// Populating row 2 and adding it to the nested table
		Cell nested12 = new Cell();
		nested12.add("AB Number");
		nestedTable.addCell(nested12);

		Cell nested13 = new Cell();
		nested13.add("SPF-554-MIN");// dynamic po number
		nested13.setWidth(2);
		nestedTable.addCell(nested13);
		// Phone Number

		// Populating row 2 and adding it to the table
		float[] pointColumnWidths5 = { 90, 90f, 90f, 90f };
		Table nestedTable4 = new Table(pointColumnWidths5);

		// Adding row 3 to the table
		Cell cc8 = new Cell();
		Cell nested20 = new Cell();
		nested20.add("PhoneNo.");

		nestedTable.addCell(nested20);

		Cell nested21 = new Cell();
		nested21.add(" ");
		nestedTable.addCell(nested21);

		// Populating row 2 and adding it to the nested table
		Cell nested22 = new Cell();
		nested22.add("Taxable");
		nestedTable.addCell(nested22);

		Cell nested23 = new Cell();
		nested23.add("Yes");// dynamic
		nestedTable.addCell(nested23);
		// Phone Number

		c3.add(nestedTable);// added nested table
		cc4.add(nestedTable2);// distribotur column add
		cc6.add(nestedTable3);// sales pesron coumn add
		cc8.add(nestedTable4);// phn no.

		c3.setTextAlignment(TextAlignment.LEFT);
		table.addCell(c3);

		List list2 = new List();
		list2.add(new ListItem("Ship To"));
		list2.add(new ListItem("Ship To"));
		list2.add(new ListItem("Address"));

		Cell c46 = new Cell();
		c46.add(list2);
		c46.setTextAlignment(TextAlignment.LEFT);
		table.addCell(c46);

		// Adding Table to document
		doc.add(table);

		// Closing the document
		doc.close();
		System.out.println("Lists added to table successfully..");
	}
}
*/