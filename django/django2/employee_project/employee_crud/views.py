from django.shortcuts import render, get_object_or_404, redirect
from .models import Employee
from .forms import EmployeeForm  # Make sure you have imported the EmployeeForm

# View all employees
def employee_list(request):
    employees = Employee.objects.all()  # Get all employees
    return render(request, 'employee_crud/employee_list.html', {'employees': employees})

# Add new employee
def add_employee(request):
    if request.method == "POST":
        form = EmployeeForm(request.POST)
        if form.is_valid():
            form.save()  # Save the new employee
            return redirect('employee_list')  # Redirect to employee list page
    else:
        form = EmployeeForm()  # Create an empty form for GET request
    return render(request, 'employee_crud/add_employee.html', {'form': form})
    return render(request, 'employee_crud/add_employee.html', {'form': form})


# Edit employee
def edit_employee(request, pk):
    employee = get_object_or_404(Employee, pk=pk)  # Get the employee object
    if request.method == "POST":
        form = EmployeeForm(request.POST, instance=employee)
        if form.is_valid():
            form.save()  # Save the changes to the employee
            return redirect('employee_list')  # Redirect to employee list
    else:
        form = EmployeeForm(instance=employee)  # Load the existing employee data into the form
    return render(request, 'employee_crud/edit_employee.html', {'form': form})

# Delete employee
def delete_employee(request, pk):
    employee = get_object_or_404(Employee, pk=pk)  # Get the employee object
    if request.method == "POST":
        employee.delete()  # Delete the employee
        return redirect('employee_list')  # Redirect to employee list
    return render(request, 'employee_crud/confirm_delete.html', {'employee': employee})