#!/bin/python

import sys


n = int(raw_input().strip())
grid = []
grid_i = 0
for grid_i in xrange(n):
   grid_t = str(raw_input().strip())
   grid.append(grid_t)

new_grid = [""]*len(grid)
for row in range(n):
    for col in range(n):
        #cell = row*n + col
        if col > 0 and col < n-1 and row < n-1 and row > 0:
            num_bigger = 0
            if grid[row][col] > grid[row][col - 1]:
                num_bigger += 1
            if grid[row][col] > grid[row][col + 1]:
                num_bigger += 1
            if grid[row][col] > grid[row-1][col]:
                num_bigger += 1
            if grid[row][col] > grid[row+1][col]:
                num_bigger += 1
            #print num_bigger
            if num_bigger == 4:
                new_grid[row] += "X"
            else:
                new_grid[row] += grid[row][col]
        else:
            #print len(new_grid) , len(grid), cell, grid
            new_grid[row] += grid[row][col]
        #print new_grid[row]
for row in new_grid:
    print row
