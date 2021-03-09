package min.kunnchan.adapter;
/*
 * Created by kunnchan on 09/03/2021
 * package :  min.kunnchan.adapter
 */

public class ImageView {
    private Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void apply(Filter filter){
        filter.apply(image);
    }
}
