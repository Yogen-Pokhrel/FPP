package Assignment2;
/**
 * @author Yogen
 * @StudentId: 617585
 * @Professor: Burmaa Enkhbat
 * @Question:
 * <strong>Problem – 2</strong>
 * The records of a database table Product have been stored in text format as s string in your
 * given program using delimiters “:” and “,” in the following way: Different rows are
 * separated by “:” and, within a particular record, different column entries are separated by “,”.
 * <br/><br/>
 * In each record, the first column is always productId.
 * Write a program (called Prog2) that will read from the string records and extract all the
 * product id’s that occur in the String. Here records works as text file. Your program should
 * then output ALL the product id to the console in the following form: (this is a typical
 * example)
 * <br/><br/>
 * 231A<br/>
 * 113D<br/>
 * 521W<br/>
 * 009G
 */
public class Prog2 {
    public static void main(String[] args) {
        String records = "231A,Light Bulb,123,Wilco,1.75:"+
                "113D,Hairbrush,19,Aamco,3.75:"+
                "521W,Shampoo,24,Acme,6.95:"+
                "440Q,Dishwashing Detergent,20,Wilco,1.75:"+
                "009G,Toothbrush,77,Wilco,0.85:"+
                "336C,Comb,34,Wilco,0.99:"+
                "523E,Paper Pad Set,109,Congdon and Chrome,2.45:"+
                "888A,Fake Diamond Ring,111,AmericusDiamond,3.95:"+
                "176A,Romance Nove1 1,20,Barnes and Noble,3.50:"+
                "176B,Romance Nove1 2,20,Barnes and Noble,3.50:"+
                "176C,Romance Nove1 3,20,Barnes and Noble,3.50:"+
                "500D,Floss,44,Wilco,1.25:"+
                "135B,Ant Farm,5,Wilco,8.00:"+
                "211Q,Bicycle,9,Schwinn,75.95:"+
                "932V,Pen Set,50,Congdon and Chrome,9.95:"+
                "678Q,Pencil 50,123,Congdon and Chrome,9.95:"+
                "239A,Colored Pencils,25,Congdon and Chrome,4.75:"+
                "975B,Shower Curtain,25,Wilco,6.50:"+
                "870K,Dog Bowl,15,Wilco,4.75:"+
                "231S,Cat Bowl,15,Wilco,4.75:"+
                "562M,Kitty Litter,15,Wilco,3.25:"+
                "777X,Dog Bone,15,Wilco,4.15:"+
                "933W,Cat Toy,15,Wilco,2.35:"+
                "215A,Hair Ball,0,Little Jimmy,0.00:";

        String[] allRecords = records.split(":");
        for(String eachRecord : allRecords){
            String[] eachProduct = eachRecord.split(",");
            System.out.println(eachProduct[0]);
        }
    }
}
