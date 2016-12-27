import java.io.File;

/**
 * Created by Tester on 27/12/2016.
 */
public class MyFileClass {
    static String path = "";

    String find(Folder folder, String filename){

        String pathToFile = "";
            String[] list = folder.file.list();
        try {
            for (String name : list) {
                if (folder.isDir) {
                    if (name.equals(filename)) {
                        pathToFile = folder.path + "\\" + filename;
                        path = pathToFile;
                        return pathToFile;
                    } else {

                        String sub = folder.path + "\\" + name;
                        Folder subfolder = new Folder(sub);
                        if (subfolder.isDir) {
                            find(subfolder, filename);
                        }
                    }
                }
            }
        }catch(NullPointerException e){
            //file not found
        }

        if(path.equals("")) {
            path = "Incorrect dir or no such file in this directory and subdirectory";
        }

        return path;
    }
}
