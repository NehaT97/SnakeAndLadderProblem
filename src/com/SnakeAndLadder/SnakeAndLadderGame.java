package com.SnakeAndLadder;

public class SnakeAndLadderGame {

        //uc1_single player at start position 0;
        public static int position_of_player1=0;

        //uc2_Player Rolls The Die;
        public static void dieRoll()
        {
                int die_value=(int)(Math.random()*6)+1;
                System.out.println("DieValue:"+die_value);
        }

        public static void main(String args[])
        {
            System.out.println("WELCOME TO SNAKE AND LADDER GAME");
            SnakeAndLadderGame obj1=new SnakeAndLadderGame();
            obj1.dieRoll();
        }


}
