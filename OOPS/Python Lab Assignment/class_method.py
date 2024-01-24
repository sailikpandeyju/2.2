class Student:
    marks = 8

    def __init__(self, name):
        self.name = name

    def show(self):
        print(f"Name: {self.name}\nMarks: {self.marks}")

    @classmethod
    def change_marks(self, marks):
        self.marks = marks


a = Student("Sailik Pandey")
b = Student("Rudra Roy")

a.show()
b.show()

a.marks = 10

a.show()
b.show()

Student.change_marks(20)

a.show()
b.show()
