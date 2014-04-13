##fibonacci function for python
def fib_helper(n, se):
    if (se[-1] >= n):
        return se[:-1]
    else:
        se.append(se[-1]+se[-2])
        return fib_helper(n, se)

def fib(n):
    if (n <= 0):
        return [1]
    elif (n == 1):
        return [1, 1]
    else:
        return fib_helper(n, [1,1])
