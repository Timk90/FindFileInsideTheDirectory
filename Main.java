import java.io.File;

/**
 * Created by Tester on 27/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder("C:\\Users\\Tester\\IdeaProjects\\FileSearching");// здесь у меня находится проект
        MyFileClass myFileClass = new MyFileClass();
        System.out.println(myFileClass.find(folder, "file.txt"));
    }
}
