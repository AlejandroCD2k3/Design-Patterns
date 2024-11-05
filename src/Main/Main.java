package Main;

import StructuralPatterns.Adapter.*;

public class Main {
    
    public static void main(String[] args){
        
        XMLReport xmlReport = new XMLReport();
        
        System.out.println(xmlReport.generateXMLReport());
        
        // ADAPTING XML REPORT TO A JSON REPORT
        
        XMLReportAdapter xmlReportAdapter = new XMLReportAdapter();
        
        xmlReportAdapter.setXMLReport(xmlReport);
        
        System.out.println(xmlReportAdapter.generateReport());
        
    }
    
}
