package min.kunnchan.strategy;
/*
 * Created by kunnchan on 31/08/2020
 * package :  min.kunnchan.strategy
 */

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using jpeg");
    }
}
