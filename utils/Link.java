package duanyiting.utils;
interface ILink<E>
{
    public void add(E e);
    public int size();
    public boolean isEmpty();
    public Object[] toArray();
    public void set(int index,E data);
    public boolean contains(E data);
    public void remove(E data);
    public void clean();
}
class LinkImpl<E> implements ILink<E>
{
    private Node<E> root;
    private int count;
    private int foot;
    public Object[] returnData;
    private class Node<E>
    {
        private E data;
        private Node<E> next;
        public Node(E data)
        {
            this.data=data;
        }
        public void addNode(Node<E> newNode)
        {
            if (this.next==null)
            {
                this.next=newNode;
            }
            else {
                this.next.addNode(newNode);
            }
        }
        public void toArrayNode()
        {
            LinkImpl.this.returnData[LinkImpl.this.foot++]=this.data;
            if (this.next!=null)
            {
                this.next.toArrayNode();
            }
        }
        public void setNode(int index,E data)
        {
            if (LinkImpl.this.foot++ == index)
            {
                this.data=data;
            }
            else {
                this.next.setNode(index,data);
            }
        }
        public boolean containsNode(E data)
        {
            if (this.data.equals(data))
            {
                return true;
            }
            else {
                return this.next.containsNode(data);
            }
        }
        public void removeNode(Node previous,E data)
        {
            if (this.data.equals(data))
            {
                previous.next=this.next;
            }
            else {
                if (this.next!=null)
                {
                    this.next.removeNode(this,data);
                }
            }
        }
    }
    @Override
    public void add(E e)
    {
        if (e==null)
        {
            return;
        }
        Node<E> newNode=new Node<E>(e);
        if (this.root==null)
        {
            this.root=newNode;
        }
        else{
            this.root.addNode(newNode);
        }
        this.count++;
    }
    @Override
    public int size()
    {
        return this.count;
    }
    @Override
    public boolean isEmpty()
    {
        return this.count==0;
    }
    @Override
    public Object[] toArray()
    {
        if (this.isEmpty())
        {
            throw new NullPointerException("集合内容为空");
        }
        this.foot=0;
        this.returnData=new Object[this.count];
        this.root.toArrayNode();
        return this.returnData;
    }
    @Override
    public void set(int index,E data)
    {
        if (index>=this.count)
        {
            throw new ArrayIndexOutOfBoundsException("不正确的答案索引");
        }
        this.foot=0;
        this.root.setNode(index, data);
    }
    @Override
    public boolean contains(E data)
    {
        if (data==null)
        {
            return false;
        }
        return this.root.containsNode(data);
    }
    @Override
    public void remove(E data)
    {
        if (this.contains(data))
        {
            if (this.root.data.equals(data))
            {
                this.root=this.root.next;
            }
        }
        else {
            this.root.next.removeNode(this.root,data);
        }
        this.count--;
    }
    @Override
    public void clean()
    {
        this.root=null;
        this.count=0;
    }
}
public class Link {
}
