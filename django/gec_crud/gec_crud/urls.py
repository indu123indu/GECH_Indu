from django.contrib import admin
from django.urls import path, include  # Correct import

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', include('std_crud.urls')),  # Include app-level URLs
]
