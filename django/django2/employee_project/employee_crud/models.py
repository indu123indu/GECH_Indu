from django.db import models

class Employee(models.Model):
    first_name = models.CharField(max_length=100)
    last_name = models.CharField(max_length=100)
    email = models.EmailField(unique=True)
    phone = models.CharField(max_length=15, blank=True, null=True)
    department = models.CharField(max_length=100, blank=True, null=True)
    salary = models.DecimalField(max_digits=10, decimal_places=2)
    hire_date = models.DateField(auto_now_add=True)

    def __str__(self):  # ✅ Fixed str method
        return f"{self.first_name} {self.last_name}"
