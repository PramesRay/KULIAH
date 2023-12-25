import matplotlib.pyplot as plt

# Define the endpoints A and B
xA, yA = 10, 10
xB, yB = 16, 15

# Calculate differences and number of steps
dx = xB - xA
dy = yB - yA
N = max(abs(dx), abs(dy))

# Calculate increments
dx /= N
dy /= N

# Initialize the current point
x, y = xA, yA

# List to store the generated points
points = [(x, y)]

# Generate the points using DDA Algorithm
for _ in range(N):
    x += dx
    y += dy
    points.append((round(x), round(y)))

# Extract x and y coordinates from the points
x_coords, y_coords = zip(*points)

# Plot the points
plt.scatter(x_coords, y_coords, color='blue', s=5)  # Adjust size and color as needed
plt.plot(x_coords, y_coords, color='blue')
plt.scatter([xA, xB], [yA, yB], color='red', marker='o')  # Mark endpoints in red
plt.annotate('A(10,10)', (xA, yA), textcoords="offset points", xytext=(0,10), ha='center')
plt.annotate('B(16,15)', (xB, yB), textcoords="offset points", xytext=(0,10), ha='center')

plt.title('DDA Algorithm Line Drawing')
plt.xlabel('X-axis')
plt.ylabel('Y-axis')
plt.grid(True)
plt.show()
