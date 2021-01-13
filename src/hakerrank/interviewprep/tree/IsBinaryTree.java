//package hakerrank.interviewprep.tree;
//
//}
//
//class TreeHelper{
//
//
//
//    Node convertToTree(int arr[] ,int len , int start ,int end,Node root ){
//
//
//            int mid = (start+end)/2;
//
//            switch(end - start){
//                case 0:
//                     return  new Node(arr[mid]);
//
//                case 1:
//                    root.left = new Node(arr[start]);
//                    root.right = new Node(arr[end]);
//                    return  root;
//
//                default:
//
//                    if(root == null ){
//                        root  =  new Node(arr[mid]);;
//
//                    }
//                    root.left =  convertToTree(arr,len,start,mid-1,null);
//                    root.right =  convertToTree(arr,len,mid+1,end,null);
//                    return  root ;
//
//            }
//    }
//
//
//    Node getbinarytree(int arr[]){
//
//        int mid = arr.length/2;
//        while(start==)
//
//
//
//
//         //    4
//        //  2     6
//        // 1 3    5 7
//        // root  l   rg
//        // 3     2   4
//
//
//
//
//
//    }
//
//
//
//}
//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int  data){
//        this.data = data;
//    }
//
//}
