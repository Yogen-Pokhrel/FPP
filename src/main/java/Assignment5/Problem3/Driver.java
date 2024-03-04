package Assignment5.Problem3;

public class Driver {
    public static void main(String[] args) {
        Figure[] allFigures = {
                new UpwardHat(),
                new UpwardHat(),
                new DownwardHat(),
                new FaceMaker(),
                new Vertical()
        };

//        print in the format specified as  /\, \/,:), and ||.  - inline print
        for (Figure f: allFigures){
            f.getFigure();
        }

        /**
         *print in the other format with the class name as
         * UpwardHat : /\
         * UpwardHat : /\
         * DownwardHat : \/
         * FaceMaker : :)
         * Vertical : | |
        */
        for (Figure f: allFigures){
            System.out.println();
            System.out.print(f.getClass().getSimpleName() + ": ");
            f.getFigure();
        }

    }
}
