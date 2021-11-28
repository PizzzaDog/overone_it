package viktor_sa.homework.lesson17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CalculationSalary {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\savit\\Documents\\GitHub\\overone_it\\src\\viktor_sa\\homework\\lesson17\\salary_homework.txt");
        Scanner scan = new Scanner(file);

        List<String> lines = new ArrayList<>();
        Map<String, Integer> salariesBefore = new HashMap<>();
        Map<String, Double> coefficient = new HashMap<>();
        List<Double> salaryAfter = new ArrayList<>();
        Map<String, SalaryPlan> salaryPlanMap = new HashMap<>();
        List<String> name = new ArrayList<>();


        while (scan.hasNextLine()) {
            lines.add(scan.next());
        }

        for (int i = lines.indexOf("---") + 1; i < lines.size(); i++) {
            String[] keyValue = lines.get(i).split("-");
            name.add(keyValue[0]);
        }

        for (int k = 0; k < lines.indexOf("---"); k++) {
            String[] keyValue = lines.get(k).split("-");
            salariesBefore.put(keyValue[0], Integer.valueOf(keyValue[1]));
        }

        for (int i = lines.indexOf("---") + 1; i < lines.size(); i++) {
            String[] keyValue = lines.get(i).split("-");
            coefficient.put(keyValue[0], Double.valueOf(keyValue[1]));
        }
        salaryAfter.add(salariesBefore.get(name.get(0)) * coefficient.get(name.get(0)));
        salaryAfter.add(salariesBefore.get(name.get(1)) * coefficient.get(name.get(1)));
        salaryAfter.add(salariesBefore.get(name.get(2)) * coefficient.get(name.get(2)));
        salaryAfter.add(salariesBefore.get(name.get(3)) * coefficient.get(name.get(3)));
        salaryAfter.add(salariesBefore.get(name.get(4)) * coefficient.get(name.get(4)));

        SalaryPlan salaryPeoples1 = new SalaryPlan(salariesBefore.get(name.get(0)), coefficient.get(name.get(0)), salaryAfter.get(0));
        SalaryPlan salaryPeoples2 = new SalaryPlan(salariesBefore.get(name.get(1)), coefficient.get(name.get(1)), salaryAfter.get(1));
        SalaryPlan salaryPeoples3 = new SalaryPlan(salariesBefore.get(name.get(2)), coefficient.get(name.get(2)), salaryAfter.get(2));
        SalaryPlan salaryPeoples4 = new SalaryPlan(salariesBefore.get(name.get(3)), coefficient.get(name.get(3)), salaryAfter.get(3));
        SalaryPlan salaryPeoples5 = new SalaryPlan(salariesBefore.get(name.get(4)), coefficient.get(name.get(4)), salaryAfter.get(4));


        salaryPlanMap.put(name.get(0), salaryPeoples1);
        salaryPlanMap.put(name.get(1), salaryPeoples2);
        salaryPlanMap.put(name.get(2), salaryPeoples3);
        salaryPlanMap.put(name.get(3), salaryPeoples4);
        salaryPlanMap.put(name.get(4), salaryPeoples5);


        salaryPlanMap.forEach((String, SalaryPlan) -> System.out.println("Name: " + String + ", salary before: " + SalaryPlan.getSalaryBefore() + ", salary coefficient: " + SalaryPlan.getCoefficient() + ", salary after: " + SalaryPlan.getSalaryAfter()));

    }


}
