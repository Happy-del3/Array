public class Array {

    public static void main(String[] args) {
        // Declare variales and constants
        getArrayNumber();
        getArrayCharacters();
        getArrayString();
    }
    public static int getArrayNumber(){
        int array[] = new int[5];
        
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
        System.out.println("Index" + "\t" + "Value");
        
        for(int i=0; i < array.length; i++){
            System.out.println(i + "\t" +array[i]);
        }
        int i = 0;
        return array[i];
    }
    public static char getArrayCharacters(){
        char symbols[] = new char[5];
        
        symbols[0] = 'P';
        symbols[1] = 'W';
        symbols[2] = 'X';
        symbols[3] = 'Y';
        symbols[4] = 'Z';
     
        char symbol;
        
        System.out.println("Index" + "\t" + "Symbol");
        for(int j=0; j<symbols.length; j++){
            symbol = symbols[j];
            
            System.out.println(j + "\t" + symbol);
        }
        int j = 0;
        return symbols[j];
        
    }
    public static String getArrayString(){
        String  strArray[] = {"Happy", "Fly", "Manqobi", "Einstein", "Zee"};
        
        System.out.println("Index" + "\t" + "String");
        
        for(int k=0; k<strArray.length; k++){
            System.out.println(k + "\t" + strArray[k]);
        }
        int k =0;
        return strArray[k];
    }
    
}
