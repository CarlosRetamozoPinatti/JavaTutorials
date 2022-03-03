package domain;

public class Writer extends Employee{

    final WritingType writingType;

    public Writer(String name, double salary, WritingType writingType){
        super(name, salary);
        this.writingType = writingType;
    }

    @Override
    public String getDetails(){
        return super.getDetails() + ", writingType: " + writingType.getDescription();
    }

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", writingType=" + writingType +
                '}';
    }

    public WritingType getWritingType(){
        return this.writingType;
    }
}
