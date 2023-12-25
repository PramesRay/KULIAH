# PyFunc.py
# Plotting functions
from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
from numpy import *
import sys

def init():
  glClearColor(1.0, 1.0, 1.0, 1.0)
  gluOrtho2D(-2.0, 2.0, -2.0, 2.0)

def plotfunc():
  glClear(GL_COLOR_BUFFER_BIT)
  glColor3f(0.0, 0.0, 0.0)
  glPointSize(1.0)

  # Plot the coordinate axes
  glBegin(GL_LINES)
  glVertex2f(-2.0, 0.0)
  glVertex2f(2.0, 0.0)
  glVertex2f(0.0, 2.0)
  glVertex2f(0.0, -2.0)
  glEnd()
  # Plot the parametric equations

  a = 2.0
  b = 1.0
  c = 1.5
  d = 3.5
  e = 6.0
  
  for a in arange(0.1, 2.0, 0.1):
    for t in arange(-200.0, 200.0, 0.005):
      x = sin(0.99*t) - 0.7*cos(3.01*t)
      y = cos(1.01*t) + 0.1*sin(15.03*t)

      glBegin(GL_POINTS)
      glVertex2f(x, y)
      glEnd()
      glFlush() 
# End plotfunc()
  
def main():
  glutInit(sys.argv)
  glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB)
  glutInitWindowPosition(50,50)
  glutInitWindowSize(400,400)
  glutCreateWindow("Function Plotter")
  glutDisplayFunc(plotfunc)

  init()
  glutMainLoop()
  
main()

# End of program