package StructuralPatterns.Adapter;

public class XMLReportAdapter implements ReportAdapter{

    private XMLReport xmlReport;
    
    @Override
    public String generateReport() {
        
        String xmlReportData = xmlReport.generateXMLReport();
        
        String jsonReportData = adaptXMLToJSON(xmlReportData);
        
        return jsonReportData;
    }
    
    private String adaptXMLToJSON(String xmlData){
        
        String jsonReport = xmlData + " transformed to JSON";
        
        return jsonReport;
    }
    
    public void setXMLReport(XMLReport xmlReport){
        this.xmlReport = xmlReport;
    }
    
}
