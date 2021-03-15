
# Django
from django.http import HttpResponse

#Utilities
from datetime import datetime
import json



def hello_world(request):
    return HttpResponse('Oh hi! Current server time is {now}'.format(
        now=datetime.now().strftime('%b %dth, %Y -%H:%M hrs')
    ))

def sort_integers(request):
    """Return a JSON response with sorted integers"""
    # utiliza pdb para lanzar un debugger en la consola
    # import pdb; pdb.set_trace()
    numbers = [int(i) for i in request.GET['numbers'].split(',')]
    sorted_ints = sorted(numbers)
    #import pdb; pdb.set_trace()
    data = {
        'status': 'ok',
        'numbers': sorted_ints,
        'message': 'Integers sorted successfully'
    }
    return HttpResponse(json.dumps(data, indent=4),
     content_type='application/json'
    )

def say_hi(request, name, age):
    """Return a greeting"""
    if age < 12:
        message = 'Sorry {} yo are not allowed here'.format(name)
    else:
        message = 'Hello {} Welcome to platzigram'.format(name)

    return HttpResponse(message)