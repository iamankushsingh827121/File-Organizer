def parse(numbers):
    result =[]
    for number in numbers:
        result.append(number**2)
        return result
    numbers=[1,2,3]
    squared=parse(numbers)
    print(squared)