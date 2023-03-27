import java.util.ArrayList;

public class Company {
    private String name;
    private Address address;
    private ArrayList<Employee> employees;
    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
        this.employees = new ArrayList<>();
    }
    public String GetName() {
        return name;
    }
    public void SetName(String name) {
        this.name = name;
    }
    public Address GetAddress() {
        return address;
    }
    public void SetAddress(Address address) {
        this.address = address;
    }
    public ArrayList<Employee> GetEmployees() {
        return employees;
    }
    public void SetEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    public void AddEmployee(Employee employee) {
        employee.SetCompany(this);
        employees.add(employee);
    }
    public void RemoveEmployee(Employee employee) {
        employees.remove(employee);
        employee.SetCompany(null);
    }
    public ArrayList<Address> ListEmployeesAddresses(Address address, ArrayList<Company> companies) {
        for (Company company : companies) {
            if (company.GetAddress().equals(address)) {
                ArrayList<Address> addresses = new ArrayList<>();
                for (Employee employee : employees) {
                    addresses.add(employee.GetAddress());
                }
                return addresses;
            }
        }
        return null;
    }
    public ArrayList<Employee> ListEmployees(String name, ArrayList<Company> companies) {
        for (Company company : companies) {
            if (company.GetName().equals(name)) {
                return employees;
            }
        }
        return null;
    }
}