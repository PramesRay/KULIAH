from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
from random import *
from numpy import *
from math import *
import sys

# Initial values of width and height
width = 600
height = 600

def init():
  # White background
  glClearColor(1.0, 1.0, 1.0, 0.0)
  # Ugly Purple Plot
  glColor3f(0.45, 0.3, 0.5)
  # Set the projection matrix... our "view"
  glMatrixMode(GL_PROJECTION)
  glLoadIdentity()
  # Set the plot window range
  gluOrtho2D(-1.0, 1.0, -1.0, 1.0)
  # Set the matrix for the object we are drawing
  glMatrixMode(GL_MODELVIEW)
  glLoadIdentity()

def plot3Body():
  a = 2.71
  glClear(GL_COLOR_BUFFER_BIT)
  for x in arange(0,1.0, 0.05):
    for y in arange(0,1.0, 0.05):
      for i in arange(1,1000):
        xx = x * cos(a) - (y-x*x)*sin(a)
        y = x*sin(a) + (y-x*x)*cos(a)
        x = xx
        if x > 1.0 or x < -1.0 or y > 1.0 or y < -1.0:
          break
        glColor3f(cos(i),sin(i),tan(i))
        glBegin(GL_POINTS)
        glVertex2f(x,y)
        glEnd()
      glFlush()

def keyboard(key, x, y):
  # Allows us to quit by pressing 'Esc' or 'q'
  if key == chr(27):
    sys.exit()
  if key == "q":
    sys.exit()

def main():
  glutInit(sys.argv)
  glutInitDisplayMode(GLUT_RGB|GLUT_SINGLE)
  glutInitWindowPosition(100,100)
  glutInitWindowSize(width,height)
  glutCreateWindow("Plot 3 Body!")
  glutDisplayFunc(plot3Body)
  glutKeyboardFunc(keyboard)
  init()
  glutMainLoop()
  
main()
