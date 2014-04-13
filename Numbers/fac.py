##factorial function for python
def fac_helper(n, accum):
    if(n<=1):
        return accum
    else:
        return fac_helper(n-1, accum*n)
def fac(n):
    return fac_helper(n, 1)
