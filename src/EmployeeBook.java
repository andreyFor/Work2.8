import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    Map<Integer, Employee> arr = new HashMap<>();

    public void createNewEmployee(String fullName, int department, double salary) {
        Employee employee = new Employee(fullName, department, salary);
        if (!arr.containsValue(employee)) {
            arr.put(employee.getId(), employee);
            System.out.println(employee.getFullName() + " добавлен в список.");
        } else {
            System.err.println("Error. This person already exists");
        }
    }

    public void deleteEmployee(Integer id) {
        if (arr.containsKey(id)) {
            arr.remove(id);
        } else {
            System.err.println("Error. This person isn't exists");
        }
    }

    public void changeParametersEmployee(Integer id, String fullName, int department, double salary) {
        Employee employee = new Employee(fullName, department, salary);
        if (arr.containsKey(id)) {
            arr.put(id, employee);
            System.out.println(employee.getFullName() + " успешно изменен. Новое id - " + employee.getId());
        } else {
            System.err.println("Такого Id не существует.");
        }
    }

    public void findAllEmployeers() {
        System.out.println(arr);
    }

    public void findEmployee(Integer id) {
        if (arr.containsKey(id)) {
            System.out.println(arr.get(id) + " найден.");
        }
    }
}