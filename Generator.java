
import java.util.ArrayList;
import java.util.Random;

public class Generator {

    private int length;

    Generator(int aLength) {
        length = aLength;

    }

    public ArrayList<String> Instantiator() {
 String[] Letters = new String[]{ "A","B", "C", "D","E", "F", "G", "H","I", "J", "K", "L", "M", "N","O", "P", "Q", "R", "S", "T","U" ,"V","W", "X","Y", "Z" };        
 String[] Symbols = new String[]{"!","@","#","$","%","&","_"};

 Random random = new Random();
        
        
        ArrayList<String> DataBase = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            
            
            String str = String.valueOf(i);
            DataBase.add(str);
            if(i<Symbols.length){
            for(int z=0;z<5;z++){    
            DataBase.add(i,Symbols[i]);
            }
            }
            else if(i<Letters.length){
                DataBase.add(i,Letters[i]);
                
            }
            

        }
        DataBase.add("a");
        DataBase.add("b");
        DataBase.add("c");
        DataBase.add("d");
        DataBase.add("e");
        DataBase.add("f");
        DataBase.add("g");
        DataBase.add("h");
        DataBase.add("i");
        DataBase.add("j");
        DataBase.add("k");
        DataBase.add("l");
        DataBase.add("m");
        DataBase.add("n");
        DataBase.add("o");
        DataBase.add("p");
        DataBase.add("q");
        DataBase.add("r");
        DataBase.add("s");
        DataBase.add("t");
        DataBase.add("u");
        DataBase.add("v");
        DataBase.add("w");
        DataBase.add("x");
        DataBase.add("y");
        DataBase.add("z");
        
        
    
        return DataBase;
        
    }

    public String Creator(ArrayList<String> DataBase) {
        
      
        Random random = new Random();
        int initial = random.nextInt(DataBase.size());
        String Pass = "";
        String PassW = "";

        for (int j = 0; j < length; j++) {
            int index = random.nextInt(DataBase.size());

            String Part = DataBase.get(index);

            PassW += Part;
        }
        return PassW;
    }
}
