public class Employee extends Person {
    private Company company;
    public Employee(String name, Address address, Company company) {
        super(name, address);
        this.company = company;
    }
    public Company GetCompany() {
        return company;
    }
    public void SetCompany(Company company) {
        this.company = company;
    }
    public void MoveToCompany(Company newCompany) {
        company.RemoveEmployee(this);
        newCompany.AddEmployee(this);
    }
}