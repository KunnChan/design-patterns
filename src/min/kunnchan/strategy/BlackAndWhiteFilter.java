package min.kunnchan.strategy;
/*
 * Created by kunnchan on 31/08/2020
 * package :  min.kunnchan.strategy
 */

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W filter");
    }
}
