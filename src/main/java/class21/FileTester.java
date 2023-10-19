package class21;

public class FileTester {
    public static void main(String[] args) {
        File [] arr={new JavaFile("JavaFile.java",255),new WordFile("WordFile.doc",23),new PdfFile("PdfFile",350)};
        for(File f:arr){
            f.open();
            f.edit();
            f.close();

        }

    }
}
