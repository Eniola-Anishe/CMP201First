package UI.Files;

public class Main2 {
//
public static void main(String[] args) {
    FileWriterMain fileWriterMain=new FileWriterMain();
//    fileWriterMain.writeData("Area Of Square with length and breadth=");
    fileWriterMain.readFromFile();
    fileWriterMain.appendData("An appended text");
    System.out.println("NEW TEXT FILE WITH APPEND CHANGES");
    fileWriterMain.readFromFile();
}
}
