def list = [1, 2, 3, 4, 5]

println list.sum() //This will work fine

def mySum(list) {
  int sum = 0
  for (item in list) {
    sum += item
  }
  return sum
}

println mySum(list) // This will also work fine

// Now for the issue:

def anotherList = [1, "2", 3, 4, 5]

println anotherList.sum() // Throws MissingMethodException

println mySum(anotherList) // Throws MissingMethodException