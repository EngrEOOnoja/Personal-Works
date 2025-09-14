def calculate_student_grades():
    number_of_students = int(input("Enter Number of Students: "))
    number_of_subjects = int(input("Enter Number of Subjects: "))

    student_names = []
    student_grades = []

    # Input student data
    for index in range(number_of_students):
        student_name = input(f"Student {index + 1} Name: ")
        student_names.append(student_name)

        grades = []
        for count in range(number_of_subjects):
            while True:
                grade_input = input(f"Enter grade for Subject {count + 1}: ")
                try:
                    grade = float(grade_input)
                    if 0 <= grade <= 100:
                        grades.append(grade)
                        break
                    else:
                        print("Score must be between 0 and 100. Try again.")
                except ValueError:
                    print("Invalid input. Please enter a numeric value.")
        student_grades.append(grades)

    # Calculate averages
    student_averages = [sum(grades) / number_of_subjects for grades in student_grades]

    
   positions = [1] * number_of_students  # Everyone starts at rank 1

for student_i in range(number_of_students):
    for student_j in range(number_of_students):
        if student_averages[student_i] < student_averages[student_j]:
            positions[student_i] += 1
            
     highest_scores = []
    lowest_scores = []
    pass_counts = []

    for j in range(number_of_subjects):
        subject_scores = [student_grades[i][j] for i in range(number_of_students)]
        highest_scores.append(max(subject_scores))
        lowest_scores.append(min(subject_scores))
        pass_counts.append(sum(1 for score in subject_scores if score >= 50))

    # Most/least passed subjects
    max_pass = max(pass_counts)
    min_pass = min(pass_counts)
    most_passed_subjects = [i + 1 for i, count in enumerate(pass_counts) if count == max_pass]
    least_passed_subjects = [i + 1 for i, count in enumerate(pass_counts) if count == min_pass]

    
    max_avg = max(student_averages)
    min_avg = min(student_averages)
    best_students = [student_names[i] for i, avg in enumerate(student_averages) if avg == max_avg]
    worst_students = [student_names[i] for i, avg in enumerate(student_averages) if avg == min_avg]

    
    print('===============================================')
    print("\nStudent\t\t", end='')
    for j in range(number_of_subjects):
        print(f"Sub{j + 1}\t", end='')
    print("Ave\tPos")
    print('===============================================')
    # Print student data in original order
    for i in range(number_of_students):
        name = student_names[i]
        if len(name) < 8:
            name += '\t'
        print(f"{name}\t", end='')
        for j in range(number_of_subjects):
            print(f"{student_grades[i][j]:.1f}\t", end='')
        print(f"{student_averages[i]:.2f}\t{positions[i]}")
    print('===============================================')

  
    print("\nHighest\t\t", end='')
    for score in highest_scores:
        print(f"{score:.1f}\t", end='')
    print()
    print('===============================================')

    print("Lowest\t\t", end='')
    for score in lowest_scores:
        print(f"{score:.1f}\t", end='')
    print()
    print('===============================================')

    print("Pass Count\t", end='')
    for count in pass_counts:
        print(f"{count}\t", end='')
    print()
    print('===============================================')

    
    print("\nMost Passed Subject(s):\t", ', '.join([f"Subject {s}" for s in most_passed_subjects]), f"with {max_pass} passes")
    print("Least Passed Subject(s):", ', '.join([f"Subject {s}" for s in least_passed_subjects]), f"with {min_pass} passes")
    print("Best Student(s):\t", ', '.join(best_students), f"with average {max_avg:.2f}")
    print("Worst Student(s):\t", ', '.join(worst_students), f"with average {min_avg:.2f}")
    print('-------------------------------------------------')
    print('===============================================')


calculate_student_grades()