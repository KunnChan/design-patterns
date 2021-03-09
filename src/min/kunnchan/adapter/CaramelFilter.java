package min.kunnchan.adapter;
/*
 * Created by kunnchan on 09/03/2021
 * package :  min.kunnchan.adapter
 */

import min.kunnchan.adapter.avaFilter.Caramel;

public class CaramelFilter implements Filter{
    private final Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
