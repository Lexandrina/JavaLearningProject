package md.tekwillacademy.filemanagementservice14;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {
        File fileObject01 = new File("src/main/java/md/tekwillacademy/filemanagementservice14/fisier.txt");
        FilesManager.informIfTheFileExist(fileObject01);
        System.out.println(FilesManager.createTheFileIfDoesNotExist(fileObject01));
        FilesManager.createTheFileIfDoesNotExist(fileObject01);
        FilesManager.informIfTheFileExist(fileObject01);
        FilesManager.printTheAbsolutPath(fileObject01);
        FilesManager.printIfTheFileIsADirectory(fileObject01);
        FilesManager.deleteTheFileIfExist(fileObject01);

        String path = "src/main/java/md/tekwillacademy/filemanagementservice14/writeData.txt";
        OutputFilesWriterManager.writeDataIntoTheFileUsingFileWriter(path, "Content 1");
        OutputFilesWriterManager.writeDataIntoTheFileUsingFileWriter(path, "Content 2");

        OutputFilesWriterManager.writeDataIntoTheFileUsingBufferWriter(path, "Content 3");

        InputFilesReadManager.printTheDataFromAFile(path);
        InputFilesReadManager.printDataFromAFileByUsingFileReader(path);
        InputFilesReadManager.printDataFromAFileByUsingBufferReader(path);
    }
}
