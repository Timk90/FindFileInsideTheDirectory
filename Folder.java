import java.io.File;

/**
 * Created by Tester on 27/12/2016.
 */
public class Folder {

        String path;
        boolean isDir = true;
        File file;

        Folder(String path){
            this.path = path;
            file = new File(path);
            if(file.isDirectory()) {
                isDir = true;
                this.path = file.getAbsolutePath();
            }else{
                this.path = file.getAbsolutePath();
                this.isDir = false;
            }
        }

}
