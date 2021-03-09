package min.kunnchan.adapter;
/*
 * Created by kunnchan on 09/03/2021
 * package :  min.kunnchan.adapter
 */

import min.kunnchan.adapter.avaFilter.Caramel;

public class Main {

    public static void main(String[] args) {

        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
