public class FileExplorer {
    public static void main(String[] args) {
        File file1 = new File("File1.txt", "This is the content of File1 key.");
        File file2 = new File("File2.txt", "keyword This is the content of File2 keyword.");
        File file3 = new File("File3.txt", "This is the content of File3. ");
        File file4 = new File("File4.txt", "This is the content of File4. keyword koywokeyword");

        Folder folder1 = new Folder("Folder1");
        folder1.addFile(file1);
        folder1.addFile(file2);

        Folder folder2 = new Folder("Folder2");
        folder2.addFile(file3);

        Folder rootFolder = new Folder("parentFolder");
        rootFolder.addFile(folder1);
        rootFolder.addFile(folder2);

        Folder fs = new Folder("FS");
        fs.addFile(rootFolder);
        fs.addFile(file4);

       // fs.search("keyword");
        rootFolder.search("keyword");

    }
}
