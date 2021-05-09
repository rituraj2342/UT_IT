
import com.knoldus.validator.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class emailValidityTest extends AnyFlatSpec{

  "emailValidityTest" should "Verify if the emailId or not" in {

    val emailValidityObj = new EmailValidator
    assert(emailValidityObj.emailIdIsValid("rituraj!$&khare12345@gamil.com") == true)

  }}