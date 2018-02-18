//package com.mygdx.game;
//
//public class Walls {
//    static int wallleft;
//    static int wallright;
//    static int wallbottom;
//    static int walltop;
//
//    //To create a new wall
//    public void WallDimen (int wallleft, int wallright, int wallbottom, int walltop) {
//        //Detects for image within dimension boundaries
//        if (image.x >= wallleft - Image.imageWidth && image.x <= wallright) {
//            if (image.y >= wallbottom - Image.imageHeight && image.y <= walltop) {
//                System.out.println("Wall touched");
//
//                if (image.xvel<0 && image.x == wallright || image.xvel>0 && image.x == wallleft - Image.imageWidth ) {
//                    image.xvel = 0;
//                }
//                if(image.yvel<0 && image.y == walltop || image.yvel>0 && image.y == wallbottom - Image.imageHeight) {
//                    image.yvel = 0;
//                }
//            }
//        }
//    }
//
//    //Reference: (just this simple)
//    Walls.WallDimen(8,7,6,9);
//
//
//    //Random change of finding player (Brandon)
//    //World detects location of player
//
//    //Ghosts know this information
//    //Comes to a cross-of-paths
//    //Takes number of paths, divides them evenly by 100%
//    //Meaning, equal chance of going all ways
//
//    //Slightly higher chance of going in player direction
//    //EX: If lower y value, go down, if lower x value go left, etc.
//
//    //Closer the x value/y value within certain ranges, more likely to follow player
//    //Within certain range, always follows player
//
//
//
//    //Fastest path (Abhik)
//    //World detect player location
//
//    //Find ghost location
//    //Pythag theorem to find distance.
//
//    //Find way to decrease distance.
//    //Slightly above/left, go opposite direction
//
//}
