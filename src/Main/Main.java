package Main;

import java.io.*;
import java.sql.Array;
import java.util.*;

class Main {
    static ArrayList<Employee> employees = new ArrayList<Employee>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 9;
        while(option != 5) {
            File employeesFile = new File("./data/employees.csv");

            System.out.println("Enter option number \n " +
                    "1. Read files \n " +
                    "2. Add files \n " +
                    "3. Delete files \n " +
                    "4. Sort files \n " +
                    "5. Exit \n " +
                    "Option selection number: ");
            option = Integer.parseInt(sc.nextLine());



            switch (option) {
                case 1:
                    readFiles(employeesFile);

                    break;
                case 2:
                    employees.clear();
                    readFiles(employeesFile);
                    addFiles(employeesFile);
                    break;
                case 3:
                    employees.clear();
                    readFiles(employeesFile);
                    deleteFiles(employeesFile);
                case 4:
                    employees.clear();
                    readFiles(employeesFile);
                    sortFiles(employeesFile);
                    break;
                case  5:
                    break;
                default:
                    System.err.println("Wrong option!");
                    break;
            }
        }
    }
    static void readFiles(File employeesFile) {
        try {
            FileReader reader = new FileReader(employeesFile);
            BufferedReader erd = new BufferedReader(reader);
            String fileLines = erd.readLine();
            while (fileLines != null) {
                String[] splitString = fileLines.split(",");
                Employee employee = new Employee(splitString[0], splitString[1], Integer.parseInt(splitString[2]), Integer.parseInt(splitString[3]));
                employees.add(employee);
                fileLines = erd.readLine();
                System.out.println(Arrays.toString(splitString));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void addFiles(File employeesFile){
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String name = scc.nextLine();
        System.out.println("Enter employee last name: ");
        String lastName = scc.nextLine();
        System.out.println("Enter employee age: ");
        int age = scc.nextInt();
        System.out.println("Enter employee salary: ");
        int salary = scc.nextInt();
        employees.add(new Employee(name, lastName, age, salary));
        System.out.println(employees);

    writeFile(employeesFile);


    }
    static void writeFile(File employeesFile){
        try {
            FileWriter write = new FileWriter(employeesFile);
            BufferedWriter ewr = new BufferedWriter(write);
            for (int i = 0; i <employees.size() ; i++) {
                ewr.write(String.valueOf(employees.get(i))+"\n");
            }

            ewr.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void sortFiles(File employeesFile) {
        Scanner search = new Scanner(System.in);
        System.out.println("Enter parameter you would like to sort: \n" +
                "1. Name \n" +
                "2. Last name \n" +
                "3. Age \n" +
                "4. Salary \n" +
                "Choose paramater number:");
        int param = search.nextInt();
        switch (param){
            case 1:
                employees.sort(Comparator.comparing(a -> a.name));
                break;
            case 2:
                employees.sort(Comparator.comparing(a -> a.surname));
                break;
            case 3:
                employees.sort(Comparator.comparing(a -> a.age));
                break;
            case 4:
                employees.sort(Comparator.comparing(a -> a.salary));
                break;
            default:
                System.out.println("Wrong param!!!");
        }

        writeFile(employeesFile);
    }
    static void deleteFiles(File employeesFile){
        Scanner scDelEmp = new Scanner(System.in);
        System.out.println("Enter row index you would like to delete: ");
        int delIndex = scDelEmp.nextInt();
        employees.remove(delIndex-1);
        writeFile(employeesFile);
    }
    static void searchFiles(File employeesFile){
        // Scanner search = new Scanner(System.in);
        // System.out.println("Enter employee name you would like to find: ");
        // String name = search.nextLine();
        // for (int i = 0; i <employees.size() ; i++) {
        //     if(employees.)
        // }
        // System.out.println(employees);
    }
}


