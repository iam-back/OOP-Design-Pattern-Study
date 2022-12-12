package part1_oop.ch3;

public class FlowControllerWithDI {

    private ByteSource byteSource;

    // ByteSource 를 주입받아 처리
    public FlowControllerWithDI(ByteSource byteSource){
        this.byteSource = byteSource;
    }

    public void process(){

        byte[] data = null;

        if(byteSource!=null){
            data = byteSource.read();

            Encryptor encryptor = new Encryptor();
            byte[] encryptedData = encryptor.encrypt(data);

            FileDataWriter fileDataWriter = new FileDataWriter();
            fileDataWriter.write(encryptedData);

        } else {
            throw new SourceNotFoundException();
        }
    }
}
