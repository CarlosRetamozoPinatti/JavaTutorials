package ExampleLab;

public class BoxOperation {
    public static void main(String[] args) {
        //Using Empty Constructor and Void Method.
        BoxModel boxVol = new BoxModel();
        boxVol.height = 2;
        boxVol.width = 3;
        boxVol.depth = 6;
        boxVol.boxVolume();
        //Using Constructor w/Args and Void Method.
        BoxModel boxVol2 = new BoxModel(4, 2, 5);
        boxVol2.boxVolume();
        //Using Empty Constructor and Method w/Args.
        BoxModel boxVol3 = new BoxModel();
        int result = boxVol3.boxVolume(7, 9, 2);
        System.out.println("result = " + result);

    }
}
