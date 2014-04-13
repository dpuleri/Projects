##returns the cesar cipher of a string shifted n places
##did it in one line for fun
def cesar(st, n):
    return ''.join(chr(ord(c) + (-(n%25) if ord(c)+(n%25) > (ord('z') or ord('Z')) else (n%25))) for c in st)
