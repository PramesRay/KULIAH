import math
from OpenGL.GL import *  
from OpenGL.GLUT import *  
from OpenGL.GLU import *       
w, h = 1080,720        

def square():  
    glBegin(GL_QUADS)  
    glVertex2f(0, 0)  
    glVertex2f(210, 0) 
    glVertex2f(210, 220)
    glVertex2f(0, 220) 
    glEnd()  

def triangle():
    glBegin(GL_TRIANGLES)
    glVertex2f(220, 0)
    glVertex2f(430, 0)
    glVertex2f(325, 220)
    glEnd()

def circle(x, y, radius, segments):
    glBegin(GL_POLYGON)
    for i in range(segments):
        theta = 2.0 * math.pi * i / segments
        x0 = radius * math.cos(theta)
        y0 = radius * math.sin(theta)
        glVertex2f(x + x0, y + y0)
    glEnd()

# def plotpoints():
#   #First draw x and y axes
#   # Uning black as a color
#   glColor3f(0.0, 0.0, 0.0)
#   glBegin(GL_LINES)
#   glVertex2f(-1.0, 0.0)
#   glVertex2f(1.0,0.0)
#   glVertex2f(0.0, 1.0)
#   glVertex2f(0.0, 1.0)
#   glEnd()

#   # Store an ordered pair in variables
#   x = 0.5
#   y = 0.5

#   # Plot points in bright red 
#   glColor3f(1.0, 0.0, 0.0)

#   # Increase the point size 
#   glPointSize(5.0)
#   glBegin(GL_POINTS)

#   #Plot the point glVertex2f(x, y)
#   #Plot the mirror image or reflection of the point in the x axis. Note the sign change! glVertex2f(x, y)
#   glEnd()
#   glFlush()
# # End of plot Func()

def iterate():  
    glViewport(0, 0, 1080,720)  
    glMatrixMode(GL_PROJECTION)  
    glLoadIdentity()  
    glOrtho(0.0, 720, 0.0, 720, 0.0, 1.0)  
    glMatrixMode (GL_MODELVIEW)  
    glLoadIdentity()  

def showScreen():  
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)  
    glLoadIdentity()  
    iterate()  
    glColor3f(1, 0, 1)
    square()  
    glColor3f(1, 0, 0)
    circle(550, 110, 100, 360)
    glColor3f(0, 1, 0)
    triangle()
    glutSwapBuffers()  


glutInit()  
glutInitDisplayMode(GLUT_RGBA) 
glutInitWindowSize(w, h)   
glutInitWindowPosition(0, 0)   
wind = glutCreateWindow("OpenGL Coding Example") 
glutDisplayFunc(showScreen)  
glutIdleFunc(showScreen) 
glutMainLoop() 
