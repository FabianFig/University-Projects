import numpy as np
from sklearn.datasets import load_iris
from sklearn.preprocessing import OneHotEncoder
from sklearn.model_selection import train_test_split

# Load the Iris dataset
data = load_iris()
X = data.data # shape: (150, 4)
y = data.target.reshape(-1, 1) # reshape for encoder

# One-hot encode the labels
encoder = OneHotEncoder(sparse_output=False)
y_encoded = encoder.fit_transform(y) # shape: (150, 3)

# Normalize features (optional)
X = (X - np.mean(X, axis=0)) / np.std(X, axis=0)

# Split into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(
    X, y_encoded, test_size=0.2, random_state=42
)

# Set network dimensions
input_dim = 4 # number of features
hidden_dim = 6 # size of hidden layer
output_dim = 3 # number of classes

# Initialize weights and biases
W1 = np.random.randn(4, 6)
b1 = np.random.randn(1, 6)
W2 = np.random.randn(6, 3)
b2 = np.random.randn(1, 3)

# Activation functions
def relu(a):
    return np.maximum(0, a)

def relu_derivative(a):
    return (a > 0).astype(float)

def softmax(a):
    exp_a = np.exp(a - np.max(a, axis=1, keepdims=True))
    return exp_a / np.sum(exp_a, axis=1, keepdims=True)

# Loss function: cross-entropy
def cross_entropy(y_pred, y_true):
    eps = 1e-10
    return -np.mean(np.sum(y_true * np.log(y_pred + eps), axis=1))

# Gradient of loss w.r.t. logits (output preactivation)
def dL_da2(y_pred, y_true):
    return y_pred - y_true

# Training loop
for epoch in range(10000):
    # Forward pass
    z1 = X_train @ W1 + b1  # preactivation hidden layer
    a1 = relu(z1)           # activation hidden layer
    z2 = a1 @ W2 + b2       # preactivation output layer
    y_pred = softmax(z2)    # activation output layer (softmax)

# Compute loss
loss = cross_entropy(y_pred, y_train)

# Backpropagation
da2 = dL_da2(y_pred, y_train) # dL/da2
dW2 = z1.T @ da2 # dL/dW2
db2 = np.sum(da2, axis=0, keepdims=True)

dz1 = da2 @ W2.T # dL/dz1
da1 = dz1 * relu_derivative(a1) # dL/da1

dW1 = X_train.T @ da1
db1 = np.sum(da1, axis=0, keepdims=True)

# Update parameters
lr = 0.1 #Learning Rate
#Update W1
W2 -= lr * dW2
#Update b1
b2 -= lr * db2
#Update W2
W1 -= lr * dW1
#update b2
b1 -= lr * db1

# Print loss every 10 epochs
if epoch % 100 == 0:
    print(f"Epoch {epoch}, Loss: {loss:.4f}")
# test accuracy evaluation

# Final predictions on test set
a1_test = np.dot(X_test, W1) + b1
z1_test = relu(a1_test)
a2_test = np.dot(z1_test, W2) + b2
z2_test = softmax(a2_test)

# Print predicted vs actual for comparison
print("Final Predicted Output (first 5 samples):")
print(np.round(y_pred[:5], decimals=3)) # Rounded for readability

print("\nTarget Output (first 5 samples):")
print(y_test[:5])