# String format methods
# 1) format with positional argument
#
# item = input("What did the boy eat: ")
# number = int(input("How many pieces did he eat: "))
#
# word = "the boy eat {} pieces of {}"
#
# print(word.format(number, item))
#2) format with keyword argument.


#full match.
import re

#pattern

#string collections

pattern = "29/04/2000"
ph_line = "764, 764, 7364"

result = "Match" if re.fullmatch(pattern, ph_line) else "Not Match"
#print(result)


#sub match.
student_record = f"Adeyemi Afees {23} 5.3inch single"
pattern = "5.3inch"

#replaced_result = re.sub(pattern, "6feet", student_record)
#print(replaced_result)

#\d format
replaced_result = re.sub(r"\d", "6 feets", student_record)
print(replaced_result)

#word boundary
sentence = "I was at the resturant yesterday and i at.e rice"

pattern = r"\bat\b"

print(re.findall(pattern, sentence))


#not word boundary
sentence = "I was at the resturant yesterday and i ate rice"

pattern = r"at\B"

print(re.findall(pattern, sentence))

#negate character set.
sentence = "I was at the resturant yesterday and i ate rice"

pattern = r"[es+]"
print(re.findall(pattern, sentence))

