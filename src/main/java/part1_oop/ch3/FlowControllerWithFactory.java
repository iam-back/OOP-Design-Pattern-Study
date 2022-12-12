package part1_oop.ch3;

public class FlowControllerWithFactory {

    public void process(){
        ByteSource byteSource = ByteSourceFactory.getInstance().create();
        byte[] data = byteSource.read();

        Encryptor encryptor = new Encryptor();
        byte[] encryptedData = encryptor.encrypt(data);

        FileDataWriter fileDataWriter = new FileDataWriter();
        fileDataWriter.write(encryptedData);
    }
}
