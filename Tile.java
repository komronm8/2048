import java.awt.*;

public class Tile {

    int value;
    Color color;

    public Tile(){
        value = 0;
        color = Color.darkGray;
    }

    public Tile(int num) {
        value = num;
        switch (num) {
            case 2 -> color = Color.gray;
            case 4 -> color = new Color(255, 229, 204);
            case 8 -> color = new Color(255, 178, 102);
            case 16 -> color = new Color(255, 153, 51);
            case 32 -> color = new Color(255, 116, 55);
            case 64 -> color = new Color(255, 89, 55);
            case 128 -> color = new Color(255, 248, 134);
            case 256 -> color = new Color(252, 242, 110);
            case 512 -> color = new Color(245, 233, 76);
            case 1024 -> color = new Color(255, 242, 41);
            case 2048 -> color = new Color(255, 239,0);
        }
    }

    public int getValue(){
        return value;
    }

    public void setValue(int val){
        value = val;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color col){
        color = col;
    }

    public String toString(){
        return "" + value;
    }

}
