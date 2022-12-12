package part1_oop.ch3;

public class FlowController {

    public void process(){
        FileDataReader fileDataReader = new FileDataReader();
        byte[] data = fileDataReader.read();

        Encryptor encryptor = new Encryptor();
        byte[] encryptedData = encryptor.encrypt(data);

        FileDataWriter fileDataWriter = new FileDataWriter();
        fileDataWriter.write(encryptedData);
    }


}
