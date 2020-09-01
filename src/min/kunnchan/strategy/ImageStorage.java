package min.kunnchan.strategy;
/*
 * Created by kunnchan on 31/08/2020
 * package :  min.kunnchan.strategy
 */

public class ImageStorage {

    private Compressor compressor;
    private Filter filter;

    public void store(String fileName, Compressor compressor, Filter filter){
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
