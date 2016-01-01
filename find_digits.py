#!/bin/python

import sys


def digit_factors(n):
    digits = str(n)
    num_div = 0
    for d in digits:
        #print n / int(d)
        #print int(d) * (n / int(d))
        if d != "0" and n == int(d) * (n / int(d)):
            #print "digit d", d
            num_div += 1
    print num_div
    
t = int(raw_input().strip())
for a0 in xrange(t):
    n = int(raw_input().strip())
    digit_factors(n)
