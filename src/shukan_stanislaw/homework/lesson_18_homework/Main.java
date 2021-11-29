package shukan_stanislaw.homework.lesson_18_homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Stanislaw\\IdeaProjects\\overone_it\\src\\shukan_stanislaw\\homework\\lesson_18_homework\\words_salary.txt");
        Scanner sc = new Scanner(file);
        List<String> keyNames = new ArrayList<>();
        List<String> lines = new ArrayList<>();
        List<Double> salaryAfter = new ArrayList<>();

        while (sc.hasNextLine()) {
            lines.add(sc.next());
        }
//        for (String line:lines) {
//            System.out.println(line);
//
//        }
        //заполнение листа имен-ключей
        for (int i = lines.indexOf("---") + 1; i < lines.size(); i++) {
            String[] names = lines.get(i).split("-");
            keyNames.add(names[0]);
        }
        Map<String, Integer> salaryBeforeMap = new HashMap<>();
        for (int j = 0; j < lines.indexOf("---"); j++) {
            String[] valueSalaryBefore = lines.get(j).split("-");
            salaryBeforeMap.put(valueSalaryBefore[0], Integer.parseInt(valueSalaryBefore[1]));
        }
        Map<String, Double> coefficientMap = new HashMap<>();
        for (int j = lines.indexOf("---") + 1; j < lines.size(); j++) {
            String[] valueCoefficient = lines.get(j).split("-");
            coefficientMap.put(valueCoefficient[0], Double.parseDouble(valueCoefficient[1]));
        }
//заполнение листа зарплат после повышения
        for (int j = 0; j < keyNames.size(); j++) {
            salaryAfter.add(salaryBeforeMap.get(keyNames.get(j)) * coefficientMap.get(keyNames.get(j)));
        }
//        for(Double qwe:salaryAfter){
//            System.out.println(qwe);
//        }
        Map<String, SalaryPlan> salaryPlanMap = new HashMap<>();

        SalaryPlan name1 = new SalaryPlan(salaryBeforeMap.get(keyNames.get(0)), coefficientMap.get(keyNames.get(0)), salaryAfter.get(0));
        SalaryPlan name2 = new SalaryPlan(salaryBeforeMap.get(keyNames.get(1)), coefficientMap.get(keyNames.get(1)), salaryAfter.get(1));
        SalaryPlan name3 = new SalaryPlan(salaryBeforeMap.get(keyNames.get(2)), coefficientMap.get(keyNames.get(2)), salaryAfter.get(2));
        SalaryPlan name4 = new SalaryPlan(salaryBeforeMap.get(keyNames.get(3)), coefficientMap.get(keyNames.get(3)), salaryAfter.get(3));
        SalaryPlan name5 = new SalaryPlan(salaryBeforeMap.get(keyNames.get(4)), coefficientMap.get(keyNames.get(4)), salaryAfter.get(4));
        SalaryPlan name6 = new SalaryPlan(salaryBeforeMap.get(keyNames.get(5)), coefficientMap.get(keyNames.get(5)), salaryAfter.get(5));
        SalaryPlan name7 = new SalaryPlan(salaryBeforeMap.get(keyNames.get(6)), coefficientMap.get(keyNames.get(6)), salaryAfter.get(6));

        salaryPlanMap.put(keyNames.get(0), name1);
        salaryPlanMap.put(keyNames.get(1), name2);
        salaryPlanMap.put(keyNames.get(2), name3);
        salaryPlanMap.put(keyNames.get(3), name4);
        salaryPlanMap.put(keyNames.get(4), name5);
        salaryPlanMap.put(keyNames.get(5), name6);
        salaryPlanMap.put(keyNames.get(6), name7);

        for(Map.Entry<String,SalaryPlan> qwe:salaryPlanMap.entrySet()){
            System.out.println("Name: "+ qwe.getKey()+", "+"salary before: "+ qwe.getValue().getSalaryBefore()+ ", "+"coefficient: "+ qwe.getValue().getCoefficient()+ ", "+"salary after: "+qwe.getValue().getSalaryAfter());
        }
    }
}