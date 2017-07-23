# Template Method
When we have different algorithms that have similar structures, the Template Method is a good solution. With it, we able to define, at a more macro level, the structure of the algorithm and leave "holes", which will be implemented differently by each of the specific implementations.

In this way, we reuse rather than repeat code, and we facilitate possible evolutions, both of the algorithm in its macro structure, and of the details of the algorithm, since each class has its responsibility quite separate.
