@author Ankit Singh\
GLA university mathura (u.p)

# CircularQueueUsingArray
Full implementation of Circular queue using array.

1. enqueue\
if (rear+1)%max==front,queue is full, overflow;\
if (rear != max-1),means rear pointer is not at last index, increment rear by one.;\
if (front != 0) && (rear=max-1), means rear pointer at last index and first index is empty, rotate rear to 0 index.;\

2. dequeue\
if (front=-1), queue is empty, underflow;\
if (rear==front), only one element, set rear and front to -1;\
if (front==max-1), value will delete from last index, set front to 0;\

3. peek\
print queue[front]\

4. isEmpty\
