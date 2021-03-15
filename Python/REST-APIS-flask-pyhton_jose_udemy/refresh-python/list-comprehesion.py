numbers = [1, 3, 5]

doubled = []

for num in numbers:
    doubled.append(num * 2)


print(doubled)

doubled_comp = [num * 2 for num in numbers]

print(doubled_comp)

friends = [ "Rolf", "Sam", "Samantha", "Saurabh", "Jen"]

starts_s = []

for friend in friends:
    if friend.startswith("S"):
        starts_s.append(friend)

print(starts_s)


starts_s_comp = [friend for friend in friends if friend.startswith('S')]

print(starts_s_comp)