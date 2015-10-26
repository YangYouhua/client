package net.easyunion.common.queue;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class MakeQueue implements IMakeQueue {

	private static Queue<Object> queue = new LinkedBlockingQueue<Object>();

	@Override
	public void addQueue(Object obj) {
		queue.add(obj);
	}

	@Override
	public boolean hasQueue() {
		boolean flag = true;
		if (queue.isEmpty()) {
			flag = false;
		}
		return flag;
	}

	@Override
	public Object getQueueHeader() {
		Object obj = queue.peek();
		this.delQueue();
		return obj;
	}

	@Override
	public int queueSize() {
		int queueSize = queue.size();
		return queueSize;
	}

	@Override
	public boolean delQueue() {
		boolean flag = false;
		Object obj = queue.poll();
		if (obj != null) {
			flag = true;
		}
		return flag;
	}

}
