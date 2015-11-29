class EndlessArray{
	private int count = 0;
	private Object[] array;
	public EndlessArray(){
		count = 0;
	}

	public void add(Object obj)
	{
		count++;
		if(count == 1)
		{
			array = new Object[1];
			array[0] = obj;
		}
		else
		{
			Object[] oldArray = array;
			array = new Object[count];

			for(int i = 0; i < count - 1; i++)
			{
				array[i] = oldArray[i];
			}

			array[count - 1] = obj;
		}
	}

	public void remove(Object obj)
	{
		int indexToRemove = -1;
		for(int i = 0; i < count; i++)
		{
			if(array[i] == obj)
				indexToRemove = i;
		}

		if(indexToRemove == -1) return;

		boolean afterIndexToRemove = false;
		Object[] oldArray = array;
		array = new Object[count - 1];
		for(int i = 0; i < count; i++)
		{
			if(i != indexToRemove){
				if(afterIndexToRemove)
					array[i] = oldArray[i - 1];
				else
					array[i] = oldArray[i];
			} else {
				afterIndexToRemove = true;
			}
		}
		
		count--;
	}

	public Object get(int index)
	{
		if(index < count && index >= 0)
			return array[index];
		else
			return null;
	}

	public int getNumOfObjects(){
		return count;
	}
}
