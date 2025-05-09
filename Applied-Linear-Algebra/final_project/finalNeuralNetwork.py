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
W1 = np.random.randn(2, 2)
b1 = np.random.randn(1, 2)
W2 = np.random.randn(2, 1)
b2 = np.random.randn(1, 1)

# Activation functions
def relu(a):
    
def relu_derivative(a):
    
def softmax(a):
    
# Loss function: cross-entropy
def cross_entropy(y_pred, y_true):
    eps = 1e-10
    return -np.mean(np.sum(y_true * np.log(y_pred + eps), axis=1))

# Gradient of loss w.r.t. logits (output preactivation)
def dL_da2(y_pred, y_true):
# Training loop
for epoch in range(10000):
    # Forward pass
        # preactivation hidden layer
            # activation hidden layer
          # preactivation output layer
        # activation output layer (softmax)

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
lr = #Learning Rate
    #Update W1
    #Update b1
    #Update W2
    #update b2

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