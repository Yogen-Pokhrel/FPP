package Assignment6;

public class MyTable {

    //extra layer for label validation
    public enum LABELS {
        a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z
    }

    Entry[] entries;
    public void add(LABELS label, String value){
        Entry e = new Entry(label, value);
        if(entries != null){
            Entry[] allEntries = new Entry[entries.length + 1];
            System.arraycopy(entries, 0, allEntries, 0, entries.length);
            allEntries[entries.length] = e;
            entries = allEntries;
        }else{
            entries = new Entry[]{e};
        }
    }

    public String get(LABELS label){
        for(Entry entry: entries){
            if(entry.label == label){
                return entry.value;
            }
        }
        return null;
    }

    public String toString() {
       StringBuilder myOutput = new StringBuilder();
       for(Entry entry: entries){
           myOutput.append(entry.toString()).append("\n");
       }
       return myOutput.toString();
    }

    private class Entry {
        LABELS label;
        String value;
        Entry(LABELS label, String value){
            this.label = label;
            this.value = value;
        }

        public String toString() {
            return label + "->"+value;
        }
    }

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add(LABELS.a, "Andrew");
        t.add(LABELS.b,"Billy");
        t.add(LABELS.b,"Barbie");
        t.add(LABELS.c,"Willie");
        System.out.println(t);

        String s = t.get(LABELS.b);
        System.out.println(s);
    }
}
