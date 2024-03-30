package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    private int f;
    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> filteredList = new ArrayList<>();
        for (Integer value : list) {
            if(value < f) {
                logger.log("Элемент \"" + value + "\" не проходит \n");
            } else {
                filteredList.add(value);
                logger.log("Элемент \"" + value + "\" проходит \n");
            }
        }
        int difference = list.size() - filteredList.size();
        logger.log("Прошло фильтр " + difference + " элемента из " + list.size() + "\n");
        return filteredList;
    }
}
