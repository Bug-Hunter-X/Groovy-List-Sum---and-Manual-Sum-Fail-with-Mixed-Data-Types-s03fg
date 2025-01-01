def list = [1, 2, 3, 4, 5]

println list.sum() //This will work fine

def mySum(list) {
  int sum = 0
  for (item in list) {
    if(item instanceof Integer){
        sum += item
    } else if (item instanceof String) {
        sum += Integer.parseInt(item)
    }
  }
  return sum
}

println mySum(list) // This will also work fine

// Now for the fix of the issue:

def anotherList = [1, "2", 3, 4, 5]

println anotherList.sum({ it instanceof Integer ? it : Integer.parseInt(it) }) //Correct usage of sum() method

println mySum(anotherList) //Fixed to handle mixed type lists