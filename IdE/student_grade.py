def get_score(score):
    return score



def get_calculate_grade(score):
    if score >= 70 and score <= 100:
        return "A"
    elif score >= 60 and score <= 70:
        return "B"
    elif score >= 50 and score <= 60:
        return "C"
    elif score >= 40 and score <= 50:
        return "D"
    elif score >= 30 and score <= 40:
        return "E"
    elif score >= 20 and score <= 30:
        return "F"


def get_feedback(score):
    if score == "A":
        return "A"
    elif score == "B":
        return "B"
    elif score == "C":
        return "C"
    elif score == "D":
        return "D"
    elif score == "E":
        return "E"
