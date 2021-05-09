import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
import org.scalatest.flatspec.AnyFlatSpec

class employeeValidityTest extends AnyFlatSpec{

  "employeeValidityTest" should "verify if employee is valid or not" in {

    val employeeValidityObj = new EmployeeValidator
    assert(employeeValidityObj.employeeIsValid(Employee("rituraj","khare",24,5000,"Intern","Knoldus","rituraj.khare@knoldus.com")) == true)

  }}