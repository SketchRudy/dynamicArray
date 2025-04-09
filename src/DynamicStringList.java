class DynamicStringList implements StringList{
    String[] strList = new String[1];
    @Override
    public String get(int x) {
        return strList[x];
    }
    @Override
    public void set(int x, String str) {
        strList[x] = str;
    }
    @Override
    public void add(String str) {
        try {
            strList[strList.length-1] = str;
        } catch (Exception e) {
            String[] newStrList = new String[strList.length*2];
            strList = newStrList;
        }
    }
    @Override
    public String remove(int x) {
        String removed = strList[x];
        strList[x] = "";
        return removed;
    }
    @Override
    public int size() {
        int size = 0;
        for (String word : strList) {
            size++;
        }
        return size;
    }
    @Override
    public int capacity() {
        return strList.length;
    }
}
//testing stuff without the @test, try to make stuff in maintest

class Main {
    public static void main(String[] args) {
        DynamicStringList dsl = new DynamicStringList();
        dsl.add("RJ");
        System.out.println(dsl.get(0));
        dsl.add("RJ");
        System.out.println(dsl.get(0));
        System.out.println(dsl.size());
        for (int i = 0; i < dsl.capacity(); i++) {
            System.out.println(dsl.get(i));
        }
    }
}