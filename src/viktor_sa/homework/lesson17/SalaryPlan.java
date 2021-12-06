package viktor_sa.homework.lesson17;

public class SalaryPlan {
    Integer salaryBefore;
    Double coefficient;
    Double salaryAfter;

    public SalaryPlan(Integer salaryBefore, Double coefficient, Double salaryAfter) {
        this.salaryBefore = salaryBefore;
        this.coefficient = coefficient;
        this.salaryAfter = salaryAfter;
    }

    public Integer getSalaryBefore() {
        return salaryBefore;
    }

    public void setSalaryBefore(Integer salaryBefore) {
        this.salaryBefore = salaryBefore;
    }

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    public Double getSalaryAfter() {
        return salaryAfter;
    }

    public void setSalaryAfter(Double salaryAfter) {
        this.salaryAfter = salaryAfter;
    }
}
