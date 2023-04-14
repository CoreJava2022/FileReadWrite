package com.filehandaling;

public class Survey {

	private String variable;
	private String	breakdown;
	private String breakdown_category;
	private String year;
	private String rD_Value;
	private String status;
	private String	footnotes;
	private String unit_for_TSM_and_CSV;
	
	public String getVariable() {
		return variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}
	public String getBreakdown() {
		return breakdown;
	}
	public void setBreakdown(String breakdown) {
		this.breakdown = breakdown;
	}
	public String getBreakdown_category() {
		return breakdown_category;
	}
	public void setBreakdown_category(String breakdown_category) {
		this.breakdown_category = breakdown_category;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getrD_Value() {
		return rD_Value;
	}
	public void setrD_Value(String rD_Value) {
		this.rD_Value = rD_Value;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFootnotes() {
		return footnotes;
	}
	public void setFootnotes(String footnotes) {
		this.footnotes = footnotes;
	}
	public String getUnit_for_TSM_and_CSV() {
		return unit_for_TSM_and_CSV;
	}
	public void setUnit_for_TSM_and_CSV(String unit_for_TSM_and_CSV) {
		this.unit_for_TSM_and_CSV = unit_for_TSM_and_CSV;
	}
	
	public Survey() {
		// TODO Auto-generated constructor stub
	}
	
	public Survey(String variable, String breakdown) {
		super();
		this.variable = variable;
		this.breakdown = breakdown;
	}
	public Survey(String variable, String breakdown, String breakdown_category, String year, String rD_Value, String status,
			String footnotes, String unit_for_TSM_and_CSV) {
		super();
		this.variable = variable;
		this.breakdown = breakdown;
		this.breakdown_category = breakdown_category;
		this.year = year;
		this.rD_Value = rD_Value;
		this.status = status;
		this.footnotes = footnotes;
		this.unit_for_TSM_and_CSV = unit_for_TSM_and_CSV;
	}
	@Override
	public String toString() {
		return "Survey [variable=" + variable + ", breakdown=" + breakdown + ", breakdown_category="
				+ breakdown_category + ", year=" + year + ", rD_Value=" + rD_Value + ", status=" + status
				+ ", footnotes=" + footnotes + ", unit_for_TSM_and_CSV=" + unit_for_TSM_and_CSV + "]";
	}

	
	
	

}
