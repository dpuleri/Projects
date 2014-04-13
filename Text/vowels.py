import re
def vowels(strIn):
    strIn.lower()
    patFinder = re.compile('[aeiou]')
    vowels = re.findall(patFinder, strIn)
    aCount = 0
    eCount = 0
    iCount = 0
    oCount = 0
    uCount = 0
    for letter in vowels:
        if letter is 'a':
            aCount += 1
        elif letter is 'e':
            eCount += 1
        elif letter is 'i':
            iCount += 1
        elif letter is 'o':
            oCount += 1
        elif letter is'u':
            uCount += 1
    print('%d vowels' % len(vowels))
    print('%d As' % aCount)
    print('%d Es' % eCount)
    print('%d Is' % iCount)
    print('%d Os' % oCount)
    print('%d Us' % uCount)

f = open("D:\\Dropbox\\Coding\\SOTU.txt")
string = f.read()
vowels(string)
#vowels('Hello my name is Kalle Lane')
