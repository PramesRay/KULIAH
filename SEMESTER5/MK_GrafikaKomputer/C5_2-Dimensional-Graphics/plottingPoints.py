# PyPoints.py
# Setting a coordinate system with central origin
from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
import sys

def init():
  glClearColor(0.0, 0.0, 0.0, 1.0)
  gluOrtho2D(-1.0, 1.0, -1.0, 1.0)

# def plotpoints():
#   glClear(GL_COLOR_BUFFER_BIT)
#   glColor3f(1.0, 1.0, 1.0)

#   glPointSize(2.0)
#   glBegin(GL_POINTS)
#   glVertex2f(0.0, 0.0)
#   glVertex2f(0.1, 0.2) 
#   glVertex2f(1.0, 1.0) 

#   glEnd()
#   glFlush()

def plotpoints():
  glClear(GL_COLOR_BUFFER_BIT)

  # First draw x and y axes
  # Using black as a color
  glColor3f(1.0, 1.0, 1.0)
  
  glBegin(GL_LINES)
  glVertex2f(-1.0, 0.0)
  glVertex2f(1.0,0.0)
  glVertex2f(0.0, 1.0)
  glVertex2f(0.0, -1.0)

  glVertex2f(-1.0,-1.0)
  glVertex2f(1.0, 1.0) 

  glEnd()

  # Store an ordered pair in variables
  x = 0.5
  y = 0.5

  # Plot points in bright red
  glColor3f(1.0, 0.0, 0.0)
  # Increase the point size
  glPointSize(3.0)
  glBegin(GL_POINTS)

  # Plot the point
  glVertex2f(x, y)
  # Plot the mirror image or reflection of the point
  # in the x axis. Note the sign change!
  glVertex2f(x, -y)

  glEnd()
  glFlush()
  # End of plotFunc() 

def main():
  glutInit(sys.argv)
  glutInitDisplayMode(GLUT_SINGLE|GLUT_RGB)
  glutInitWindowSize(500,500)
  glutInitWindowPosition(50,50)
  glutCreateWindow("Plot Points")
  glutDisplayFunc(plotpoints)

  init()
  glutMainLoop()

main()
# End of Program