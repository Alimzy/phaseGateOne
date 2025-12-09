my_lists = []
while True:

    menu = """
        WELCOME TO ALIMZY GROCERY APP
    1. Add Items
    2. Remove Items
    3. show all available item
    4. Exit
    """
    print(menu)

    menu = int(input("Enter options: "))
    
    
    match menu:
        case 1:
            input_number = int(input("How many items do you want to add sir/ma: "))
            for items in range(input_number):           
                add_input = input("Add items sir/ ma: ").lower()             
                my_lists.append(add_input)
            print("Item succesfully Added")
        case 2:           
            input_number = int(input("How many items do you want to remove sir/ ma"))
            for items in range(input_number):
                remove_book = input("Remove items sir/ ma:").lower()
                if remove_book in my_lists:                               
                    my_lists.remove(remove_book)
                print("items succesfully removed")
                else:
                    print("cannot find grocery list sir/ma. Check again!")
                
        case 3:           
            print(my_lists)
        case 4:
            break
                 
    


