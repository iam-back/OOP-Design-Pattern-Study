package part1_oop.ch3;

public class SocketDataReader implements ByteSource{

    @Override
    public byte[] read(){
        return new byte[10];
    }
}
