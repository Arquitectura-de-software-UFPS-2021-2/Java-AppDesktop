package doconver.app;

import java.io.Serializable;

import com.aspose.cells.Workbook;
import com.aspose.slides.Presentation;
import com.aspose.words.Document;

public class Convert implements Serializable {

	private static final long serialVersionUID = 1L;

	public Convert() {
	}

	public void to(String entry, String out, int ext, int type) throws Exception {
		switch (type) {
		case 1:
			Document document = new Document(entry);
			document.save(out, ext);   
			break;
		case 2:
			Workbook book = new Workbook(entry);
			book.save(out, ext);  
			break;
		default:
			Presentation presentation = new Presentation(entry);
			presentation.save(out, ext);
			break;
		}
	}
	
	/******************************
	 * WORD
	 ******************************/
	public void wordToOdt(String entry, String out) throws Exception {
		if(Validator.validate(entry, Variable.EXT_WORD)) {
			this.to(entry, out, com.aspose.words.SaveFormat.ODT, Variable.TYPE_CONVERT_1);
		}
	}
	
	public void wordToPDF(String entry, String out) throws Exception {
		if(Validator.validate(entry, Variable.EXT_WORD)) {
			this.to(entry, out, com.aspose.words.SaveFormat.PDF, Variable.TYPE_CONVERT_1);
		}
	}
	
	public void OdtToWord(String entry, String out) throws Exception {
		if(Validator.validate(entry, Variable.EXT_ODT)) {
			this.to(entry, out, com.aspose.words.SaveFormat.DOCX, Variable.TYPE_CONVERT_1);
		}
	}
	
	/******************************
	 * EXCEL
	 ******************************/
	public void excelToOds(String entry, String out) throws Exception {
		if(Validator.validate(entry, Variable.EXT_EXCEL)) {
			this.to(entry, out, com.aspose.cells.SaveFormat.AUTO, Variable.TYPE_CONVERT_2);
		}	
	}
	
	public void excelToPDF(String entry, String out) throws Exception {
		if(Validator.validate(entry, Variable.EXT_EXCEL)) {
			this.to(entry, out, com.aspose.cells.SaveFormat.PDF, Variable.TYPE_CONVERT_2);
		}
	}
	
	public void odsToExcel(String entry, String out) throws Exception {
		if(Validator.validate(entry, Variable.EXT_ODS)) {
			this.to(entry, out, com.aspose.cells.SaveFormat.XLSX, Variable.TYPE_CONVERT_2);
		}
	}
	
	/******************************
	 * POWER POINT
	 ******************************/
	public void powerPointToOdp(String entry, String out) throws Exception {
		if(Validator.validate(entry, Variable.EXT_POWER_POINT)) {
			this.to(entry, out, com.aspose.slides.SaveFormat.Odp, Variable.TYPE_CONVERT);
		}
	}
	
	public void powerPointToPDF(String entry, String out) throws Exception {
		if(Validator.validate(entry, Variable.EXT_POWER_POINT)) {
			this.to(entry, out, com.aspose.slides.SaveFormat.Pdf, Variable.TYPE_CONVERT);
		}
	}
	
	public void odpToPowerPoint(String entry, String out) throws Exception {
		if(Validator.validate(entry, Variable.EXT_ODP)) {
			this.to(entry, out, com.aspose.slides.SaveFormat.Odp, Variable.TYPE_CONVERT);
		}
	}
	
	public static void main(String args[]) {
		Convert convert = new Convert();
		try {
			convert.excelToOds("C:\\Users\\SerBuitrago2\\Desktop\\notas.pdf", "C:\\Users\\SerBuitrago2\\Desktop\\aa.ods");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}