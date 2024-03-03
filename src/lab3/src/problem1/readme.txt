Reason:
- The issue come to in the Person class, the equals method checks only the equality of names, but
in the PersonWithJob class the equals method checks the equality of names and salary.

--> I replaced inheritance with composition, and I added the equals method in the Person class to check the equality of names and salary.