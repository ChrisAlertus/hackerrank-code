#!/bin/python

import sys

# function that performs the elemnt rotation on the matrix
# takes (listof int) , int , int , int, int -> (listof int)
# Purpose: performs the required rotation
# rs: index of the starting row to be rotated, re : index of ending row
# cs: index of starting column , ce: index of ending column
def rotate_grid(grid,rs,re,cs,ce,M,N):
    saved_first = 0
    for i in range(rs,re):
        # First row
        if i == rs:
            # Saving first element
            saved_first = grid[rs][cs]
            # Shifting middle elemnts
            for idx in range(cs,ce-1):
                grid[i][idx] = grid[i][idx+1]
            # Last element from row below
            grid[i][ce-1] = grid[i+1][ce-1]
        # Middle rows
        elif i < re -1:
            # extracting first element
            tmp = grid[i][cs]
            # shifting first element from row above
            grid[i][cs] = saved_first
            # saving new first element to the variable
            saved_first= tmp
            # moving last element
            #print i, ce, i+1
            grid[i][ce-1] = grid[i+1][ce-1]
        # Last row
        elif i == re -1:
            #Shift elements right
            for idx in sorted(range(cs+1,ce),reverse=True):
                grid[i][idx] = grid[i][idx-1]
            # input the first element
            grid[i][cs] = saved_first
        # end if
        #print grid[i] , saved_first,
    # end row loop                    
    return grid
    
# Number of rotations
# call the algorithm multiple times
def matrix_rotation():
    params = raw_input().strip().split()
    M = int(params[0])
    N = int(params[1])
    R = int(params[2])

    grid = []
    grid_i = 0
    for grid_i in xrange(M):
        grid_t = raw_input().strip().split()
        grid.append(grid_t)
        #print grid_t
        #print grid
    # Rotate each of the layers of the matrix
    for rotations in range(R):
        rs = 0
        re = M
        cs = 0
        ce = N
        #print M, N,R,rs,re,cs,ce
        # Loop until rotating innermost layer
        while re - rs >= 1 and ce - cs >= 1:
            #print "grid"
            grid = rotate_grid(grid,rs,re,cs,ce,M,N)
            #print "grid", grid
            #print "rotated"
            # Decrease start points of rotation one layer at a time
            rs += 1
            re -= 1
            cs += 1
            ce -= 1
    
    for grid_i in xrange(M):
        print_row = ""
        for grid_j in xrange(N):
            if grid_j == 0:
                print_row += str(grid[grid_i][grid_j])
            else:
                print_row += " " + str(grid[grid_i][grid_j])
        print print_row

matrix_rotation()
