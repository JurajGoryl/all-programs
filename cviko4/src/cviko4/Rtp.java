package cviko4;

public class Rtp {
	 private int val;
	    private Rtp next;

	    public Rtp(int val) {
	        this.val = val;
	    }

	    public Rtp getNext() {
	        return next;
	    }

	    public void setNext(Rtp next) {
	        this.next = next;
	    }

	    public int getVal() {
	        return val;
	    }

	    public void setVal(int val) {
	        this.val = val;
	    }

	}

