package shukan_stanislaw.homework.lesson_18_homework;

class SalaryPlan {
    private int salaryBefore;
    private Double coefficient;
    private Double salaryAfter;

    public SalaryPlan(int salaryBefore, Double coefficient, Double salaryAfter) {
        this.salaryBefore = salaryBefore;
        this.coefficient = coefficient;
        this.salaryAfter = salaryAfter;
    }

    public int getSalaryBefore() {
        return salaryBefore;
    }

    public void setSalaryBefore(int salaryBefore) {
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

    public SalaryPlan() {
    }

}
