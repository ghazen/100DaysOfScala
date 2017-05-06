import org.scalatest.FlatSpec
import Collections._

class CollectionsSpec extends FlatSpec {
  "Array" should "contain 0-2" in {
    for (i <- 0 to 2) assert(arrayOfSize3.contains(i))

    assert(arrayOfSize3(0) == 0)
    assert(arrayOfSize3(1) == 1)
    assert(arrayOfSize3(2) == 2)

    assert(arrayOfSize3.head == 0)
  }

  it should "be the same as applying given elements" in {
    assert(arrayOfSize3 sameElements arrayOfGivenElements)
  }

  "List" should "contain 0-2" in {
    for (i <- 0 to 2) assert(listOfGivenElements.contains(i))

    assert(listOfGivenElements(0) == 0)
    assert(listOfGivenElements(1) == 1)
    assert(listOfGivenElements(2) == 2)

    assert(listOfGivenElements.head == 0)
  }

  it should "be the same as appending elements" in {
    assert(listOfGivenElements == listOfAppends)
  }

  it should "be the same as appending lists" in {
    assert(listOfGivenElements == listOfAppendedLists)
  }

  it should "not mutate lists being appended" in {
    assert(listA == List(0, 1))
    assert(listB == List(2, 3))
  }

//  it should "not allowing mutating an immutable list" in {
////    listA = 9
//    mutable.List(1, 2)
//  }

  "==" should "does not compare arrays" in {
    //http://stackoverflow.com/questions/3737711/why-doesnt-arrays-function-return-true-for-array1-2-array1-2
    //Have to use `sameElements` instead
    val arrayComparison = arrayOfSize3 == arrayOfGivenElements
    assert(!arrayComparison)
  }

  "toString" should "not output arrays nicely" in {
    println(s"arrayOfSize3.toString = $arrayOfSize3")
    assert("[0, 1, 2]" != arrayOfSize3.toString)
  }

  it should "output lists nicely" in {
    assert("List(0, 1, 2, 3)" == listOfGivenElements.toString)
  }

  "Helper functions" should "sum all items" in {
    assert(arrayOfSize3.sum == 3)
    assert(listOfGivenElements.sum == 6)
  }

  it should "count items that meet criteria" in {
    assert(arrayOfSize3.count(_ > 1) == 1)
    assert(listOfGivenElements.count(_ > 1) == 2)
  }

  it should "filter items that meet criteria" in {
    assert(listOfGivenElements.filter(_ > 1) == List(2, 3))
  }

  it should "map all items to a new value" in {
    assert(listOfGivenElements.map(_ + 10) == List(10, 11, 12, 13))
  }

//todo:  "Tuples"
}
