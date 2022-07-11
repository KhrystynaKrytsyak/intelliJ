package class25;

public abstract class File {
        //Create a class File that will have the following behaviors: open, edit, close.
        //Edit and close are implemented method while open is an abstract.
        // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
        // implementation of open behaviour: Example: to open .java file we need notepad++ or
        // sublime text, to open .doc file we need Microsoft word to be installed etc.
    abstract void open();

    void edit() {
        System.out.println("You can edit this file");
    }
    void close(){
        System.out.println("You can close this file");
        }
    }
    class JavaFile extends File{
    @Override
        void open() {
        System.out.println("We need notepad++ to open JavaFile");
        }
    }

    class WordFile extends File {
    @Override
        void open() {
        System.out.println("You need Microsoft Word to open WordFile");
     }
    }

    class PdfFile extends File {
    @Override
        void open() {
        System.out.println("You need Acrobat Reader to read PDF File");
        }
    }

    class Tester {
    public static void main(String[] args) {

        File [] application={new JavaFile(), new WordFile(), new PdfFile()};
        for (File file:application) {
            file.open();
            file.edit();
            file.close();
          }
    }
}
