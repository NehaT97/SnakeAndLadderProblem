package com.SnakeAndLadder;
public class SnakeAndLadderGame {

        public static int position_of_player1=0;
        public static int position_of_player2=0;
        public static int no_of_die_rolls=0;
        public static int die_value;
        public static int values=0;

        public static int dieRoll()
        {
                int die_value=(int)(Math.random()*6)+1;
                return die_value;
        }

        public static int play(int value)
        {
                values=value;
                if (values<100)
                {
                    die_value = dieRoll();
                    no_of_die_rolls=no_of_die_rolls+1;
                    System.out.println("DieValue:" + die_value);
                    int option = (int) (Math.random() * 10) % 3;
                    switch (option) {
                        case 0:
                            break;

                        case 1:
                            ladder();
                            break;

                        case 2:
                            snake();
                            break;

                        default:
                            System.out.println("Something Unexpected Happen !!");

                    }
                }
                return values;
        }

        public static void ladder()
        {
            System.out.println("Ladder");
            if (values+die_value<100)
            {
                values=values+die_value;

                if (values<100)
                {
                    die_value=dieRoll();

                    if (values+die_value<=100)
                    {
                        values=values+die_value;
                    }

                }
            }
        }

        public static void snake()
        {
            System.out.println("Snake");
            if (values>die_value && values>0)
            {
                values=values-die_value;
            }
            else {
                values=0;
            }
        }

        public static void main(String args[])
        {
                System.out.println("WELCOME TO SNAKE AND LADDER GAME");
                SnakeAndLadderGame game = new SnakeAndLadderGame();

                while (position_of_player1<100 && position_of_player2<100) {
                    position_of_player1 = game.play(position_of_player1);
                    System.out.println("Number Of Die Roll :" + no_of_die_rolls + "\tPosition of Player1 :" + position_of_player1);

                    position_of_player2 = game.play(position_of_player2);
                    System.out.println("Number Of Die Roll :" + no_of_die_rolls  + "\tPosition of Player2 :" + position_of_player2);
                }

                if(position_of_player1==100) {
                    System.out.println("Player 1 is Winner");
                }else {
                    System.out.println("Player 2 is Winner");
                }

        }
}
