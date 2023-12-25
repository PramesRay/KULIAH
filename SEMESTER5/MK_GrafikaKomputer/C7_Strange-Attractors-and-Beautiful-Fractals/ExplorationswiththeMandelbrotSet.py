from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
from numpy import *
import sys

global width
global height
global hcenter
global vcenter
global axrng
global hstep
global vstep
global yinit
global xinit
width = 400
height = 400

def zap():
  global hcenter
  global vcenter
  global axrng
  hcenter = 0.0
  vcenter = 0.0
  axrng = 2.0
  init()

def init():
  # Identify the globals
  global hcenter
  global vcenter
  global axrng
  global hstep
  global vstep
  global yinit
  global xinit
  global yfinal
  global xfinal
  # Set the screen plotting coordinates and the step
  glClearColor(0.0, 0.0, 0.0, 0.0)
  hstep = 2*axrng/(width)
  vstep = 2*axrng/(height)
  yinit = vcenter + axrng
  xinit = hcenter - axrng
  yfinal = vcenter - axrng
  xfinal = hcenter + axrng
  # Fill the entire graphics window!
  glViewport(0, 0, width, height)
  # Set the projection matrix... our "view"
  glMatrixMode(GL_PROJECTION)
  glLoadIdentity()
  # Set the window plot coordinates
  gluOrtho2D(xinit,xfinal,yfinal,yinit)
  # Set the matrix for the object we are drawing
  glMatrixMode(GL_MODELVIEW)
  glLoadIdentity()
  glutPostRedisplay()

def keyboard(key, x, y):
  # Allows us to quit by pressing 'Esc' or 'q'
  if key == chr(27):
    sys.exit()
  if key == "z":
    zap()
  if key == "q":
    sys.exit()

def drawmandel():
  glClear(GL_COLOR_BUFFER_BIT)
  y = yinit
  while y > yfinal:
    y -= vstep
    x = xinit
    while x < xfinal:
      x += hstep
      n = 0
      z = a = complex(x,y)
      # n < 200 is the number of iterations
      # Increase this value to show finer detail
      # However finer detail results in slower execution
      while n < 200:
        n+=1
        z = z**2 + a
        zz = abs(z)
        # zz > 2 is the critical escape value
        # Some functions require larger escape values
        # This zz > 2 conditional provides coloration for
        # points outside the M-Set set
        if zz > 2:
          # Weird colors around the M-Set
          #glColor3f(3*sin(3*z.real),cos(3/z.real),4*cos(zz))
          #glBegin(GL_POINTS)
          #glVertex2f(x,y)
          #glEnd()
          #glFlush()
          n = 5001
      # This zz < 2 conditional provides coloration for
      # points inside the M-Set.
      if zz < 2:
        # Coloration in the M-Set
        #glColor3f(3/sin(3*zz),cos(3*z.real),2*sin(zz))
        glColor3f(0.9, 0.2, 0.5)
        glBegin(GL_POINTS)
        glVertex2f(x,y)
        glEnd()
        glFlush()

def mouse(button, state, x, y):
  global hcenter
  global vcenter
  global axrng
  # Detect the left/right mouse buttons and the click
  # Followed by resetting the origin
  # Left mouse button zooms in, right button zooms out
  if button == GLUT_LEFT_BUTTON and state == GLUT_DOWN:
    axrng = axrng/2
  if button == GLUT_RIGHT_BUTTON and state == GLUT_DOWN:
    axrng = 2*axrng
  if state == GLUT_DOWN:
    hcenter = xinit + (xfinal - xinit)*x/width
    vcenter = yinit + (yfinal - yinit)*y/height
    print(hcenter,vcenter)
    init()

def main():
  glutInit(sys.argv)
  glutInitDisplayMode(GLUT_RGB | GLUT_SINGLE)
  glutInitWindowPosition(50, 50)
  glutInitWindowSize(width, height)
  glutCreateWindow("Mandelbrot Set")
  glutDisplayFunc(drawmandel)
  glutMouseFunc(mouse)
  glutKeyboardFunc(keyboard)
  zap()
  glutMainLoop()
  
main()
