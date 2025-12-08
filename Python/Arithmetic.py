import random;


print("solve this subtraction equation")

count = 0

for counter in range(1,11):
    first_digit = random.randint(100,200)
    second_digit = random.randint(1,99)

#    if second_digit > first_digit:
#        subtraction = second_digit - first_digit 
#        print(second_digit, "-", first_digit)
#    elif:
    subtraction = first_digit - second_digit
    
    print(first_digit, "-", second_digit)

        answer = input("Enter an answer: ")
    
    if (answer == subtraction):
         print("You are correct")
         count += 1     
    elif(answer != subtraction):       
        print("You are incorrect")
        answer = input("Enter an answer: ")

if count > 5:
    print("your final score is: ", count , "impressive!!!") 
else:
    print("your final score is: ", count, "poor!!!")   
    



    
   
