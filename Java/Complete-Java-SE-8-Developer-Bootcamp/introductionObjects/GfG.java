package introductionObjects;

public class GfG {
	// Constructor of GfG class 
    GfG() 
    { 
        System.out.println("Constructor Called"); 
    } 
	
	// Instance Initialization Block. All IIB's are executed from top to bottom and before constructor calling
    {  
        System.out.println("IIB block"); 
    } 
     
    public static void main(String[] args) 
    { 
        GfG a = new GfG(); 
    } 
}
