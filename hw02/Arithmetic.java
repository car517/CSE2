///////////////////////////////////////////
// Carlos Rosario
// CSE 001 Section 111
// Arithmetic Java Program
// September 09 2014
// 
// First Compile the Program
//  javac Arithmetic.java
// Compile the Program
//  java Arithmetic// 

// Define Class
public class Arithmetic{

// Add main method
    public static void main(String[] args) {
        int nSocks=3; //Number of Socks
        double SockCost$=2.58; //Cost per pair of sock '$' is part of variable name
        int nGlasses=6; //Number of drinking glasses
        double GlassCost$=2.29; //Cost per Glass
        int nEnvelopes=1; //Number of boxes of envelopes
        double EnvelopeCost$=3.25; //Cost per box of envelopes
        double TaxPercent=0.06; //PA sales tax
        double TotalSockCostBT, TotalGlassCostBT, TotalEnvelopeCostBT, stTotalSock, stTotalGlass, stTotalEnvelope, Totalst, TotalSockCostAT, TotalGlassCostAT, TotalEnvelopeCostAT, TotalPurchaseCostBT, TotalPaidAT;
        // Code above indicates the values being calculated. BT stands for before tax, st stands for sales tax, and AT stands for after tax. What is being calculated above is indicated in the variable itself
        // Below are the formulas for our wanted values
        TotalSockCostBT=nSocks*SockCost$;
        TotalGlassCostBT=nGlasses*GlassCost$;
        TotalEnvelopeCostBT=nEnvelopes*EnvelopeCost$;
        stTotalSock=TotalSockCostBT*TaxPercent;
        stTotalEnvelope=TotalEnvelopeCostBT*TaxPercent;
        stTotalGlass=TotalGlassCostBT*TaxPercent;
        Totalst=stTotalGlass+stTotalSock+stTotalEnvelope;
        TotalSockCostAT=stTotalSock+TotalSockCostBT;
        TotalGlassCostAT=stTotalGlass+TotalGlassCostBT;
        TotalEnvelopeCostAT=stTotalEnvelope+TotalEnvelopeCostBT;
        TotalPurchaseCostBT=TotalSockCostBT+TotalGlassCostBT+TotalEnvelopeCostBT;
        TotalPaidAT=TotalPurchaseCostBT+Totalst;
        // Print out the output of data
        System.out.println("Number of socks purchased was "+nSocks+" at $"+SockCost$+" each");
        System.out.println("Number of Glasses purchased was "+nGlasses+" at $"+GlassCost$+" each");
        System.out.println("Number of Envelopes purchased was "+nEnvelopes+" at $"+EnvelopeCost$+" each");
        System.out.println("Total Sock Cost Before tax was $"+TotalSockCostBT+"");
        System.out.println("Total Glasses Cost Before tax was $"+TotalGlassCostBT+"");
        System.out.println("Total Envelope Cost Before tax was $"+TotalEnvelopeCostBT+"");
        System.out.println("Total Sock Sales Tax $"+stTotalSock+"");
        System.out.println("Total Glasses Sales Tax $"+stTotalGlass+"");
        System.out.println("Total Envelope Sales Tax $"+stTotalEnvelope+"");
        System.out.println("Total Sales Tax $"+Totalst+"");
        System.out.println("Total Sock Cost After Tax $"+TotalSockCostAT+"");
        System.out.println("Total Glasses Cost After Tax $"+TotalGlassCostAT+"");
        System.out.println("Total Envelope Cost After Tax $"+TotalEnvelopeCostAT+"");
        System.out.println("Total Purchase Cost Before Tax $"+TotalPurchaseCostBT+"");
        System.out.println("Total Purchase Cost After Tax $"+TotalPaidAT+"");
        
    }
}
