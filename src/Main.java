import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        List<Integer> intList = Arrays.asList(10,28,87,20,10,20,76,80,80,80);
//        intList.stream().filter(x->x>25)
//                        .forEach(x-> System.out.print(" "+x));
//        System.out.println(" ");
//        List<Integer> intList3 = intList.stream().filter(x-> x>25).collect(Collectors.collectingAndThen(Collectors.toList(),
//                                                              list->{Collections.reverse(list);
//                                                                      return list;}));
//
//        System.out.println(intList3);

//        Collections.reverse(intList);
//        System.out.println(intList);

//        Optional<Integer> minValue = intList.stream().min((i1, i2)->i2-i1);
//        System.out.println(minValue);
//        int minValue1 = intList.stream().mapToInt(x->x).summaryStatistics().getMin();
//        System.out.println(minValue1);


//        Set<Integer> intSet = new HashSet<>();

//        intList.stream().filter(e->!intSet.add(e)).collect(Collectors.toSet()).forEach(xx-> System.out.println(xx));

//        intList.stream().sorted(Comparator.reverseOrder()).forEach(x-> System.out.println(x));

//     ////////////////////////////////////      STRING QUESTIONS       //////////////////////////////////////////////////
//        String original ="smkms";
//        String str2="";
//        List<Character> str3 =Arrays.asList(str.toCharArray());
//        System.out.println(Arrays.asList(str.toCharArray()));
//        List<String> str3 = Arrays.asList(str.toCharArray()).stream().map(x->x+str2).peek(x-> System.out.println(x)).collect(Collectors.toList());
//        System.out.println(str3);
//        str.chars()
//           .mapToObj(c -> (char) c)    // Convert int (ASCII) to Character
//           .map(x -> String.valueOf(x) + str2)  // Proper string concatenation
//           .forEach(x -> System.out.println(x));  // Print
//
//        System.out.println(str2);

//        String reversed
//                if( IntStream.range(0, original.length())
//                .mapToObj(i -> original.charAt(original.length() - i - 1))
//                .map(String::valueOf)
//                .collect(Collectors.joining()).equals(original)) System.out.println("palidrome");
//                else
//                    System.out.println("not a palidrome");;

//        System.out.println(reversed);

//        String str = "My name is Siddharth";
//        List<String> strList=Arrays.asList(str.split(" "));
//
//        String strRev= IntStream.rangeClosed(1,strList.size())
//                .mapToObj(i->strList.get(strList.size()-i))
//                .collect(Collectors.joining(" "));
//
//        System.out.println(strRev);

//        String str3 ="Eminem";
//
//        String str4 = str3.chars().
//                      mapToObj(x->(char)x)
//                      .map(x->String.valueOf(x))
//                .collect(Collectors.collectingAndThen(Collectors.toList(),list->{
//                                                  Collections.reverse(list);
//                                                  return list.stream();
//                }))
//                .collect(Collectors.joining())
//                ;
//        System.out.println(str4);

//       ///////////////////////////////      Object Type Practice       ///////////////////////////

        Employee emp1 = new Employee(1,"Siddharth",25,30000);
        Employee emp2 = new Employee(3,"Kuldeep",23,28000);
        Employee emp3 = new Employee(2,"Priya",26,31000);
        Employee emp4 = new Employee(5,"Shivam",28,39000);
        Employee emp5 = new Employee(4,"Kunal",18,29000);
        Employee emp6 = new Employee(11,"Vipul",44,30000);
        Employee emp7 = new Employee(2,"Priya",26,31000);
        Employee emp8 = new Employee(18,"Priya",26,31000);

        List<Employee> empList = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp3,emp3,emp7);

//        List<Employee> sortedList = empList.stream().sorted((e1,e2)->e2.getSalary()-e1.getSalary()).skip(1).limit(2).collect(Collectors.toList());
//        sortedList.forEach(x-> System.out.println(x));

//        Employee minSalaryEmp = empList.stream().min((e1,e2)->e1.salary-e2.salary).get();
//        System.out.println(minSalaryEmp);

//          Set<Employee> empSet = new HashSet<>();
//
//          empList.stream().filter(e->!empSet.add(e)).forEach(x-> System.out.println(x));

            empList.stream().distinct().forEach(x-> System.out.println(x));

    }
}