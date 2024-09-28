
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pichau
 */
public class OneItemBox extends Box {

    private Item currentItem;

    public OneItemBox() {
        this.currentItem = null;
    }

    @Override
    public void add(Item item) {
        if (this.currentItem == null) {
            this.currentItem = item;
        }
    }

    @Override
    public void add(ArrayList<Item> items) {
        if (this.currentItem == null) {
            this.currentItem = items.get(0);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(this.currentItem == null){
            return false;
        }
        return this.currentItem.getName().equals(item.getName()); //To change body of generated methods, choose Tools | Templates.
    }

}
