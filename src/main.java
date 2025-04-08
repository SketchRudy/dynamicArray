public class Main implements StringList {
    public static void main (String[] args) {
        int[] array = {10};
        System.out.println(array);

    }

    @Overide
    public String get(int index) {
        for (int i = 0; i < index; i++) {
            
        }
        return "";
    }


    @Override
    public void set(int index, String value) {

    }


    @Override
    public void add(String value) {
        
    }

    @Override
    public String remove(int index) {
        
        return "";
    }

    @Override
    public int size() {
        
        return 0;
    }

    @Override
    public int capacity() {
        
        return 0;
    }
}