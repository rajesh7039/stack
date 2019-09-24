#include<iostream>
#include<queue>
using namespace std;
struct node{
    int key;
    node *left;
    node *right;
};
struct node* createNode(int key){
    struct node *node = new struct node();
    node->key = key;
    node->left=NULL;
    node->right=NULL;
    return node;
}
node* search(node* root, int key){
    if(root==NULL)
        return NULL;
        
        queue< node* > q;
        node* out=NULL;
        q.push(root);
        while(!q.empty()){
            node* temp = q.front();
            q.pop();
            
            if(temp->key == key) {out = temp; cout<<"HIT"<<endl;}
            if(temp->left != NULL) q.push(temp->left);
            if(temp->right !=  NULL) q.push(temp->right);
        }
        return out;
        
    
}
int main(){
    node *root = createNode(1);
    root->left = createNode(2);
    root->left->left = createNode(4);
    root->right = createNode(4);
    root->right->left = createNode(5);
    //searching
    node *node = search(root,4);
    cout<<node->key <<endl;
}
