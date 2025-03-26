from django.shortcuts import render, redirect
from . import models, forms

def home(request):
    if request.method == "POST":
        std_form = forms.StudentForm(request.POST)
        if std_form.is_valid():
            std_form.save()
        student_form = forms.StudentForm()  # Reinitialize form after saving
    else:
        student_form = forms.StudentForm()

    students = models.Student.objects.all()
    context = {"students": students, "student_form": student_form}
    return render(request, "home.html", context)

def edit(request, id):
    student = models.Student.objects.get(id=id)  # Fetch the student object
    if request.method == "POST":
        std_form = forms.StudentForm(request.POST, instance=student)
        if std_form.is_valid():  # Fix: Use std_form instead of form
            std_form.save()
            return redirect(home)
    else:
        std_form = forms.StudentForm(instance=student)  # Fix: Correct variable name
    context = {"student_form": std_form}  
    return render(request, "edit.html", context)

def delete(request, id):
    student = models.Student.objects.get(id=id)
    if request.method == "POST":
        student.delete()
        return redirect(home)
    context = {"student": student}  
    return render(request, "delete.html", context)