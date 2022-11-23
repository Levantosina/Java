public class hashtab {

    public static String test = "3Zd";
    public static int[] c = new int[test.length()];

    public static void hashTable() {
        for (int i = 0; i < test.length(); i++) {
            String sub = test.substring(i, i+1);
            System.out.println(sub.hashCode());
            // for some reason, we can't get hashcode directly from substring like this "test.substring(i, i+1).hashCode();"
            c[i] = sub.hashCode();
        }
    }

    public static void main(String[] args) {
        hashTable();

        int h = 0;
        int A = 3;
        int N = 931663099;
        for (int i = 0; i < test.length();i++) {
            h = (h * A +c[i]) % N;
        }
        System.out.println(h);
    }

}
