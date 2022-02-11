package ExampleLab;

public class BoxModel {
    int height;
    int width;
    int depth;

    public BoxModel(){
        System.out.println("Using Box's Empty constructor...");
    }
    public BoxModel(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
        System.out.println("Using Box's w/Args constructor...");
    }
    public int boxVolume(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
        return (height * width * depth);
    }
    public void boxVolume(){
        int result = (height * width * depth);
        System.out.println("Result of the operation without args = " + result);
    }

}
