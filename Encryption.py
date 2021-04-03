#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the encryption function below.
def encryption(s):
    ''' this function takes a string as parameter and encrypts it using the
    rule:
        1- remove the spaces
        2- find the lenght of the string after removing spaces
        3- make a grid with the height of floor(squareroot(strlen))
        and the width of ceil(squareroot(strlen))
        4- place the spaceless string into this grid
        5- transpose this grid
        6- the encrypted string is obtained now by reading this grid as rows
            and placing space character after every row
        '''
    s=s.split()
    st=''
    for i in s:
        st+=i
    
    strlen=len(st)
    row=math.floor(math.sqrt(strlen))   
    col=math.ceil(math.sqrt(strlen))
    
    lis = []
    while st:
        lis.append(st[:col])   
        st = st[col:]  
    lis2=[]
    stemp=''
    for i in range(0,col):
        for ch in lis:
            if(i<len(ch)):
                stemp+=ch[i] 
        lis2.append(stemp)
        stemp=''
    
    ret=' '.join(lis2)
        
    print(ret)
    
    return ret
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = encryption(s)

    fptr.write(result + '\n')

    fptr.close()
