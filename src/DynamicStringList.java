class DynamicStringList implements StringList{
    String[] strList = new String[1];
    private int size = 0;

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
        if (size == strList.length) {
            String[] newStrList = new String[strList.length*2];
            for (int i = 0; i < strList.length; i++) {
                newStrList[i] = strList[i];
            }
            strList = newStrList;
    }
    strList[size] = str;
    size++;
    }

    @Override
    public String remove(int x) {
        String removed = strList[x];
        for (int i = x; i < size - 1; i++) {
            strList[i] = strList[i+1];
        }

        strList[size - 1] = null;
        size--;
        return removed;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return strList.length;
    }
}
//testing stuff without the @test, try to make stuff in maintest

// class Main {
//     public static void main(String[] args) {
//         DynamicStringList dsl = new DynamicStringList();
//         dsl.add("RJ");
//         System.out.println(dsl.get(0));
//         dsl.add("RJ");
//         System.out.println(dsl.get(0));
//         System.out.println(dsl.size());
//         for (int i = 0; i < dsl.capacity(); i++) {
//             System.out.println(dsl.get(i));
//         }
//     }
// }