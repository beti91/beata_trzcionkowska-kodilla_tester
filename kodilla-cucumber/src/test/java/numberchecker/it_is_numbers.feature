Feature: What are the numbers?
  Numbers are

  Scenario Outline: Numbers are 3 or 5 or other
    Given Numbers could be divisible by <number>
    When I ask what is the number
    Then I should said <answer>
    Examples:
      | number | answer |
    | "Fizz" | "Buzz" |
  |"FizzBuzz" | "None" |


