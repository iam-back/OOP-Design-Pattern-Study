package part1_oop.ch3;

public class MockByteSource implements ByteSource{

    @Override
    public byte[] read() {
        return new byte[0];
    }
}
