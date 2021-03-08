package min.kunnchan.composite;
/*
 * Created by kunnchan on 08/03/2021
 * package :  min.kunnchan.composite
 */

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    List<Component> components = new ArrayList<>();

    public void add(Component component){
        components.add(component);
    }

    @Override
    public void render(){
        for (Component component: components) {
            component.render();
        }
    }
}
