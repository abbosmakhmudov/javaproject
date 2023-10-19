package review13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2Config {
    public static void main(String[] args) {
        String path="C:\\Users\\abbas\\IdeaProjects\\javaproject\\Files\\Config.properties";
        try{
            FileInputStream fis=new FileInputStream(path);
        }catch (NullPointerException e){

        }catch (FileNotFoundException e){

        }


    }
}
