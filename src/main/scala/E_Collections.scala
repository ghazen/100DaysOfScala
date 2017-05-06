object Collections {

  /** Arrays **/
  val arrayOfSize3 = new Array[Int](3)
  // Note you can edit what's in the array
  arrayOfSize3(0) = 0
  arrayOfSize3(1) = 1
  arrayOfSize3(2) = 2

  val arrayOfGivenElements = Array.apply(0, 1, 2)

  /** Lists **/
  val listOfGivenElements = List(0, 1, 2, 3)

  val listOfAppends = 0 :: 1 :: 2 :: 3 :: Nil

  val listA = List(0, 1)
  val listB = List(2, 3)
  val listOfAppendedLists = listA ::: listB

  /** Tuples **/
  val tuple2 = ("first", "second")
  val tuple5 = ("one", 2, "three", 4, "five")
}
