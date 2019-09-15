from django.db import models

# Create your models here.
class example(models.Model):
    text=models.CharField(max_length=200)
    integer=models.IntegerField(default=0)
