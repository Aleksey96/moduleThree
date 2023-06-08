package homeworksixteen_exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;

public class TaskSix {

    private final static int SIZE_ARRAY = 50;

    private static XmlReader[] createArray(int size) {
        XmlReader[] xmlReaders = new XmlReader[size];
        for (int i = 0; i < xmlReaders.length; i++) {
            xmlReaders[i] = new XmlReader();
        }
        return xmlReaders;
    }

    private static void callReadMethod(XmlReader[] xmlReaders) throws FileNotFoundException {
        for (XmlReader element : xmlReaders) {
            try {
                element.read();
            } catch (IOException | RuntimeException | Error ex) {
                System.out.println(ex.getClass());
                if (ex instanceof FileSystemAlreadyExistsException) {
                    throw new FileNotFoundException();
                } else {
                    System.out.println("Обработка исключения");
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        callReadMethod(createArray(SIZE_ARRAY));
    }
}
