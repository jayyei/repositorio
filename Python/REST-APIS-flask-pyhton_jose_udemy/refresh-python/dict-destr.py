users = [
    (0, "Bob", "password"),
    (1, "Rolf", "bob123"),
    (2, "Jose", "longpassword"),
    (3, "username", "1234")
]


username_mapping = {user[1]: user for user in users}

print(username_mapping)