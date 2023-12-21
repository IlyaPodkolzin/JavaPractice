package java24.task3;

import javax.swing.*;
import java.io.IOException;

public interface IDocument {
    String getPath();
    void save() throws IOException;
    void createEditor(JFrame jFrame) throws IOException;
    void removeEditor(JFrame jFrame);
}
