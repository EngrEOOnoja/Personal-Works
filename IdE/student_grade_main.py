from student_grade import *

def main():

    scored = int(input("What is your score? "))
    while scored < 0 or scored > 100:
        print("Please enter a number between 0 and 100")
        scored = int(input("What is your score? "))
    result = get_score(scored)
    calculated_grade = get_calculate_grade(result)
    feedback = get_feedback(calculated_grade)
    print(f"score: {scored}, calculated grade: {calculated_grade}, feedback: {feedback}")
main()
