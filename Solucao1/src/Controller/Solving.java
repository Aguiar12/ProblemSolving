/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.BackGround;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public class Solving {
    public ArrayList<String> list;

    public ArrayList getList() {
        return list;
    }

    public void setList(String name) {
        this.list.add(name);
    }
    public void clearList(){
        this.list.clear();
    }
    public Solving(){
        this.list = new ArrayList<String>();
    }
}
