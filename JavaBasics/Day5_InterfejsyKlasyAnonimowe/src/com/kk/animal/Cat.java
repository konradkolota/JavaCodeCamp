package com.kk.animal;

public class Cat extends Animal implements Atackable, BeAngry{
    private int lives;
    private int length;

    public Cat(String name, int length) {
        super(name);
        this.lives = 8;
        this.length = length;
    }

    public Cat(String name){
        super(name);
    }

    public int getLength() {
        return length;
    }

    public int getLives() {
        return lives;
    }

    public void kill(){
        lives = lives - 1;
        if(lives <=0){
            System.out.println("Kot zdechł ;_;");
        }
    }

    @Override
    public String toString() {
        return "Cat length: " + length + " ap: " + attack();
    }

    @Override
    public int attack() {
        return 50;
    }

    public void angryCat(){
        BeAngry meow = new BeAngry() {
            @Override
            public void Angry() {
                System.out.println("Angry meoweing!");
            }
        };
    }

    @Override
    public void Angry() {

    }
}
