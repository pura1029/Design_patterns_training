package com.reporting;

public class ReportFormatter {

	private String formattedOutput;

	public ReportFormatter(Object object, FormateType formatType) {

		switch (formatType) {
		case XML:
			formattedOutput = convertObjectToXML(object);
			break;
		case CSV:
			formattedOutput = convertObjectToCSV(object);
			break;
		case PDF:
			formattedOutput = convertObjectToPDF(object);
			break;
		}
	}

	protected String getFormattedOutput() {
		return formattedOutput;
	}

	private String convertObjectToXML(Object object) {
		return "XML : <title> " + object.toString() + "</title>";
	}

	private String convertObjectToCSV(Object object) {
		return "CSV : ,,, " + object.toString() + ",,,";
	}

	private String convertObjectToPDF(Object object) {
		return "PDF : #Start " + object.toString() + " #End";
	}
}
