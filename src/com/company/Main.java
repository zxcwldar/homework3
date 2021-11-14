package com.company;

public class Main {

    public static void main(String[] args) {
        double[] homeWork = {-1.1, 1.1, -2.5, 2.5, -7.8, 7.8, -9.7, 9.7, -11.5, 11.5, -23.5, 23.5, -14.2, 14.2, 15.8};
        double sun = 0;
        int headLine = 0;
        boolean headBool = false;
        for (double letsgGo: homeWork) {
            if (letsgGo < 0 ){
                headBool = true;
            } else {
                if (headBool){
                    headLine++;
                    sun += letsgGo;
                }
            }


        }
        System.out.println( "Средне арифмитическое " + sun/ headLine);


            }

        }











