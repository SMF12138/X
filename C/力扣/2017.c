#include <stddef.h>
#include <stdio.h>

typedef struct node{
    char data[20];
    struct node *left,*right;
}BTree;

void algorithm(BTree *root){
    if(root == NULL){
        return;
    };
    
    // 如果是运算符节点（有子节点），需要加括号
    int isOperator = (root->left != NULL || root->right != NULL);
    
    if (isOperator) {
        printf("(");
    }
    
    algorithm(root->left);
    printf("%s", root->data);
    algorithm(root->right);
    
    if (isOperator) {
        printf(")");
    }
}
