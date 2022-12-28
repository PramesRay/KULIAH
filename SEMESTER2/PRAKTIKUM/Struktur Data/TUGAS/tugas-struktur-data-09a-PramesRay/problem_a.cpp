#include "problem_a.hpp"

template <typename T>
void BFSTraversal(Tree<T> &Root, vector<T> &traversedData)
{
  if (Root != nullptr)
  {
    if (traversedData.size() == 0)
    {
      traversedData.push_back(Root->data);
    }
    if (Root->left != nullptr)
    {
      traversedData.push_back(Root->left->data);
    }
    if (Root->right != nullptr)
    {
      traversedData.push_back(Root->right->data);
    }
    
    BFSTraversal(Root->left, traversedData);
    BFSTraversal(Root->right, traversedData);
  }
}

template <typename T>
Tree<T> lowestCommonAncestor(Tree<T> &Root, pointer<T> a, pointer<T> b)
{
  if (Root == nullptr)
  {
    return nullptr;
  }
  if (Root->data > a->data && Root->data > b->data)
  {
    return lowestCommonAncestor(Root->left, a, b);
  }
  if (Root->data < a->data && Root->data < b->data)
  { 
    return lowestCommonAncestor(Root->right, a, b);
  }
  return Root;
}

template <typename T>
Tree<T> invertBST(Tree<T> &Root)
{
  if (Root == nullptr)
  {
    return Root;
  }
  else
  {
    Tree<T> temp;

    invertBST(Root->left);
    invertBST(Root->right);

    temp = Root->left;
    Root->left = Root->right;
    Root->right = temp;
    return Root;
  }
}