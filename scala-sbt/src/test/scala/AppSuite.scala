import org.scalatest.FunSuite

class AppSuite extends FunSuite {

  test("App makeMessage should return the name of the main method") {
    val result = App.makeMessage()
    assert(result == "App.main()")
  }

}
