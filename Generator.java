
import java.util.ArrayList;
import java.util.Random;

public class Generator {

    private int length;

    Generator(int aLength) {
        length = aLength;

    }

    public ArrayList<String> Instantiator() {
        String[] Letters = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        String[] Symbols = new String[] { "!", "@", "#", "$", "%", "&", "_" };

        ArrayList<String> DataBase = new ArrayList<String>();
        for (int i = 0; i < Symbols.length + Letters.length + 10; i++) {
            if (i < 10) {
                String str = String.valueOf(i);
                DataBase.add(str);
            } else if (i < Symbols.length) {
                for (int z = 0; z < 5; z++) {
                    DataBase.add(i, Symbols[i]);
                }
            } else if (i < Letters.length) {
                DataBase.add(i, Letters[i]);

            }
        }

        return DataBase;

    }

    public String Creator(ArrayList<String> DataBase) {

        Random random = new Random();
        int initial = random.nextInt(DataBase.size());
        String PassW = "";

        for (int j = 0; j < length; j++) {
            int index = random.nextInt(DataBase.size());

            String Part = DataBase.get(index);

            PassW += Part;
        }
        return PassW;
    }
}