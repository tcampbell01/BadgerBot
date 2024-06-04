public class Main {
    public static void main(String[] args) {
        BadgerBot bot = new BadgerBot();
        bot.turnLeft();   //turns 45 degrees to the left
        bot.turnLeft();   //another 45 degrees left
        bot.step();  //moves one block

        //Make the badger move completely around the walls using only the step() and leftTurn() methods.
//        bot.step();
//        bot.step();
//        bot.turnLeft();
//        bot.turnLeft();
//        bot.turnLeft();
//        bot.turnLeft();
//        bot.turnLeft();
//        bot.turnLeft();
//        bot.step();
//        bot.step();
//        bot.step();
//        bot.step();

        //Make the badger move the other direction around the walls.

//            bot.turnLeft();
//            bot.turnLeft();
//            bot.step();
//            bot.step();
//            bot.turnLeft();
//            bot.turnLeft();
//            bot.step();
//            bot.step();
//            bot.step();
//            bot.step();



        //Draw the path of the badger as it steps.
//            bot.startDrawing();
//            bot.turnLeft();
//            bot.turnLeft();
//            bot.step();
//            bot.step();
//            bot.turnLeft();
//            bot.turnLeft();
//            bot.step();
//            bot.step();
//            bot.step();
//            bot.step();

        //Make each straight path the badger takes a different color.
        bot.startDrawing();
        bot.setPenColor("BLUE");
        bot.turnLeft();
        bot.turnLeft();
        bot.step();
        bot.step();
        bot.setPenColor("RED");
        bot.turnLeft();
        bot.turnLeft();
        bot.step();
        bot.step();
        bot.step();
        bot.step();
    }
}