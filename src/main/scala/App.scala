import org.apache.log4j.Logger

object App {
  def main(args: Array[String]): Unit = {

    val logger = Logger.getLogger("App")
    logger.error("ERROR Message")
    logger.trace("TRACE Message")
    logger.debug("DEBUG Message")
    logger.info("INFO Message")

    println(makeMessage())
    System.exit(0)
  }

  def makeMessage() : String = "App.main()"

}
