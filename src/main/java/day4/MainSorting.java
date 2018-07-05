package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSorting {
    public static void main(String[] args) {
        MainSorting p = new MainSorting();
        p.start();
    }

    private void start() {
        
        //create data
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Somkiat",200));
        employees.add(new Employee(2,"A",100));
        employees.add(new Employee(3,"B",300));
        employees.add(new Employee(4,"Prommajak",20));
        //employees.forEach(System.out::println);
        
        // Sorting comparator
       // Collections.sort(employees,new Comparator<Employee>() {

//            @Override
//            public int compare(Employee o1, Employee o2) {
//                // TODO Auto-generated method stub
//               // return o1.getName().compareTo(o2.getName());
//               //   return (o1.getSalary() - o2.getSalary() > 0)? -1 :0;
//                return (int)(o1.getSalary() - o2.getSalary());
//            }
            
            Comparator<Employee> withLambda =
                    (Employee o1 , Employee o2) -> 
                        (int)(o2.getSalary() - o2.getSalary());
                    Collections.sort(employees,  withLambda);
                    employees.forEach(System.out::println);
            }
        
        
        //employees.forEach(System.out::println);

        }

