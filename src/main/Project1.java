package main;

import java.util.*;

public class Project1 {

    public void projectRunner() {
        Weight weight1 = new Weight(11, 3);
        Weight weight2 = new Weight(7, 20); // Hint: normalize method should be used to translate into 8 pounds and 4 ounces
        Weight weight3 = new Weight(14, 6);

       Weight max =  findMaximum(weight1, weight2, weight3);
       Weight min = findMinimum(weight1, weight2, weight3);
       Weight avg = findAverage(weight1, weight2, weight3);
    }


    private Weight findMinimum(Weight w1, Weight w2, Weight w3) {
        Weight minWeight;

        ArrayList<Weight> minList = new ArrayList<>() ;
        minList.add(w1);
        minList.add(w2);
        minList.add(w3);

        for (int i = 0; i < minList.size(); i++) {
            for (int j = i + 1; j < minList.size(); j++) {
                Weight temp1 = null;

                if (minList.get(i).getPounds() > minList.get(j).getPounds()) {
                    temp1 = minList.get(i);
                    minList.set(i, minList.get(j));
                    minList.set(j, temp1);
                }
            }
        }
        minWeight = minList.get(0);

//        System.out.println(minList);

        System.out.println("The minimum " + minWeight);
        return minWeight;
    }
    private Weight findMaximum(Weight w1, Weight w2, Weight w3) {
        Weight maxWeight;

        ArrayList<Weight> maxList = new ArrayList<Weight>() ;
        maxList.add(w1);
        maxList.add(w2);
        maxList.add(w3);

        for (int i = 0; i < maxList.size(); i++) {
            for (int j = i + 1; j < maxList.size(); j++) {
                Weight temp1 = null;

                if (maxList.get(i).getPounds() > maxList.get(j).getPounds()) {
                    temp1 = maxList.get(i);
                    maxList.set(i, maxList.get(j));
                    maxList.set(j, temp1);
                }
            }
        }

        maxWeight = maxList.get(maxList.size()-1);

//        System.out.println(maxList);

        System.out.println("The maximum " + maxWeight.toString());
        return maxWeight;
    }
    private Weight findAverage(Weight w1, Weight w2, Weight w3) {

        Weight totalWeight = w3.addTo(w2.addTo(w1));

        double oz = (int) (totalWeight.getOunces() / 3);
        int lbs = totalWeight.getPounds() / 3;

        Weight avgWeight = new Weight(lbs, oz);


        System.out.println("The average " + avgWeight.toString());
        return avgWeight;
    }


}