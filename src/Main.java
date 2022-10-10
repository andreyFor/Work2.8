public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.createNewEmployee("Chyort Poganiy", 2, 124245);
        employeeBook.createNewEmployee("Bald Guy", 1, 6000000);
        employeeBook.findAllEmployeers();
        employeeBook.findEmployee(1);
    }
}