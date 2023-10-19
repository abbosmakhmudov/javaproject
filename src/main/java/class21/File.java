package class21;

public abstract class File {
    private String name;
    private int size;
public File(String name,int size){
    this.name=name;
    this.size=size;
}
    abstract void open();
    abstract void edit();
    abstract void close();
}

class JavaFile extends File{
    public JavaFile(String name, int size){
        super(name,size);
    }

    @Override
    void open() {
        System.out.println("Open JavaFile");
    }

    @Override
    void edit() {
        System.out.println("Open JavaFile");
    }

    @Override
    void close() {
        System.out.println("Open JavaFile");
    }
}
class WordFile extends File{

    public WordFile(String name,int size){
        super(name,size);
    }
    @Override
    void open() {
        System.out.println("Open WordFile");
    }

    @Override
    void edit() {
        System.out.println("Open WordFile");

    }

    @Override
    void close() {
        System.out.println("Open WordFile");

    }
}
class PdfFile extends File{

    public PdfFile(String name,int size){
        super(name, size);
    }
    @Override
    void open() {
        System.out.println("Open PdfFile");

    }

    @Override
    void edit() {
        System.out.println("Open PdfFile");

    }

    @Override
    void close() {
        System.out.println("Open PdfFile");

    }
}
