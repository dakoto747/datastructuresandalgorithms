package com.dakoto.datastructuresandalgorithms;

/**
 * Created by dakoto on 11/11/2018.
 */
public class Geometry {




    public class Line{

        public Point start;

        public Point end;

        public double calculateSlope()
        {
            // slope = y1-y2/x1-x2

            return (start.getxCoord() - end.getxCoord()) /
                    (start.getyCoord() - end.getyCoord());
        }
    }

    public class Point{

        public int xCoord;

        public int yCoord;

        public int getxCoord() {
            return xCoord;
        }

        public void setxCoord(int xCoord) {
            this.xCoord = xCoord;
        }

        public int getyCoord() {
            return yCoord;
        }

        public void setyCoord(int yCoord) {
            this.yCoord = yCoord;
        }
    }
}
