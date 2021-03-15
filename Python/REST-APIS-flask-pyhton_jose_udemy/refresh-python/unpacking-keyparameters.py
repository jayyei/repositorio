def named(**kwargs):
    print(kwargs)


named(name="Bob", age=25)

details = {"name": "Bob", "age": 25}

named(**details)