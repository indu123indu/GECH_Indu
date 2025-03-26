from django.contrib import admin

# Register your models here.
# employee_crud/admin.py

from .models import Employee

admin.site.register(Employee)

