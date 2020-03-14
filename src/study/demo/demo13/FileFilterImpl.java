package study.demo.demo13;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        }
        return file.getName().toLowerCase().endsWith(".txt");
    }
}
