package Exceptions;

import java.io.IOException;

public class FileReaderSim {

    void readFile(String fileName) throws IOException {
        if (fileName.equals("confidential.txt")){
            throw new IOException("Access Denied");
//          Note: Because you threw a Checked Exception, Java will yell at you. You must fix the method signature: void readFile(...) throws IOException
        }
    }
    void parseData(String data){
        System.out.println(data.length());

    }

    public static void main(String[] args) {
        FileReaderSim obj = new FileReaderSim();

        try{
            obj.readFile("confidential.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Closing File Resources....");
        }

        try{
            obj.parseData(null);
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }
}
