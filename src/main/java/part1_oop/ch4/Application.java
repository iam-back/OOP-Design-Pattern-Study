package part1_oop.ch4;

public class Application {

    public static void main(String[] args) {

        Compressor compressor = new Compressor();
        FileData file = new FileData();

        Storage storage = new Storage();

        storage.setCompressor(compressor);
        storage.save(file);

    }
}
