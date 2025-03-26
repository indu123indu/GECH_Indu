from django.contrib import admin
from django.urls import path, include
from django.shortcuts import redirect

# Redirect the home page ("/") to "/employees/"
def home_redirect(request):
    return redirect('employee_list')  # Ensure 'employee_list' exists in urls.py

urlpatterns = [
    path('admin/', admin.site.urls),
    path('employees/', include('employee_crud.urls')),
    path('', home_redirect),  # ✅ Add this line
]
