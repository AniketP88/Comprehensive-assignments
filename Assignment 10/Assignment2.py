class Student:
    def __init__(self, name, grade, age):
        self.name = name
        self.grade = grade
        self.age = age

    def display(self):
        print(f"Name: {self.name}, Grade: {self.grade}, Age: {self.age}")


class School(Student):
    def school_student_display(self):
        super().display()



student = Student("Jack", "A", 19)

# Display student details 
print("Student Details:")
student.display()

# Create an instance of School 
school_student = School("Yash", "C", 20)

# Display school student details
print("\nSchool Student Details:")
school_student.school_student_display()
