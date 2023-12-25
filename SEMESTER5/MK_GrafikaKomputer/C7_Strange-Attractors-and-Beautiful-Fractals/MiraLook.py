from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
from random import *
from numpy import *
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
  gluOrtho2D(-20.0, 20.0, -20.0, 20.0)
  # Set the matrix for the object we are drawing
  glMatrixMode(GL_MODELVIEW)
  glLoadIdentity()

def plotmira():
  glClear(GL_COLOR_BUFFER_BIT)
  # Initial values for parameters
  # This attractor is very sensitive
  # To the values for x, y, a, and b
  x = 12
  y = 0
  a = 0.301
  b = 0.9998
  c = 2 - 2*a
  w = a*x + c*x*x/(1+x*x)
  # Plot a significant number of points
  for n in arange(0,100000):
    z = x
    x = b*y + w
    u = x*x
    w = a*x + c*u/(1 + u)
    y = w - z
    # Don't plot anything until we've hit the attractor
    if n > 100:
      # How does this color statement work?
      glColor3f(sqrt(x*x + y*y)/15, 0.0, 0.0)
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
  glutCreateWindow("Plot Mira Look!")
  glutDisplayFunc(plotmira)
  glutKeyboardFunc(keyboard)
  init()
  glutMainLoop()

main()
