package Main;

import java.util.Comparator;

class Employee {
    public String name;
    public String surname;
    public int age;
    public int salary;

    public Employee(String name, String surname, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }



    @Override
    public String toString() {
        return name + "," + surname + "," + age + "," + salary;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (o == null || getClass() != o.getClass()) return false;
    //
    //     Employee employee = (Employee) o;
    //
    //     if (age != employee.age) return false;
    //     if (salary != employee.salary) return false;
    //     if (!name.equals(employee.name)) return false;
    //     return surname.equals(employee.surname);
    // }

    // @Override
    // public int hashCode() {
    //     int result = name.hashCode();
    //     result = 31 * result + surname.hashCode();
    //     result = 31 * result + age;
    //     result = 31 * result + salary;
    //     return result;
    // }

    // @Override
    // public int compareTo(Employee otherEmployee) {
    //     return CharSequence.compare(this.name, otherEmployee.name);
    // }
    // @Override
    // public int compareTo(Employee otherEmployee) {
    //     return CharSequence.compare(this.surname, otherEmployee.surname);
    // }
}

