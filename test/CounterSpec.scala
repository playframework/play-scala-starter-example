import org.scalatestplus.play._

import scala.collection.mutable
import services.Counter

/** Example of test for Guice-injected component. */
class CounterSpec extends PlaySpec with OneAppPerSuite {

  "Counter component" should {

    "resolve implementation and produce increasing values" in {
      val counter: Counter = app.injector.instanceOf[Counter]
      counter.nextCount() mustBe 0
      counter.nextCount() mustBe 1
      counter.nextCount() mustBe 2
    }
  }
}
