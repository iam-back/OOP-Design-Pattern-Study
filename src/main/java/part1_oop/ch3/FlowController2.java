package part1_oop.ch3;

public class FlowController2 {

    private boolean useFile;

    /*
    만약 File 이 아닌 Socket 을 통해 전달받은 데이터를 처리해야한다면
    Data 를 읽어오는 부분이 변경되어야 할 것이다.
     */

    public FlowController2(boolean useFile){
        this.useFile = useFile;
    }

    public void process(){

        byte[] data = null;

        if(useFile){
            FileDataReader fileDataReader = new FileDataReader();
            data = fileDataReader.read();
        } else{
            SocketDataReader socketDataReader = new SocketDataReader();
            data = socketDataReader.read();
        }

        Encryptor encryptor = new Encryptor();
        byte[] encryptedData = encryptor.encrypt(data);

        FileDataWriter fileDataWriter = new FileDataWriter();
        fileDataWriter.write(encryptedData);

    }
}
