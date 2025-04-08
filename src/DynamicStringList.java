class DynamicStringList implements StringList{
    String[] strList = new String[10];
    @Override
    public String get(int x) {
        return "Test";
    }
    @Override
    public void set(int x, String str) {
    }
    @Override
    public void add(String str) {
    }
    @Override
    public String remove(int x) {
        return "Test";
    }
    @Override
    public int size() {
        return -1;
    }
    @Override
    public int capacity() {
        return -1;
    }
}
class Main {
    public static void main(String[] args) {
        DynamicStringList dsl = new DynamicStringList();
        dsl.add("RJ");
        System.out.println();
    }
}