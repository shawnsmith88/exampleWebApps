from django.shortcuts import render

from .models import example

# Create your views here.
def index(request):
    ex=example(text="Wassup", integer=25)
    ex.save()
    context={'example':example.objects.all()}
    return render(request,'myExample/index.html',context)