package ajedrez;

import processing.core.PApplet;

public class Tablero extends PApplet {

    public static void main(String[] args) {
        PApplet.main(Tablero.class.getName());
    }

    @Override
    public void settings() {
        size(displayWidth, displayHeight);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        boolean a = true;
        for (int i = 3; i <= 10 ; i ++){
            for (int j = 0; j <= 8; j ++){
                if(i == 4 || i == 6 || i == 8 || i == 10){
                    if(a == false){
                        fill(0, 0, 0);
                        rect(displayHeight/8*i, displayHeight/8*j, displayHeight/8, displayHeight/8);
                        a = true;
                    }else{
                        fill(250, 250, 250);
                        rect(displayHeight/8*i, displayHeight/8*j, displayHeight/8, displayHeight/8);
                        a = false;
                    }
                }else{
                    if(a == false){
                        fill(0, 0, 0);
                        rect(displayHeight/8*i, displayHeight/8*j, displayHeight/8, displayHeight/8);
                                a = true;
                        }else{
                            fill(250, 250, 250);
                            rect(displayHeight/8*i, displayHeight/8*j, displayHeight/8, displayHeight/8);
                            a = false;
                        }
                }
            }            
        }
    }

}