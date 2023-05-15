package hr.fer.oop;

class Utils {
    
    public static int checkPassword(String password) {
        
        char[] pass = password.toCharArray();
        
        if(pass.length < 8)
            throw new IllegalArgumentException();
        
        int znamenke = 0;
        int velikaSlova = 0;
        int notalfanum = 0;
        int ocjena;
        
        for(char p : pass) {
            
        if(p >= 'A' && p <= 'Z')
            ++velikaSlova;
        
        if(p >= '0' && p <= '9')
            ++znamenke;   
        
        if(!Character.isLetterOrDigit(p))
        	++notalfanum;
        }
        

        
        
        ocjena = pass.length + 2*znamenke + velikaSlova + 3*notalfanum ;
        
        if(ocjena < 15)
            throw new SecurityException();
        
        return ocjena;
        
    }
    
    public static void main(String[] args) {
    	System.out.println(checkPassword("123_aBcd"));
    }

}
