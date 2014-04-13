##returns the cesar cipher of a string shifted n places
##did it in one line for fun
def cesar(st, n):
    return ''.join(chr(((ord(c)-ord('a' if ord(c) in xrange(ord('a'), ord('z')) else 'A'))+n)%26+ord('a' if ord(c) in xrange(ord('a'), ord('z')) else 'A')) if (ord(c) in xrange(ord('a'), ord('z')) or ord(c) in xrange(ord('A'), ord('Z'))) else c for c in st)
